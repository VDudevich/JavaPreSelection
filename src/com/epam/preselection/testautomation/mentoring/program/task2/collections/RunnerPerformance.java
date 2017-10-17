package com.epam.preselection.testautomation.mentoring.program.task2.collections;

import java.util.ArrayList;

/*
 * Created by vladimir on 16/10/2017.
 */

public class RunnerPerformance {
    public static void main(String[] args) {
//============================================================================
        System.out.println("\n ARRAYLIST vs LINKEDLIST");
        //set number of elelemnts in collection
        int numberOfElements = 2000000;
        //measuring time of adding to ArrayList in the end and print the result
        double takenTimeInSecondsForArrayListInTheEnd =(double)ListsPerformance.getSpeenOfAddingToArrayListInTheEnd(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to ArrayList in the end takes " + takenTimeInSecondsForArrayListInTheEnd + " seconds.");

        //measuring time of adding to LinkedList in the end  and print the result
        double takenTimeInSecondsForLinkedListInTheEnd =(double)ListsPerformance.getSpeenOfAddingToLinkedListInTheEnd(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to LinkedList in the end takes " + takenTimeInSecondsForLinkedListInTheEnd + " seconds.");

        numberOfElements = 200000;
        //measuring time of adding to ArrayList in the beginning and print the result
        double takenTimeInSecondsForArrayListInTheBeginning =(double)ListsPerformance.getSpeenOfAddingToArrayListInTheBeginning(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to ArrayList in the beginning takes " + takenTimeInSecondsForArrayListInTheBeginning + " seconds.");

        //measuring time of adding to LinkedList in the beginning and print the result
        double takenTimeInSecondsForLinkedListInTheBeginning =(double)ListsPerformance.getSpeenOfAddingToLinkedListInTheBeginning(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to LinkedList in the beginning takes " + takenTimeInSecondsForLinkedListInTheBeginning + " seconds.");

        numberOfElements = 200000;
        //measuring time of getting elements by random index from ArrayList
        double takenTimeInSecondsForArrayListGetting =(double)ListsPerformance.getSpeenOfGettingFromArrayList(numberOfElements) / 1000000000.0;
        System.out.println("Getting elements from ArrayList of " + numberOfElements + " elements by index " + numberOfElements/2 + " times took " + takenTimeInSecondsForArrayListGetting+ " seconds.");

        //measuring time of getting elements by random index from LinkedLIst
        double takenTimeInSecondsForLinkedListGetting =(double)ListsPerformance.getSpeenOfGettingFromLinkedList(numberOfElements) / 1000000000.0;
        System.out.println("Getting elements from LinkedList of " + numberOfElements + " elements by index " + numberOfElements/2 + " times took " + takenTimeInSecondsForLinkedListGetting + " seconds.");

        numberOfElements = 200000;
        //measuring time of removing the first element from ArrayList
        double takenTimeInSecondsForArrayListRemoving =(double)ListsPerformance.getSpeenOfRemovingFromArrayList(numberOfElements) / 1000000000.0;
        System.out.println("Removing the first element from ArrayList " + numberOfElements/2 + " times took " + takenTimeInSecondsForArrayListRemoving+ " seconds.");

        //measuring time of removing the first element from LinkedLIst
        double takenTimeInSecondsForLinkedListRemoving =(double)ListsPerformance.getSpeenOfRemovingFromLinkedList(numberOfElements) / 1000000000.0;
        System.out.println("Removing the first element from LinkedList " + numberOfElements/2 + " times took " + takenTimeInSecondsForLinkedListRemoving + " seconds.");
//============================================================================
        System.out.println("\n HASHSET vs TREESET");
        //set number of elelemnts in collection
        numberOfElements = 2000000;
        //measuring time of adding to HashSet
        String[][] SetResult = SetsPerformance.getSpeedOfAddingToHashSet(numberOfElements);
        String time = SetResult[0][1];
        String numberInSet = SetResult[0][0];
        System.out.println("Adding to HashSet " + numberInSet + " elements took " + time + " seconds.");

        //measuring time of adding to TreeSet
        SetResult = SetsPerformance.getSpeedOfAddingToTreeSet(numberOfElements);
        time = SetResult[0][1];
        numberInSet =  SetResult[0][0];
        System.out.println("Adding to HashSet " + numberInSet + " elements took " + time + " seconds.");

        numberOfElements = 2000000;
        //measuring time of checking on containing elements in HashSet
        SetResult = SetsPerformance.getSpeedOfContainsInHashSet(numberOfElements);
        time = SetResult[0][1];
        numberInSet =  SetResult[0][0];
        System.out.println("Checking " + Integer.parseInt(numberInSet)/2 + " times " + "on containing element in HashSet of " + numberInSet + " elements took " + time + " seconds.");

        //measuring time of checking on containing elements in HashSet
        SetResult = SetsPerformance.getSpeedOfContainsInTreeSet(numberOfElements);
        time = SetResult[0][1];
        numberInSet =  SetResult[0][0];
        System.out.println("Checking " + Integer.parseInt(numberInSet)/2 + " times " + "on containing element in TreeSet of " + numberInSet + " elements took " + time + " seconds.");

        //measuring time of removing each second element of HashSet
        SetResult = SetsPerformance.getSpeedOfRemovingFromHashSet(numberOfElements);
        time = SetResult[0][1];
        numberInSet =  SetResult[0][0];
        System.out.println("Removing each second element in HashSet of " + numberInSet + " elements took " + time + " seconds.");

        //measuring time of removing each second element of TreeSet
        SetResult = SetsPerformance.getSpeedOfRemovingFromTreeSet(numberOfElements);
        time = SetResult[0][1];
        numberInSet =  SetResult[0][0];
        System.out.println("Removing each second element in TreeSet of " + numberInSet + " elements took " + time + " seconds.");

//============================================================================
        System.out.println("\n HASHMAP vs TREEMAP (String elements");
        //set number of elelemnts in collection
        numberOfElements = 2000000;

        //measuring time of adding to HashMap
        double takenTimeInSecondsForHashMap =(double)MapsPerformance.getSpeedOfAddingToHashMap(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to HashMap takes " + takenTimeInSecondsForHashMap + " seconds.");

        //measuring time of adding to TreeSet
        double takenTimeInSecondsForTreeMap =(double)MapsPerformance.getSpeedOfAddingToTreeMap(numberOfElements) / 1000000000.0;
        System.out.println("Adding " + numberOfElements + " to TreeMap takes " + takenTimeInSecondsForTreeMap + " seconds.");

        numberOfElements = 10000000;
        //baseline for creating hashMap and treeMap
        ArrayList arrayList = MapsPerformance.arrayListForMaps(numberOfElements);

        //measuring time of getting to HashMap
        double takenTimeInSecondsForGettingHashMap =(double)MapsPerformance.getSpeedOfGettingHashMap(arrayList) / 1000000000.0;
        System.out.println("Getting " + numberOfElements + " elements from HashMap takes " + takenTimeInSecondsForGettingHashMap + " seconds.");

        //measuring time of  getting to TreeSet
        double takenTimeInSecondsForGettingTreeMap =(double)MapsPerformance.getSpeedOfGettingTreeMap(arrayList) / 1000000000.0;
        System.out.println("Getting " + numberOfElements + " elements from TreeMap takes " + takenTimeInSecondsForGettingTreeMap + " seconds.");

        //measuring time of removing from HashMap
        double takenTimeInSecondsForRemovingHashMap =(double)MapsPerformance.getSpeedOfRemovingHashMap(arrayList) / 1000000000.0;
        System.out.println("Removing " + numberOfElements + " elements from HashMap takes " + takenTimeInSecondsForRemovingHashMap + " seconds.");

        //measuring time of removing from TreeSet
        double takenTimeInSecondsForRemovingTreeMap =(double)MapsPerformance.getSpeedOfRemovingTreeMap(arrayList) / 1000000000.0;
        System.out.println("Removing " + numberOfElements + " elements from TreeMap takes " + takenTimeInSecondsForRemovingTreeMap + " seconds.");


    }
}
