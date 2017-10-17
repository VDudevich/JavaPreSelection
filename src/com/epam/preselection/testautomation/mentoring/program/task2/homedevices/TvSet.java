package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

/**
 * Created by vladimir on 15/10/2017.
 */
public class TvSet extends ElectricalHomeDevice{

    private String resolution;

    public TvSet(int devicePower, String deviceName){
        super(devicePower, deviceName);
        AllElectricalDevices.addDevice(this);
    }

    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "TV Set [" + getDeviceName() + ", Resolution = " + getResolution() + ", Power = " + getDevicePower() + ", State = " + state() + "]";
    }
}
