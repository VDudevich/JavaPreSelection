package com.epam.preselection.testautomation.mentoring.program.task2.collections;

import java.util.*;

/**
 * Created by vladimir on 16/10/2017.
 */
public class MapsPerformance {
    private static HashMap<String, String> hashMap = new HashMap<String, String>();
    private static TreeMap<String, String> treeMap = new TreeMap<String, String>();
    private static ArrayList<String> listOfKeys = new ArrayList<String>();
    //speed of adding
    public static long getSpeedOfAddingToHashMap(int numberOfElements){
        hashMap.clear();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        //put unique values
        for (int i = 0; i < numberOfElements; i++){
            hashMap.put(Integer.toString(i)+Integer.toString(randomNumber.nextInt(numberOfElements)), Integer.toString(i)+Integer.toString(randomNumber.nextInt(numberOfElements)));
        }
        long endTime = System.nanoTime();
        hashMap.clear();
        return endTime - startTime;
    }

    public static long getSpeedOfAddingToTreeMap(int numberOfElements){
        treeMap.clear();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        //put unique values
        for (int i = 0; i < numberOfElements; i++){
            treeMap.put(Integer.toString(i)+Integer.toString(randomNumber.nextInt(numberOfElements)), Integer.toString(i)+Integer.toString(randomNumber.nextInt(numberOfElements)));
        }
        long endTime = System.nanoTime();
        treeMap.clear();
        return endTime - startTime;
    }

    //speed of getting
    //create a baseline for HashMap and TreeMap
    public static ArrayList arrayListForMaps (int numberOfElements) {
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            listOfKeys.add(Integer.toString(i) + Integer.toString(randomNumber.nextInt(numberOfElements)));
        }
        return listOfKeys;
    }

    public static long getSpeedOfGettingHashMap(ArrayList<String> arrayList){
        hashMap.clear();
        //create collection hashMap
        for (String element : arrayList){
            hashMap.put(element, element);
        }
        //measuring of getting multiple times
        long startTime = System.nanoTime();
        for (String element : arrayList){
            hashMap.get(element);
        }
        long endTime = System.nanoTime();
        hashMap.clear();
        return endTime - startTime;
}

    public static long getSpeedOfGettingTreeMap(ArrayList<String> arrayList){
        treeMap.clear();
        //create collection hashMap
        for (String element : arrayList){
            treeMap.put(element, element);
        }
        //measuring of getting multiple times
        long startTime = System.nanoTime();
        for (String element : arrayList){
            treeMap.get(element);
        }
        long endTime = System.nanoTime();
        treeMap.clear();
        return endTime - startTime;
    }

    //speed of removing
    public static long getSpeedOfRemovingHashMap(ArrayList<String> arrayList){
        hashMap.clear();
        //create collection hashMap
        for (String element : arrayList){
            hashMap.put(element, element);
        }
        //measuring of removing multiple times
        long startTime = System.nanoTime();
        for (String element : arrayList){
            hashMap.remove(element);
        }
        long endTime = System.nanoTime();
        hashMap.clear();
        return endTime - startTime;
    }

    public static long getSpeedOfRemovingTreeMap(ArrayList<String> arrayList){
        treeMap.clear();
        //create collection hashMap
        for (String element : arrayList){
            treeMap.put(element, element);
        }
        //measuring of removing multiple times
        long startTime = System.nanoTime();
        for (String element : arrayList){
            treeMap.remove(element);
        }
        long endTime = System.nanoTime();
        treeMap.clear();
        return endTime - startTime;
    }
}
