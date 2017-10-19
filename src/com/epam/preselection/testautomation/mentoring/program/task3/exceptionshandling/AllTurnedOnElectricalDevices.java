package com.epam.preselection.testautomation.mentoring.program.task3.exceptionshandling;

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
        if (allTrunedOnDevices.isEmpty()){
            System.out.println("Devices are not found!");
        }else {
            for (ElectricalHomeDevice device : allTrunedOnDevices) {
                System.out.println(device);
            }
        }
        System.out.println();
    }

    //calculate a consumed power by turned devices on
    public static int consumedPower(){
        int consumedPower = 0;
        for (ElectricalHomeDevice device : allTrunedOnDevices){
                consumedPower = Math.addExact(device.getDevicePower(), consumedPower);
        }
        return consumedPower;
    }
}
