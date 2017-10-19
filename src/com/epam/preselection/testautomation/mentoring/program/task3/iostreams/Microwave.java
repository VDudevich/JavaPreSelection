package com.epam.preselection.testautomation.mentoring.program.task3.iostreams;

import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDeviceName;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidDevicePower;
import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.InvalidVolume;

/**
 * Created by vladimir on 15/10/2017.
 */
public class Microwave extends ElectricalHomeDevice {

    // volume of the microwave
    private int volume;
    // drvie mode: sensor or manual
    private String driveMode;

    public Microwave(int devicePower, String deviceName) throws InvalidDeviceName, InvalidDevicePower {
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
