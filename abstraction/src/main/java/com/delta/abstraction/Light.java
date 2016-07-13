package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Jack on 7/13/16.
 */
public class Light extends Device {

    public void turnOn() {
        Log.e(getDeviceName(), "I can see!");
    }

    public void turnOff() {
        Log.e(getDeviceName(), "It's too bright outside for the light to be on" );
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "It's dark and I can't see because the light broke");
    }
}
