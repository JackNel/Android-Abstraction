package com.delta.abstraction;

import java.util.ArrayList;

/**
 * Created by Jack on 7/13/16.
 */
public class Switch {

    private ArrayList<Switchable> switchableThings = new ArrayList();

    public void registerCallback(Switchable thing) {
        switchableThings.add(thing);
    }

    public void unregisterCallback(Switchable thing) {
        switchableThings.remove(thing);
    }

    public void flipSwitchUp() {
        for (Switchable thing : switchableThings) {
            thing.turnOn();
        }
    }

    public void flipSwitchDown() {
        for (Switchable thing : switchableThings) {
            thing.turnOff();
        }
    }
}
