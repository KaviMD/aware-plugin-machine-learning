package com.aware.plugin.template;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

import com.aware.utils.IContextCard;

public class ContextCard implements IContextCard {

    //Constructor used to instantiate this card
    public ContextCard() {
    }

    private TextView hello = null;

    @Override
    public View getContextCard(Context context) {
        //Load card layout
        Log.i("MLTimer", "Get Card");
        View card = LayoutInflater.from(context).inflate(R.layout.card, null);
        //hello = card.findViewById(R.id.hello);
        hello = (TextView) card.findViewById(R.id.hello);

        //Register the broadcast receiver that will update the UI from the background service (Plugin)
        IntentFilter filter = new IntentFilter(MLTimer.EXTRA_MESSAGE);
        context.registerReceiver(accelerometerObserver, filter);

        //Return the card to AWARE/apps
        return card;
    }

    //This broadcast receiver is auto-unregistered because it's not static.
    private AccelerometerObserver accelerometerObserver = new AccelerometerObserver();
    public class AccelerometerObserver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i("MLTimer", "ContextCard Called");
            if (intent.getAction().equals(MLTimer.EXTRA_MESSAGE)) {
                hello.setText(intent.getStringExtra("data"));
            }
        }
    }
}
