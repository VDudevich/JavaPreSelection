package com.epam.preselection.testautomation.mentoring.program.task3.iostreams;

import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDeviceName;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDevicePower;

/**
 * Created by vladimir on 15/10/2017.
 */
public class TvSet extends ElectricalHomeDevice {

    private String resolution;

    public TvSet(int devicePower, String deviceName) throws InvalidDeviceName, InvalidDevicePower {
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
