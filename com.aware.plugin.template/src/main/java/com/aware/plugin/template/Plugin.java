package com.aware.plugin.template;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

import com.aware.Accelerometer;
import com.aware.Gyroscope;
import com.aware.Aware;
import com.aware.Aware_Preferences;
import com.aware.utils.Aware_Plugin;
import com.aware.Mqtt;
import com.aware.utils.Scheduler;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;

public class Plugin extends Aware_Plugin {

    @Override
    public void onCreate() {
        super.onCreate();

        //This allows plugin data to be synced on demand from broadcast Aware#ACTION_AWARE_SYNC_DATA
        AUTHORITY = Provider.getAuthority(this);

        TAG = "AWARE::"+getResources().getString(R.string.app_name);

        /**
         * Plugins share their current status, i.e., context using this method.
         * This method is called automatically when triggering
         * {@link Aware#ACTION_AWARE_CURRENT_CONTEXT}
         **/
        CONTEXT_PRODUCER = new ContextProducer() {
            @Override
            public void onContext() {
                //Broadcast your context here
            }
        };

        //Add permissions you need (Android M+).
        //By default, AWARE asks access to the #Manifest.permission.WRITE_EXTERNAL_STORAGE

        //REQUIRED_PERMISSIONS.add(Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    /**
     * Allow callback to other applications when data is stored in provider
     */
    private static AWARESensorObserver awareSensor;
    public static void setSensorObserver(AWARESensorObserver observer) {
        awareSensor = observer;
    }
    public static AWARESensorObserver getSensorObserver() {
        return awareSensor;
    }

    public interface AWARESensorObserver {
        void onDataChanged(ContentValues data);
    }

    //This function gets called every 5 minutes by AWARE to make sure this plugin is still running.
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        if (PERMISSIONS_OK) {

            DEBUG = Aware.getSetting(this, Aware_Preferences.DEBUG_FLAG).equals("true");

            //Initialize our plugin's settings
            Aware.setSetting(this, Settings.STATUS_PLUGIN_TEMPLATE, true);

            /*
            //Aware_Preferences.MQTT_SERVER = "m2m.eclipse.org";
            //Aware_Preferences.MQTT_PORT = "1883";
            Intent message = new Intent(Mqtt.ACTION_AWARE_MQTT_MSG_PUBLISH);
            message.putExtra(Mqtt.EXTRA_TOPIC, "kavi/features/");
            message.putExtra(Mqtt.EXTRA_MESSAGE, "hello world");
            sendBroadcast(message);
            android.util.Log.i("Server",Aware_Preferences.MQTT_SERVER);
            android.util.Log.i("Port",Aware_Preferences.MQTT_PORT);
            android.util.Log.i("Topic",Mqtt.EXTRA_TOPIC);
            android.util.Log.i("Message","hello world");


            String test = "Testing";
            byte[] testByte = test.getBytes();

            MqttMessage data = new MqttMessage(testByte);
            try {
                MqttClient Mqtt = new MqttClient("tcp://m2m.eclipse.org", "Phone");
            }
            catch (MqttException e) {
                //Log.e("MqttException","Mqtt Error");
                Log.e("MqttException",e.toString());
                //Log.e("MqttException",e.getCause());
            }
            Mqtt.publish("kavi/features","Testing");
            Log.i("Mqtt","Published Message");
            */

            Aware.setSetting(this,Aware_Preferences.FREQUENCY_ACCELEROMETER,60);
            Aware.setSetting(this,Aware_Preferences.FREQUENCY_GYROSCOPE,60);
            Aware.setSetting(this,Aware_Preferences.FREQUENCY_ACCELEROMETER_ENFORCE,60);
            Aware.setSetting(this,Aware_Preferences.FREQUENCY_GYROSCOPE_ENFORCE,60);
            /*
            double[] data = {-0.00452562985897,0.00360901390974,0.0,0.00749458405116,0.00341637881583,0.0,0.000921145140653,0.00279852546364,0.0,3.33007805688,0.0226682562374,567.0,9.2897210651,0.0138325263965,5103.0,-1.98750092302,0.0138619744779,89.0,0.473013771181,0.71897712136,0.568450167506,0.501529259074,0.456970722023,0.527697246203,0.660247130369,0.53795973555,0.604120814503,0.549047265606,0.515448502141,0.422451706542,0.28916816898,0.28916816898,0.62177798409}; //3
            RandomForestClassifier RFC = new RandomForestClassifier();
            Log.i("Prediction",String.valueOf(RFC.predict(data)));
            */

            /*
            String msg = "Testing Notifications";
            Intent noti = new Intent(this, Notification.class);
            noti.putExtra(Notification.NOTIFICATION_MESSAGE, msg);
            startService(noti);
            */

            /*
            String msg = "Starting Twenty";
            Intent noti = new Intent(this, Twenty.class);
            noti.putExtra(Twenty.PREDICTION, msg);
            startService(noti);
            Log.i("Plugin", "Started Twenty");
            */

            /*
            Intent test = new Intent();
            test.setAction(Notification.SEND_NOTIFICATION);
            test.putExtra(Notification.NOTIFICATION_MESSAGE, "Test String");
            sendBroadcast(test);
            */

            MLTimer timer = new MLTimer();
            timer.startTimer(this);
            //Initialise AWARE instance in plugin
            Aware.startAWARE(this);
            Log.w("Plugin","Started Timer");
        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        //Turn off the sync-adapter if part of a study
        if (Aware.isStudy(this) && (getApplicationContext().getPackageName().equalsIgnoreCase("com.aware.phone") || getApplicationContext().getResources().getBoolean(R.bool.standalone))) {
            ContentResolver.setSyncAutomatically(Aware.getAWAREAccount(this), Provider.getAuthority(this), false);
            ContentResolver.removePeriodicSync(
                    Aware.getAWAREAccount(this),
                    Provider.getAuthority(this),
                    Bundle.EMPTY
            );
        }

        Aware.setSetting(this, Settings.STATUS_PLUGIN_TEMPLATE, false);

        //Stop AWARE instance in plugin
        Aware.stopAWARE(this);
    }
}
