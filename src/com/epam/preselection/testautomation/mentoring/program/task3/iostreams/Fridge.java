package com.epam.preselection.testautomation.mentoring.program.task3.iostreams;

import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDeviceName;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDevicePower;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidNumberOfCameras;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidVolume;

/**
 * Created by vladimir on 15/10/2017.
 */
public class Fridge extends ElectricalHomeDevice {

    private int volume;
    private int numberOfCameras;

    public Fridge(int devicePower, String deviceName) throws InvalidDeviceName, InvalidDevicePower {
        super(devicePower, deviceName);
        AllElectricalDevices.addDevice(this);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws InvalidVolume {
        if (volume <=0){
            throw new InvalidVolume("Volume must be > 0");
        }
        this.volume = volume;
    }

    public void setNumberOfCameras(int numberOfCamers) throws InvalidNumberOfCameras {
        if (numberOfCamers <=0 || numberOfCamers > 4){
            throw new InvalidNumberOfCameras("Number of cameras should be > 0 or <= 4");
        }
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
