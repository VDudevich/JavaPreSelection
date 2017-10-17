package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

/**
 * Created by vladimir on 15/10/2017.
 */
public class Microwave extends ElectricalHomeDevice{

    // volume of the microwave
    private int volume;
    // drvie mode: sensor or manual
    private String driveMode;

    public Microwave(int devicePower, String deviceName){
        super(devicePower, deviceName);
        AllElectricalDevices.addDevice(this);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public String getDriveMode() {
        return driveMode;
    }

    @Override
    public String toString() {
        return "Microwave [" + getDeviceName() + ", Volume = " + getVolume() + ", Drive mode = " + getDriveMode() + ", Power = " + getDevicePower() + ", State = " + state() + "]";
    }
}
