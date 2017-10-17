package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

/**
 * Created by vladimir on 15/10/2017.
 */
public abstract class ElectricalHomeDevice implements Comparable<ElectricalHomeDevice> {
    // indicate either a device is plugged in or no.
    private boolean isSwitched;
    // a device power
    private int devicePower;
    // a device name
    private String deviceName;
    // device's state: On or Off
    private  String state;

    public ElectricalHomeDevice(int devicePower, String deviceName) {
        this.devicePower = devicePower;
        this.isSwitched = false;
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void switchOn() {
        this.isSwitched = true;
        AllTurnedOnElectricalDevices.addDevice(this);
    }

    public void switchOff() {
        this.isSwitched = false;
        AllTurnedOnElectricalDevices.removeDevice(this);
    }

    public boolean isSwitched() {
        return isSwitched;
    }

    public String state(){
        return state = isSwitched()?"On":"Off";
    }

    public int getDevicePower() {
        return devicePower;
    }

    @Override
    public int compareTo(ElectricalHomeDevice electricalHomeDevice) {
        return this.getDevicePower() - electricalHomeDevice.getDevicePower();
    }

    public abstract String toString();
}