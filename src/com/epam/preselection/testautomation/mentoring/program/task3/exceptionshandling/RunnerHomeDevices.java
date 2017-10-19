package com.epam.preselection.testautomation.mentoring.program.task3.exceptionshandling;

import com.epam.preselection.testautomation.mentoring.program.task3.exceptionshandling.exceptions.InvalidDeviceName;
import com.epam.preselection.testautomation.mentoring.program.task3.exceptionshandling.exceptions.InvalidDevicePower;
import com.epam.preselection.testautomation.mentoring.program.task3.exceptionshandling.exceptions.InvalidVolume;

/**
 * Created by vladimir on 15/10/2017.
 */
public class RunnerHomeDevices {

    public static void main(String[] args) throws InvalidDeviceName, InvalidDevicePower, InvalidVolume {
        int bottomPower = 850;
        int topPower = 2499;
        int consumePower = 0;
        try {
            Microwave microwave = new Microwave(3500, "Samsung");
            microwave.setVolume(21);
            microwave.setDriveMode("Sensor");
            TvSet smallTvSet = new TvSet(250, "LG");
            smallTvSet.switchOn();
            smallTvSet.setResolution("1920x1080");

            Fridge oneCamereFridge = new Fridge(1500, "Atlant");
            oneCamereFridge.setVolume(150);
            oneCamereFridge.setNumberOfCameras(1);

            TvSet bigTvSet = new TvSet(1, "Samsung");
            bigTvSet.setResolution("4K");

            Fridge twoCamereFridge = new Fridge(500, "Indezit");
            twoCamereFridge.switchOn();
            twoCamereFridge.setVolume(270);
            twoCamereFridge.setNumberOfCameras(2);
            //calculate all switched devices on
            consumePower = AllTurnedOnElectricalDevices.consumedPower();
        } catch (IllegalArgumentException e){
            System.out.println("One or more of arguments were wrong: "+e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("NullPointer exception is caught: "+e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e){
            consumePower = -1;
            System.out.println("ArithmeticException happens: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("All devices at home:");
            AllElectricalDevices.outputAllDevices();
            System.out.println("All turned devices on at home:");
            AllTurnedOnElectricalDevices.outputAllTrunedOnDevices();
            if (consumePower == -1){
                System.out.print("A consumed power by turned devices on: Error has happend during calculation. See log");
            }else{
                System.out.print("A consumed power by turned devices on: " + consumePower + " Watt");
            }
            System.out.println();
            System.out.println();
            System.out.println("All devices at home sorted by power:");
            AllElectricalDevices.sortByPower();
            AllElectricalDevices.outputAllDevices();
            System.out.println("Devices with power greater than or equal to " + bottomPower + " and less than or equal to " + topPower + ":");
            AllElectricalDevices.searchDevicesByParametr(bottomPower, topPower);
        }
    }
}
