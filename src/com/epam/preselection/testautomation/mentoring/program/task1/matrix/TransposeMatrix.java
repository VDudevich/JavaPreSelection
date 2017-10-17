package com.epam.preselection.testautomation.mentoring.program.task1.matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        //Set the size of a matrix;
        System.out.println();
        System.out.println("Input size of a matrix (n x m):");
        int numberOfRows = 0;
        int numberOfColumns = 0;
        boolean isRepeat = true;
        while (isRepeat) {
            Scanner scannerNumberOfRowsAndColumns = new Scanner(System.in);
            try {
                System.out.print("Number of rows: n = ");
                numberOfRows = scannerNumberOfRowsAndColumns.nextInt();
                System.out.print("Number of columns: m = ");
                numberOfColumns = scannerNumberOfRowsAndColumns.nextInt();
                //check that values are set correctly (>0)
                if (numberOfRows > 0 & numberOfColumns > 0){
                    isRepeat = false;
                }else {
                    System.out.println("Incorrect value! Must be > 0. Please try again.");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value! Must be > 0. Please try again.");
                System.out.println();
            }
        }
        //Create the matrix with random values from minElement = -1000 to MaxElement = 1000 by the given size
        int minElement = -1000;
        int maxElement = 1000;
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < numberOfRows; row++){
            for (int column = 0; column < numberOfColumns; column++){
                matrix[row][column] = (int)(Math.random()*(maxElement-minElement+1))-1000;
            }
        }
        //Print the given matrix
        System.out.println();
        System.out.println("The given matrix:");
        for (int row = 0; row < numberOfRows; row++){
            for (int column = 0; column < numberOfColumns; column++){
                System.out.print(matrix[row][column]+"  ");
            }
            System.out.println();
        }
        //Transpose a matrix
        int[][] transposeMatrix = new int[numberOfColumns][numberOfRows];
        for (int row = 0; row < numberOfRows; row++){
            for (int column = 0; column < numberOfColumns; column++){
                transposeMatrix[column][row] = matrix[row][column];
            }
        }
        //Transpose a matrix and print
        System.out.println();
        System.out.println("The transpose matrix:");
        for (int row = 0; row < numberOfColumns; row++){
            for (int column = 0; column < numberOfRows; column++){
                System.out.print(transposeMatrix[row][column]+"  ");
            }
            System.out.println();
        }
    }
}
