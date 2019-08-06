package com.example.callerid;

import android.content.Context;
import android.util.Log;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver {
    String TAG = "CallReceiver";

    @Override
    protected void onIncomingCallStarted(Context ctx, String number, Date start) {
        Log.e(TAG, "onIncomingCallStarted");
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        Log.e(TAG, "onIncomingCallStarted");
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        Log.e(TAG, "onIncomingCallStarted");
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
        Log.e(TAG, "onIncomingCallStarted");
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
        Log.e(TAG, "onIncomingCallStarted");
    }

}