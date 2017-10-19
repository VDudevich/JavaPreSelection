package com.epam.preselection.testautomation.mentoring.program.task3.iostreams;

import com.epam.preselection.testautomation.mentoring.program.task3.iostreams.exceptions.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by vladimir on 15/10/2017.
 */
public class RunnerHomeDevices {

    public static void main(String[] args) throws InvalidDeviceName, InvalidDevicePower, InvalidVolume, IOException, InvalidNumberOfCameras, InvalidData {
        int bottomPower = 850;
        int topPower = 2499;
        int consumePower = 0;
        //for deciding either switch device on or no
        Random random = new Random();
        String source = "src/com/epam/preselection/testautomation/mentoring/program/task3/iostreams/resources/data.txt";
        String output = "src/com/epam/preselection/testautomation/mentoring/program/task3/iostreams/resources/results.txt";
        ArrayList<String[]> dataFromFile = new ArrayList<>();
        try {
            /*Each row in a file represent one device ('line' in the code)
            * Words in a line are delimited by tab
            * 1st word - type of the device (line[0]);
            * 2nd word - power of the device (line[1]);
            * 3rd word - name of the device (line[2]);
            * 4th word - volume for Microwave, Fridge (line[3]);
            *          - resolution for TV (line[3]);
            * 5th word - drive mode for Microwave (line[4]);
            *          - number of cameras for Fridge (line[4]);
            * */
            dataFromFile = DataFromFile.readFromSource(source);
            //All data which have been processed without error are stored to the file 'results.txt'
            FileWriter fileWriter = new FileWriter(output);
            BufferedWriter resultFile = new BufferedWriter(fileWriter);
            for (String[] line : dataFromFile){
                try {
                    switch (line[0]) {
                        case "Microwave":
                            Microwave microwave = new Microwave(Integer.parseInt(line[1]), line[2]);
                            microwave.setVolume(Integer.parseInt(line[3]));
                            microwave.setDriveMode(line[4]);
                            //deciding to switch the device on or no
                            if (random.nextInt(2) == 1) {
                                microwave.switchOn();
                            }
                            resultFile.write(line[0]+"\t"+line[1]+"\t"+line[2]+"\t"+line[3]+"\t"+line[4]+"\n");
                            break;
                        case "TVset":
                            TvSet tvSet = new TvSet(Integer.parseInt(line[1]), line[2]);
                            //deciding to switch the device on or no
                            if (random.nextInt(2) == 1) {
                                tvSet.switchOn();
                            }
                            tvSet.setResolution(line[3]);
                            resultFile.write(line[0]+"\t"+line[1]+"\t"+line[2]+"\t"+line[3]+"\n");
                            break;
                        case "Fridge":
                            Fridge fridge = new Fridge(Integer.parseInt(line[1]), line[2]);
                            fridge.setVolume(Integer.parseInt(line[3]));
                            fridge.setNumberOfCameras(Integer.parseInt(line[4]));
                            if (random.nextInt(2) == 1) {
                                fridge.switchOn();
                            }
                            resultFile.write(line[0]+"\t"+line[1]+"\t"+line[2]+"\t"+line[3]+"\t"+line[4]+"\n");
                            break;
                        default:
                            throw new InvalidData("Bad data in a file in the row having the first word: " + line[0]);
                    }
                } catch (InvalidData e){
                    e.printStackTrace();
                } catch (InvalidNumberOfCameras e){
                    e.printStackTrace();
                } catch (InvalidDevicePower e){
                    e.printStackTrace();
                } catch (InvalidVolume e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            resultFile.close();
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
        } catch (FileNotFoundException e){
            System.out.println("File is not found: "+e.getMessage());
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Error with IO flow: "+e.getMessage());
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
