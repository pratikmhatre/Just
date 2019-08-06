package com.example.callerid

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import android.telephony.TelephonyManager
import android.util.Log

class MonitorService : Service() {
    val TAG = "MonitorService"
    private lateinit var outgoingCallReceiver: BroadcastReceiver
    private lateinit var stateChangeReceiver: BroadcastReceiver

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.e(TAG, "On Create Service")
        outgoingCallReceiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.e(TAG, "Outgoing Call")
            }
        }
        stateChangeReceiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.e(TAG, "State Changed")
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(outgoingCallReceiver)
    }
}
