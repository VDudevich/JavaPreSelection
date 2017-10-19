package com.epam.preselection.testautomation.mentoring.program.task3.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vladimir on 19/10/2017.
 */
public class DataFromFile {

    public static ArrayList readFromSource(String source) throws IOException {
        FileReader fileReader = new FileReader(source);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        boolean isReading = true;
        String takenLine;
        ArrayList<String[]> linesFormFileByWords = new ArrayList<>();
        int numberOfElements=0;
        while (isReading){
            takenLine = bufferedReader.readLine();
            if (takenLine == null){
                isReading = false;
            } else {
                //ignorting empty lines
                if (!takenLine.isEmpty()) {
                    linesFormFileByWords.add(numberOfElements, takenLine.split("\t"));
                    numberOfElements++;
                }
            }
        }
        bufferedReader.close();
        return linesFormFileByWords;
    }
}
