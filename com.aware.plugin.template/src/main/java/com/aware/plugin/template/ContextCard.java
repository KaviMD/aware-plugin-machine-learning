package com.aware.plugin.template;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

import com.aware.utils.IContextCard;

public class ContextCard implements IContextCard {
    /*
    void onCreate (Bundle savedInstanceState) {
        // Get intent, action and MIME type
        Intent intent = detection.getIntent();
        intent = Intent.getIntentOld();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                handleSendText(intent); // Handle text being sent
            }
        }
    }

    void handleSendText(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            // Update UI to reflect text being shared
            String str = "Detection: "+ sharedText;
            hello.setText(str);
        }
    }
    */

    //Constructor used to instantiate this card
    public ContextCard() {
    }

    private TextView hello = null;
    public android.R.string detection;

    @Override
    public View getContextCard(Context context) {
        //Load card layout
        View card = LayoutInflater.from(context).inflate(R.layout.card, null);
        //hello = card.findViewById(R.id.hello);
        hello = (TextView) card.findViewById(R.id.hello);

        //Register the broadcast receiver that will update the UI from the background service (Plugin)
        IntentFilter filter = new IntentFilter("ACCELEROMETER_DATA");
        context.registerReceiver(accelerometerObserver, filter);

        //Return the card to AWARE/apps
        return card;
    }

    //This broadcast receiver is auto-unregistered because it's not static.
    private AccelerometerObserver accelerometerObserver = new AccelerometerObserver();
    public class AccelerometerObserver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("ACCELEROMETER_DATA")) {
                ContentValues data = intent.getParcelableExtra("data");
                //hello.setText(data.toString());
                //hello.setText(CurrentActivity.toString());
                hello.setText("Detection: ");
            }
        }
    }
}
