package com.delta.abstraction;

/**
 * Created by Jack on 7/13/16.
 */
public abstract class Device implements Switchable {

    protected String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void breakDevice();
}
