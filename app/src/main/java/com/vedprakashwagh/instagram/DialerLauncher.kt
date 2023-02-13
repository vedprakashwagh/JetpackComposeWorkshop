package com.vedprakashwagh.instagram

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class DialerLauncher : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.startActivity(Intent(context, MainActivity::class.java))
    }

}