package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Jack on 7/13/16.
 */
public class Fan extends Device {

    public Fan() {
        setDeviceName("Fan");
    }

    public void turnOn() {
        Log.e(getDeviceName(), "Ahhh, cool breeze!");
    }

    public void turnOff() {
        Log.e(getDeviceName(), "It's a little chilly for the fan!");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "Noooo! the fan just broke and it's hot.");
    }
}
