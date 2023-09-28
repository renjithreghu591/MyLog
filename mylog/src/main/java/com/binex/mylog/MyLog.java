package com.binex.mylog;

import android.util.Log;

public class MyLog {
    public String TAG = "mylog";
    public void print(String logMsg) {
        Log.d(TAG, logMsg);
    }

    public void print(double logMsg) {
        Log.d(TAG, logMsg + "");
    }

    public void print(boolean logMsg) {
        Log.d(TAG, logMsg + "");
    }

    public void print(long logMsg) {
        Log.d(TAG, logMsg + "");
    }

    public void print(int logMsg) {
        Log.d(TAG, logMsg + "");
    }
}
