package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vladimir on 15/10/2017.
 */
public class AllElectricalDevices {

    private static List<ElectricalHomeDevice> allDevices = new ArrayList<>();

    public static void addDevice(ElectricalHomeDevice electricalHomeDevice){
        allDevices.add(electricalHomeDevice);
    }

    // sort by Power
    public static void sortByPower() {
        Collections.sort(allDevices);
    }

    // print all devices
    public static void outputAllDevices() {
        for (ElectricalHomeDevice device: allDevices){
            System.out.println(device);
        }
        System.out.println();
    }

    public static void searchDevicesByParametr(int bottomPower, int topPower){
        List<ElectricalHomeDevice> searchResult = new ArrayList<>();
        for (ElectricalHomeDevice device : allDevices){
            if (device.getDevicePower() >= bottomPower && device.getDevicePower() <= topPower ){
                System.out.println(device);
            }
        }
    }
}
