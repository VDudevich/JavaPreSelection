package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

/**
 * Created by vladimir on 15/10/2017.
 */
public class Fridge extends ElectricalHomeDevice{

    private int volume;
    private int numberOfCameras;

    public Fridge(int devicePower, String deviceName){
        super(devicePower, deviceName);
        AllElectricalDevices.addDevice(this);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setNumberOfCameras(int numberOfCamers) {
        this.numberOfCameras = numberOfCamers;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    @Override
    public String toString() {
        return "Fridge [" + getDeviceName() + ", Volume = " + getVolume() + ", Number of cameras = " + getNumberOfCameras() + ", Power = " + getDevicePower() + ", State = " + state() + "]";
    }
}
