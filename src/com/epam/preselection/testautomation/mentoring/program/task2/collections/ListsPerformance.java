package com.epam.preselection.testautomation.mentoring.program.task2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by vladimir on 16/10/2017.
 */
public class ListsPerformance {
    //speed of adding in the end
    public static long getSpeenOfAddingToArrayListInTheEnd(int numberOfElements){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            arrayList.add(i, randomNumber.nextInt(20000));
        }
        return System.nanoTime() - startTime;
    }

    public static long getSpeenOfAddingToLinkedListInTheEnd(int numberOfElements){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            linkedList.add(i, randomNumber.nextInt(20000));
        }
        return System.nanoTime() - startTime;
    }

    //speed of adding in the beginning
    public static long getSpeenOfAddingToArrayListInTheBeginning(int numberOfElements){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            arrayList.add(0, randomNumber.nextInt(20000));
        }
        return System.nanoTime() - startTime;
    }

    public static long getSpeenOfAddingToLinkedListInTheBeginning(int numberOfElements){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            linkedList.add(0, randomNumber.nextInt(20000));
        }
        return System.nanoTime() - startTime;
    }

    //speed of getting
    public static long getSpeenOfGettingFromArrayList(int numberOfElements){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            arrayList.add(randomNumber.nextInt(20000));
        }
        //measuring of getting by random index
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements/2; i++){
            arrayList.get(randomNumber.nextInt(numberOfElements));
        }
        return System.nanoTime() - startTime;
    }

    public static long getSpeenOfGettingFromLinkedList(int numberOfElements){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            linkedList.add(randomNumber.nextInt(20000));
        }
        //measuring of getting by random index
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements/2; i++){
            linkedList.get(randomNumber.nextInt(numberOfElements));
        }
        return System.nanoTime() - startTime;
    }

    //speed of removing
    public static long getSpeenOfRemovingFromArrayList(int numberOfElements){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            arrayList.add(randomNumber.nextInt(20000));
        }
        //measuring of removing first lement
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements/2; i++){
            arrayList.remove(0);
        }
        return System.nanoTime() - startTime;
    }

    public static long getSpeenOfRemovingFromLinkedList(int numberOfElements){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //create collection
        Random randomNumber = new Random();
        for (int i = 0; i < numberOfElements; i++){
            linkedList.add(randomNumber.nextInt(20000));
        }
        //measuring of removing first element
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements/2; i++){
            linkedList.remove(0);
        }
        return System.nanoTime() - startTime;
    }

}
