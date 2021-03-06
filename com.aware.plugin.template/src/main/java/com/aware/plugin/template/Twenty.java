package com.aware.plugin.template;

import android.app.Activity;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by kavidey on 3/6/18.
 */

public class Twenty extends IntentService {
    //MyServiceReceiver myServiceReceiver = new MyServiceReceiver();
    final static String RECEIVE_PREDICTION = "RECEIVE_PREDICTION";
    final static String PREDICTION = "PREDICTION";
    // Context to store context from Plugin.java
    Context context;

    // List to store detected classes
    private ArrayList<Integer> detections = new ArrayList<>();

    // Integers to store how many times each class was detected
    private int sitting = 0;
    private int standing = 0;
    private int walking = 0;
    private int running = 0;

    // Integers to store how many times in a row each class was detected
    private int timeSitting = 0;
    private int timeStanding = 0;
    private int timeWalking = 0;
    private int timeRunning = 0;

    // Integer to store how many times detections were made
    int row = 0;

    // Integer to store what the previous detection was
    private int prevDetection = 0;

    // Boolean to store if the list is full
    boolean full = false;

    // Integer to store how many times sitting was detected after 20 minutes
    private int changed = 0;

    // Integer to store when the next prediction should be made
    private int notificationTime = 0;


    public Twenty() {
        super("Twenty");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        //unregisterReceiver(myServiceReceiver);
        //Log.i("Twenty", "Unregistered Receiver");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter filter = new IntentFilter();
        filter.addAction(RECEIVE_PREDICTION);
        //registerReceiver(myServiceReceiver, filter);
        //Log.i("Twenty", "Registered Receiver");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //Log.i("Twenty", "Started");
        // Normally we would do some work here, like download a file.
        // For our sample, we just sleep for 5 seconds.
        try {
            Integer detection = intent.getIntExtra(PREDICTION, 0);
            String[] Classes = {"Sitting","Standing","Walking","Running"};
            String activity = Classes[detection];
            updateDetections(detection);
            //Thread.sleep(5000);
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.ic_launcher)
                            .setContentTitle("Twenty")
                            .setContentText(activity);
            int NOTIFICATION_ID = 12345;

            Intent targetIntent = new Intent(this, Plugin.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this, 0, targetIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(contentIntent);
            NotificationManager nManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            //nManager.notify(NOTIFICATION_ID, builder.build());
            //Log.i("Twenty", "Test Notification Sent");
        } catch (Exception e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }

    // Method called from instance that updates the detections and makes notifications if necessary
    public void updateDetections(int detection) {
        // If the array isn't full
        if(!full) {
            // Update the list, single variables, and check if a notification is necessary
            detections.add(detection);
            updateVars(detection);
            checkNotifications();
            //notifyAction("Test");
            //createNotification("Test", "Test");
            //Toast.makeText(context, detection, Toast.LENGTH_LONG).show();
        } // if the array is full
        else {
            // Update the list, single variables
            detections.add(detection);
            updateVars(detection);
            // Remove the fist item of the list
            removeFirst();
            // make any necessary notifications
            checkNotifications();
        }

        // Update row
        row++;

        // If row is large enough
        if(row>239) {
            // Set the array to full and row to 0
            full = true;
            row = 0;
        }

        // Update the prevDetection
        prevDetection = detection;
    }

    // Private Method to check if a notifications need to be made and if so make them
    private void checkNotifications() {
        // Update the time until the next notification
        notificationTime++;

        // If sitting was detected for longer than 16 minutes increase changed
        if(sitting > 200) {
            changed++;
        } // Otherwise
        else {
            // If changed is greater than 0
            if(changed > 0) {
                // If a different activity was detected for more than 30 seconds
                if(timeStanding+timeRunning+timeWalking > 6) {
                    changed = 0;
                    notificationTime = 0;
                }
            }
        }

        if(notificationTime > 4) {
            if (changed > 1000) {
                //System.out.println("Severity 4");
                notification(4);
            } else if (changed > 200) {
                //System.out.println("Severity 3");
                notification(3);
            } else if (changed > 100) {
                //System.out.println("Severity 2");
                notification(2);
            } else if (changed > 25) {
                //System.out.println("Severity 1");
                notification(1);
            } else if (changed > 0) {
                //System.out.println("Severity 0");
                notification(0);
            }
        }

        if(notificationTime > 4) {
            notificationTime = 0;
        }
    }

    private void updateVars(int value) {
        switch (value) {
            case 0:
                if(prevDetection == value) {
                    timeSitting = timeSitting + 1;
                } else {
                    timeSitting = 0;
                }
                sitting = sitting + 1;
                break;
            case 1:
                if(prevDetection == value) {
                    timeStanding = timeStanding + 1;
                } else {
                    timeStanding = 0;
                }
                standing = standing + 1;
                break;
            case 2:
                if(prevDetection == value) {
                    timeWalking = timeWalking + 1;
                } else {
                    timeWalking = 0;
                }
                walking = walking + 1;
                break;
            case 3:
                if(prevDetection == value) {
                    timeRunning = timeRunning + 1;
                } else {
                    timeRunning = 0;
                }
                running = running + 1;
                break;
        }
    }

    private void notification(int severity) {
        String message = "Nothing... Sorry";
        switch (severity) {
            case 0:
                message = ("You should do something else soon");
                break;
            case 1:
                message = ("Now would be a nice time to getup and do something else");
                break;
            case 2:
                message = ("You REALLY should go and do something else");
                break;
            case 3:
                message = ("YOU NEED TO DO SOMETHING ELSE NOW");
                break;
            case 4:
                message = ("GO AND FIND A DIFFERENT ACTIVITY TO DO INSTEAD OF BEING A LITERAL LUMP");                                      //message = ("GO AND F***ING DO SOMETHING ELSE. HOW STUPID ARE YOU.");
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        notifyAction(message);
    }

    public void notifyAction(String message) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Follow the 20/20/20 Rule")
                .setContentText(message);
        int NOTIFICATION_ID = 12345;

        Intent targetIntent = new Intent(this, Plugin.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, targetIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);
        NotificationManager nManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nManager.notify(NOTIFICATION_ID, builder.build());
    }

    private void removeFirst() {
        int activity = detections.get(0);
        switch (activity) {
            case 0:
                sitting = sitting - 1;
                break;
            case 1:
                standing = standing - 1;
                break;
            case 2:
                walking = walking - 1;
                break;
            case 3:
                running = running - 1;
                break;
        }
        detections.remove(0);
    }
    /*
    public void sendNotification(View view, String title, String message) {

        //Get an instance of NotificationManager//

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setContentTitle(title)
                        .setContentText(message);


        // Gets an instance of the NotificationManager service//

        NotificationManager mNotificationManager =

                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        // When you issue multiple notifications about the same type of event,
        // it’s best practice for your app to try to update an existing notification
        // with this new information, rather than immediately creating a new notification.
        // If you want to update this notification at a later date, you need to assign it an ID.
        // You can then use this ID whenever you issue a subsequent notification.
        // If the previous notification is still visible, the system will update this existing notification,
        // rather than create a new one. In this example, the notification’s ID is 001//

        NotificationManager.notify().

                mNotificationManager.notify(001, mBuilder.build());
    }
    */
    public void setContext(Context cnxt) {
        context = cnxt;
    }
    /*
    public class MyServiceReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(action.equals(RECEIVE_PREDICTION)){
                String msg = intent.getStringExtra(PREDICTION);
                Integer pred = intent.getIntExtra(PREDICTION,1);
                updateDetections(pred);
                Log.i("Twenty","Received Prediction");
            }
        }
    }
    */

}
