package com.aware.plugin.template;

/**
 * Created by kavidey on 1/6/18.
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.aware.Accelerometer;
import com.aware.Aware;
import com.aware.Aware_Preferences;
import com.aware.providers.Accelerometer_Provider.Accelerometer_Data;
import com.aware.providers.Gyroscope_Provider.Gyroscope_Data;
import com.aware.utils.Aware_Plugin;


public class MLTimer extends Activity {
    public static int CurrentActivity;
    Timer timer;
    TimerTask timerTask;
    public static Plugin plugin;
    Context context;

    //we are going to use a handler to be able to run in our TimerTask
    final Handler handler = new Handler();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
    }

    @Override

    protected void onResume() {
        super.onResume();

        //onResume we start our timer so it can start when the app comes from the background
        startTimer(context);
    }

    public void startTimer(Context ctxt) {
        //set a new Timer
        timer = new Timer();
        context = ctxt;
        //initialize the TimerTask's job
        initializeTimerTask();

        //schedule the timer, after the first 5000ms the TimerTask will run every 10000ms
        timer.schedule(timerTask, 5000, 4200); //
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
                        //plugin.onCreate();
                        /*
                        //prev 2 pred 0
                        //double[] data = {-0.0111433384156,0.00524268965119,0.0,-9.73836064256e-05,0.00366190564069,0.0,-0.0102259879193,0.00374151711499,0.0,5.22359702701,0.0238140477038,1575.0,1.29067422662,0.0244133409232,63.0,-9.1720347026,0.0232657934503,5103.0,0.816609090371,0.838160914933,0.385596346037,0.679250478237,0.670443859365,0.740946611069,0.416707427718,0.605149748379,0.61199146584,0.385639027888,0.673027192123,0.691831490885,0.278876078939,0.278876078939,0.707055882162};//2
                        double[] data = {-0.00452562985897,0.00360901390974,0.0,0.00749458405116,0.00341637881583,0.0,0.000921145140653,0.00279852546364,0.0,3.33007805688,0.0226682562374,567.0,9.2897210651,0.0138325263965,5103.0,-1.98750092302,0.0138619744779,89.0,0.473013771181,0.71897712136,0.568450167506,0.501529259074,0.456970722023,0.527697246203,0.660247130369,0.53795973555,0.604120814503,0.549047265606,0.515448502141,0.422451706542,0.28916816898,0.28916816898,0.62177798409}; //3
                        RandomForestClassifier RFC = new RandomForestClassifier();
                        Log.i("Prediction",String.valueOf(RFC.predict(data)));
                        Log.i("Correct Prediction","0");

                        double[] data1 = {-0.00452562985897,0.00360901390974,0.0,0.00749458405116,0.00341637881583,0.0,0.000921145140653,0.00279852546364,0.0,3.33007805688,0.0226682562374,567.0,9.2897210651,0.0138325263965,5103.0,-1.98750092302,0.0138619744779,89.0,0.473013771181,0.71897712136,0.568450167506,0.501529259074,0.456970722023,0.527697246203,0.660247130369,0.53795973555,0.604120814503,0.549047265606,0.515448502141,0.422451706542,0.28916816898,0.28916816898,0.62177798409}; //3
                        Log.i("Prediction",String.valueOf(RFC.predict(data1)));
                        Log.i("Correct Prediction","1");

                        double[] data2 = {-0.00452562985897,0.00360901390974,0.0,0.00749458405116,0.00341637881583,0.0,0.000921145140653,0.00279852546364,0.0,3.33007805688,0.0226682562374,567.0,9.2897210651,0.0138325263965,5103.0,-1.98750092302,0.0138619744779,89.0,0.473013771181,0.71897712136,0.568450167506,0.501529259074,0.456970722023,0.527697246203,0.660247130369,0.53795973555,0.604120814503,0.549047265606,0.515448502141,0.422451706542,0.28916816898,0.28916816898,0.62177798409}; //3
                        Log.i("Prediction",String.valueOf(RFC.predict(data2)));
                        Log.i("Correct Prediction","2");

                        double[] data3 = {-0.00452562985897,0.00360901390974,0.0,0.00749458405116,0.00341637881583,0.0,0.000921145140653,0.00279852546364,0.0,3.33007805688,0.0226682562374,567.0,9.2897210651,0.0138325263965,5103.0,-1.98750092302,0.0138619744779,89.0,0.473013771181,0.71897712136,0.568450167506,0.501529259074,0.456970722023,0.527697246203,0.660247130369,0.53795973555,0.604120814503,0.549047265606,0.515448502141,0.422451706542,0.28916816898,0.28916816898,0.62177798409}; //3
                        Log.i("Prediction",String.valueOf(RFC.predict(data3)));
                        Log.i("Correct Prediction","3");
                        CurrentActivity = RFC.predict(data);
                        Log.i("Current Activity", String.valueOf(CurrentActivity));
                        */
                        long unixTime = System.currentTimeMillis();
                        Log.i("timestamp",String.valueOf(unixTime));

                        int time = 4200;
                        time = 5000;

                        String selector = "timestamp > "+ String.valueOf((unixTime - time));
                        selector = "_id > 1";
                        Log.i("selector",selector);

                        String sortOrder = "timestamp DESC"; //ASC or DESC

                        double[][] data = new double[6][63];
                        double[] features = new double[33];

                        Cursor accelerometer_data = context.getContentResolver().query(Accelerometer_Data.CONTENT_URI, null, selector, null, sortOrder);//DESC
                        Cursor gyroscope_data = context.getContentResolver().query(Gyroscope_Data.CONTENT_URI, null, selector, null, sortOrder);//DESC

                        accelerometer_data.moveToFirst();
                        gyroscope_data.moveToFirst();

                        int row = 0;
                        do {
                            double ax = accelerometer_data.getDouble(accelerometer_data.getColumnIndex(Accelerometer_Data.VALUES_0));
                            double ay = accelerometer_data.getDouble(accelerometer_data.getColumnIndex(Accelerometer_Data.VALUES_1));
                            double az = accelerometer_data.getDouble(accelerometer_data.getColumnIndex(Accelerometer_Data.VALUES_2));
                            double gx = gyroscope_data.getDouble(gyroscope_data.getColumnIndex(Gyroscope_Data.VALUES_0));
                            double gy = gyroscope_data.getDouble(gyroscope_data.getColumnIndex(Gyroscope_Data.VALUES_1));
                            double gz = gyroscope_data.getDouble(gyroscope_data.getColumnIndex(Gyroscope_Data.VALUES_2));
                            data[0][row] = ax;
                            data[1][row] = ay;
                            data[2][row] = az;
                            data[3][row] = gx;
                            data[4][row] = gy;
                            data[5][row] = gz;
                            row++;
                        } while (accelerometer_data.moveToNext() && row < 63);
                        /*
                        for(int i=0;i<63;i++) {
                            double ax = Double.valueOf(Accelerometer_Provider.Accelerometer_Data.VALUES_0);
                            double ay = Double.valueOf(Accelerometer_Provider.Accelerometer_Data.VALUES_1);
                            double az = Double.valueOf(Accelerometer_Provider.Accelerometer_Data.VALUES_2);
                            double gx = Double.valueOf(Gyroscope_Provider.Gyroscope_Data.VALUES_0);
                            double gy = Double.valueOf(Gyroscope_Provider.Gyroscope_Data.VALUES_1);
                            double gz = Double.valueOf(Gyroscope_Provider.Gyroscope_Data.VALUES_2);
                            data[0][i] = ax;
                            data[1][i] = ay;
                            data[2][i] = az;
                            data[3][i] = gx;
                            data[4][i] = gy;
                            data[4][i] = gz;
                            SystemClock.sleep(60);
                        }
                        */
                        features[0] = FeatureMath.Mean(data[0]);
                        features[1] = FeatureMath.STD(data[0]);
                        features[2] = FeatureMath.Energy(data[0],63);
                        features[3] = FeatureMath.Mean(data[1]);
                        features[4] = FeatureMath.STD(data[1]);
                        features[5] = FeatureMath.Energy(data[1],63);
                        features[6] = FeatureMath.Mean(data[2]);
                        features[7] = FeatureMath.STD(data[2]);
                        features[8] = FeatureMath.Energy(data[2],63);
                        features[9] = FeatureMath.Mean(data[3]);
                        features[10] = FeatureMath.STD(data[3]);
                        features[11] = FeatureMath.Energy(data[3],63);
                        features[12] = FeatureMath.Mean(data[4]);
                        features[13] = FeatureMath.STD(data[4]);
                        features[14] = FeatureMath.Energy(data[4],63);
                        features[15] = FeatureMath.Mean(data[5]);
                        features[16] = FeatureMath.STD(data[5]);
                        features[17] = FeatureMath.Energy(data[5],63);

                        features[18] = FeatureMath.Correlation(data[3],data[4]);
                        features[19] = FeatureMath.Correlation(data[3],data[5]);
                        features[20] = FeatureMath.Correlation(data[3],data[0]);
                        features[21] = FeatureMath.Correlation(data[3],data[1]);
                        features[22] = FeatureMath.Correlation(data[3],data[2]);

                        features[23] = FeatureMath.Correlation(data[4],data[5]);
                        features[24] = FeatureMath.Correlation(data[4],data[0]);
                        features[25] = FeatureMath.Correlation(data[4],data[1]);
                        features[26] = FeatureMath.Correlation(data[4],data[2]);

                        features[27] = FeatureMath.Correlation(data[5],data[0]);
                        features[28] = FeatureMath.Correlation(data[5],data[1]);
                        features[29] = FeatureMath.Correlation(data[5],data[2]);

                        features[30] = FeatureMath.Correlation(data[0],data[1]);
                        features[31] = FeatureMath.Correlation(data[0],data[2]);

                        features[32] = FeatureMath.Correlation(data[1],data[2]);

                        String prediction = RandomForestClassifier.predict(features);
                        Log.i("Detected Activity",prediction);
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                        sendIntent.setType("text/plain");
                        //context.startActivity(Intent.createChooser(sendIntent, context.getResources().getText(R.string.detection)));
                        //context.sendBroadcast(new Intent("ACCELEROMETER_DATA").putExtra("data", prediction));
                        /*
                        TextView hello = null;
                        View card = LayoutInflater.from(context).inflate(R.layout.card, null);
                        hello = (TextView) card.findViewById(R.id.hello);
                        hello.setText(prediction);
                        */


                        /*
                        features.append([ID, windowSize, mean(gyro1), statistics.stdev(gyro1), energy(gyro1, j),
                                mean(gyro2), statistics.stdev(gyro2), energy(gyro2, j),
                                mean(gyro3), statistics.stdev(gyro3), energy(gyro3, j),
                                mean(accel1), statistics.stdev(accel1), energy(accel1, j),
                                mean(accel2), statistics.stdev(accel2), energy(accel2, j),
                                mean(accel3), statistics.stdev(accel3), energy(accel3, j),
                                correlation(gyro1,gyro2), correlation(gyro1,gyro3),
                                correlation(gyro1,accel1), correlation(gyro1,accel2),
                                correlation(gyro1,accel3),
                                correlation(gyro2,gyro3), correlation(gyro2,accel1),
                                correlation(gyro2,accel2), correlation(gyro2,accel3),
                                correlation(gyro3,accel1), correlation(gyro3,accel2),
                                correlation(gyro3,accel3),
                                correlation(accel1,accel2), correlation(accel1,accel2),
                                correlation(accel2,accel3), label])
                                */

                    }
                });
            }
        };
    }
}

