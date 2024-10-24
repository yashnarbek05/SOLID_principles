package org.example.switch_manager_for_D;

public class Switch{
    private Switchable device;

    public Switch(Switchable switchable) {
        this.device = switchable;
    }

    public void operator(){
        device.turnOn();
    }
}
