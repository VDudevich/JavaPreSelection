package com.epam.preselection.testautomation.mentoring.program.task2.collections;

import java.util.*;

/**
 * Created by vladimir on 16/10/2017.
 */
public class SetsPerformance {
    //speed of adding
    public static String[][] getSpeedOfAddingToHashSet(int numberOfElements){
        Set hashSet = new HashSet();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            hashSet.add(randomNumber.nextInt(numberOfElements));
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the HashSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(hashSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;
    }

    public static String[][] getSpeedOfAddingToTreeSet(int numberOfElements){
        Set treeSet = new TreeSet();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            treeSet.add(randomNumber.nextInt(numberOfElements));
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the TreeSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(treeSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;
    }

    //speed of getting
    public static String[][] getSpeedOfContainsInHashSet(int numberOfElements){
        Set hashSet = new HashSet();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            hashSet.add(randomNumber.nextInt(numberOfElements));
        }
        //measuring of contains multiple times
        long startTime = System.nanoTime();
        for (int i = 0; i < hashSet.size()/2; i++){
            hashSet.contains(randomNumber.nextInt(numberOfElements));
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the HashSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(hashSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;
}

    public static String[][] getSpeedOfContainsInTreeSet(int numberOfElements){
        Set treeSet = new TreeSet();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            treeSet.add(randomNumber.nextInt(numberOfElements));
        }
        //measuring of contains multiple times
        long startTime = System.nanoTime();
        for (int i = 0; i < treeSet.size()/2; i++){
            treeSet.contains(randomNumber.nextInt(numberOfElements));
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the HashSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(treeSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;
    }

    //speed of removing
    public static String[][] getSpeedOfRemovingFromHashSet(int numberOfElements){
        Set hashSet = new HashSet<>();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            hashSet.add(i);
        }
        //measuring of removing each second element
        long startTime = System.nanoTime();
        for (int i = 0; i < hashSet.size(); i+=2){
            hashSet.remove(i);
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the HashSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(hashSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;

    }

    public static String[][] getSpeedOfRemovingFromTreeSet(int numberOfElements){
        Set treeSet = new TreeSet();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            treeSet.add(randomNumber.nextInt(numberOfElements));
        }
        //measuring of removing each second element
        long startTime = System.nanoTime();
        for (int i = 0; i < treeSet.size(); i+=2){
            treeSet.remove(i);
        }
        long endTime = System.nanoTime();
        double takenTime =(double)(endTime - startTime) / 1000000000.0;
        //array where the 1st elemnt is the size of the HashSet and the second is taken time
        String[][] result = new String [1][2];
        result[0][0] = Integer.toString(treeSet.size());
        result[0][1] = Double.toString(takenTime);
        return result;

    }
}
