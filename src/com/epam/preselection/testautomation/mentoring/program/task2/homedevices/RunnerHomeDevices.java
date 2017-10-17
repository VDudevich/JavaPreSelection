package com.epam.preselection.testautomation.mentoring.program.task2.homedevices;

/**
 * Created by vladimir on 15/10/2017.
 */
public class RunnerHomeDevices {

    public static void main(String[] args) {
        int bottomPower = 850;
        int topPower = 2499;
        Microwave microwave = new Microwave(2200, "Samsung");
        microwave.setVolume(21);
        microwave.setDriveMode("Sensor");

        TvSet smallTvSet = new TvSet(500, "LG");
        smallTvSet.switchOn();
        smallTvSet.setResolution("1920x1080");

        Fridge oneCamereFridge = new Fridge(1500, "Atlant");
        oneCamereFridge.setVolume(180);
        oneCamereFridge.setNumberOfCameras(1);

        TvSet bigTvSet = new TvSet(850, "Samsung");
        bigTvSet.setResolution("4K");

        Fridge twoCamereFridge = new Fridge(2500, "Indezit");
        twoCamereFridge.switchOn();
        twoCamereFridge.setVolume(270);
        twoCamereFridge.setNumberOfCameras(2);

        System.out.println("All devices at home:");
        AllElectricalDevices.outputAllDevices();
        System.out.println("All turned devices on at home:");
        AllTurnedOnElectricalDevices.outputAllTrunedOnDevices();
        System.out.print("A consumed power by turned devices on: " + AllTurnedOnElectricalDevices.consumedPower() + " Watt");
        System.out.println();
        System.out.println();
        System.out.println("All devices at home sorted by power:");
        AllElectricalDevices.sortByPower();
        AllElectricalDevices.outputAllDevices();
        System.out.println("Devices with power greater than or equal to " + bottomPower + " and less than or equal to " + topPower + ":");
        AllElectricalDevices.searchDevicesByParametr(bottomPower, topPower);
    }
}
