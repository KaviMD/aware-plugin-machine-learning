package com.aware.plugin.template;

/**
 * Created by kavidey on 1/6/18.
 */


import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.content.Intent;

import com.aware.Accelerometer;
import com.aware.Gyroscope;
import com.aware.providers.Accelerometer_Provider;
import com.aware.providers.Gyroscope_Provider;


public class MLTimer {
    public static Semaphore available = new Semaphore(1,true);
    public static final String EXTRA_MESSAGE = "com.aware.machine-learning.MESSAGE";
    //View view;
    public static int CurrentActivity;
    Timer timer;
    TimerTask timerTask;
    public static Plugin plugin;
    Context context;
    //Twenty rule = new Twenty();

    //we are going to use a handler to be able to run in our TimerTask
    final Handler handler = new Handler();

    public void sendMessage(String detection){
        Log.i("MLTimer", "Sending Message");
        Intent intent = new Intent();
        intent.setAction(EXTRA_MESSAGE);
        intent.putExtra("data",detection);
        context.sendBroadcast(intent);
    }

    public void startTimer(Context ctxt) {
        //set a new Timer
        timer = new Timer();
        context = ctxt;
        //rule.setContext(context);
        //initialize the TimerTask's job
        initializeTimerTask();

        //schedule the timer, after the first 0ms the TimerTask will run every 5000ms
        timer.schedule(timerTask, 0, 5000);
    }

    public void stoptimertask(View v) {
        //stop the timer, if it's not already null
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public void initializeTimerTask() {

        timerTask = new TimerTask() {
            public void run() {

                //use a handler to run a toast that shows the current timestamp
                handler.post(new Runnable() {
                    public void run() {
                        MyReciver myReciver = new MyReciver();

                        IntentFilter broadcastFilter = new IntentFilter();
                        broadcastFilter.addAction(Accelerometer.ACTION_AWARE_ACCELEROMETER);
                        broadcastFilter.addAction(Gyroscope.ACTION_AWARE_GYROSCOPE);
                        context.registerReceiver(myReciver, broadcastFilter);
                        //sendMessage("Prediction:");
                    }
                });
            }
        };
    }

    public void makePrediction(MyReciver myReciver) {
        double[] features = new double[33];
        final double[][] data = new double[6][63];

        ContentValues[] accValues = myReciver.accValues;
        ContentValues[] gyroValues = myReciver.gyroValues;
        context.unregisterReceiver(myReciver);
        int row = 0;

        for(ContentValues accValue: accValues) {
            double ax = accValue.getAsDouble(Accelerometer_Provider.Accelerometer_Data.VALUES_0);
            double ay = accValue.getAsDouble(Accelerometer_Provider.Accelerometer_Data.VALUES_1);
            double az = accValue.getAsDouble(Accelerometer_Provider.Accelerometer_Data.VALUES_2);

            data[0][row] = ax;
            data[1][row] = ay;
            data[2][row] = az;

            row++;
        }

        row = 0;

        for(ContentValues gyroValue: gyroValues) {
            double gx = gyroValue.getAsDouble(Gyroscope_Provider.Gyroscope_Data.VALUES_0);
            double gy = gyroValue.getAsDouble(Gyroscope_Provider.Gyroscope_Data.VALUES_1);
            double gz = gyroValue.getAsDouble(Gyroscope_Provider.Gyroscope_Data.VALUES_2);

            data[3][row] = gx;
            data[4][row] = gy;
            data[5][row] = gz;

            row++;
        }

        features[0] = FeatureMath.Mean(data[0]);
        features[1] = FeatureMath.STD(data[0]);
        features[2] = FeatureMath.Energy(data[0], 63);
        features[3] = FeatureMath.Mean(data[1]);
        features[4] = FeatureMath.STD(data[1]);
        features[5] = FeatureMath.Energy(data[1], 63);
        features[6] = FeatureMath.Mean(data[2]);
        features[7] = FeatureMath.STD(data[2]);
        features[8] = FeatureMath.Energy(data[2], 63);
        features[9] = FeatureMath.Mean(data[3]);
        features[10] = FeatureMath.STD(data[3]);
        features[11] = FeatureMath.Energy(data[3], 63);
        features[12] = FeatureMath.Mean(data[4]);
        features[13] = FeatureMath.STD(data[4]);
        features[14] = FeatureMath.Energy(data[4], 63);
        features[15] = FeatureMath.Mean(data[5]);
        features[16] = FeatureMath.STD(data[5]);
        features[17] = FeatureMath.Energy(data[5], 63);

        features[18] = FeatureMath.Correlation(data[3], data[4]);
        features[19] = FeatureMath.Correlation(data[3], data[5]);
        features[20] = FeatureMath.Correlation(data[3], data[0]);
        features[21] = FeatureMath.Correlation(data[3], data[1]);
        features[22] = FeatureMath.Correlation(data[3], data[2]);

        features[23] = FeatureMath.Correlation(data[4], data[5]);
        features[24] = FeatureMath.Correlation(data[4], data[0]);
        features[25] = FeatureMath.Correlation(data[4], data[1]);
        features[26] = FeatureMath.Correlation(data[4], data[2]);

        features[27] = FeatureMath.Correlation(data[5], data[0]);
        features[28] = FeatureMath.Correlation(data[5], data[1]);
        features[29] = FeatureMath.Correlation(data[5], data[2]);

        features[30] = FeatureMath.Correlation(data[0], data[1]);
        features[31] = FeatureMath.Correlation(data[0], data[2]);

        features[32] = FeatureMath.Correlation(data[1], data[2]);

        int prediction = RandomForestClassifier.predict(features);
        String predictionStr = RandomForestClassifier.getString(prediction);
        Log.i("MLTimer", "Detected Activity: "+prediction);
        sendMessage(predictionStr);
        //rule.updateDetections(prediction);
        /*
        Intent noti = new Intent();
        noti.setAction(Twenty.RECEIVE_PREDICTION);
        noti.putExtra(Twenty.PREDICTION, prediction);
        context.sendBroadcast(noti);
        */

        Intent noti = new Intent(context, Twenty.class);
        noti.putExtra(Twenty.PREDICTION, prediction);
        context.startService(noti);

        Log.i("Plugin", "Started Twenty");
        Log.i("MLTimer","Plugin: Complete");

    }

    public class MyReciver extends BroadcastReceiver{
        public int accIndex = 0;
        public int gyroIndex = 0;
        public ContentValues[] accValues = new ContentValues[63];
        public ContentValues[] gyroValues = new ContentValues[63];
        private long accTimestamp = -1;
        private long gyroTimestamp = -1;

        @Override
        public void onReceive(Context context, Intent intent) {
            ContentValues rowData = (ContentValues) intent.getExtras().get("data");
            if(intent.getAction().equals(Accelerometer.ACTION_AWARE_ACCELEROMETER) && accIndex < 63) {
                try {
                    available.acquire();
                    long currentAccTimestamp = rowData.getAsLong(Accelerometer_Provider.Accelerometer_Data.TIMESTAMP);
                    if (accTimestamp == -1 || accTimestamp != currentAccTimestamp) {
                        accTimestamp = currentAccTimestamp;
                        accValues[accIndex] = rowData;
                        Log.i("MLTimer", "Acc: " + rowData.toString());
                        accIndex++;
                    }
                } catch (Exception e) {}
                available.release();
            } else if(intent.getAction().equals(Gyroscope.ACTION_AWARE_GYROSCOPE) && gyroIndex < 63){
                try {
                    available.acquire();
                    long currentGyroTimestamp = rowData.getAsLong(Gyroscope_Provider.Gyroscope_Data.TIMESTAMP);
                    if (gyroTimestamp == -1 || gyroTimestamp != currentGyroTimestamp) {
                        gyroTimestamp = currentGyroTimestamp;
                        gyroValues[gyroIndex] = rowData;
                        Log.i("MLTimer", "Gyro: " + rowData.toString());
                        gyroIndex++;
                    }
                } catch (Exception e) {}
                available.release();
            }
            if(accIndex >= 63 && gyroIndex >=  63) {
                makePrediction(this);
            }
        }
    }
}

