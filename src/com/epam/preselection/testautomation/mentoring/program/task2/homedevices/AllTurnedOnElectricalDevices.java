package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 15/10/2017.
 */
public class AllTurnedOnElectricalDevices{

    private static List<ElectricalHomeDevice> allTrunedOnDevices = new ArrayList<>();

    public static void addDevice(ElectricalHomeDevice electricalTurnedOnHomeDevice){
        allTrunedOnDevices.add(electricalTurnedOnHomeDevice);
    }

    public static void removeDevice(ElectricalHomeDevice electricalTurnedOnHomeDevice){
        allTrunedOnDevices.remove(electricalTurnedOnHomeDevice);
    }

    // print all turned devices on
    public static void outputAllTrunedOnDevices() {
        for (ElectricalHomeDevice device : allTrunedOnDevices){
                System.out.println(device);
        }
        System.out.println();
    }

    //calculate a consumed power by turned devices on
    public static int consumedPower(){
        int consumedPower = 0;
        for (ElectricalHomeDevice device : allTrunedOnDevices){
            consumedPower += device.getDevicePower();
        }
        return consumedPower;
    }
}
