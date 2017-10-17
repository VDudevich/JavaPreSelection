package com.epam.preselection.testautomation.mentoring.program.task1.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vladimir on 10/10/2017.
 * Calculator can add, subtrack, multiply and devide numbers.
 * Firstly it asks to enter two numbers, then enter an operation to perform (1 - add, 2 - subtrack, 3 - multiply, 4 - devide (precision is 6), 0- exit)
 */
public class Calculator {

    public static void main(String[] args) {
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println();
            System.out.println("This is a CALCULATOR!!!");
            System.out.println("Four operations are available for two numbers.");
            System.out.println("After entering two numbers the operation should be selected.");
            System.out.println();
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Devide");
            System.out.println("0 - Exit");
            System.out.println();
            //Input numbers;
            System.out.println();
            System.out.println("Input two numbers:");
            Scanner scannerNumbers = new Scanner(System.in);
            try {
                System.out.print("First number: firstNumber = ");
                BigDecimal firstNumber = scannerNumbers.nextBigDecimal();
                System.out.print("Second number: secondNumber = ");
                BigDecimal secondNumber = scannerNumbers.nextBigDecimal();
                //Selecting an operation
                System.out.print("Select an operation to perfoem (from 0 to 4): ");
                Scanner scannerOperation = new Scanner(System.in);
                int operation = scannerOperation.nextInt();
                BigDecimal result = BigDecimal.ZERO;
                switch (operation) {
                    //eixt
                    case 0:
                        isRepeat = false;
                        System.out.println("Done! Good bye!");
                        break;
                    //Add
                    case 1:
                        BigDecimal add = firstNumber.add(secondNumber);
                        result = add;
                        break;
                    //Subtrack
                    case 2:
                        BigDecimal sub = firstNumber.subtract(secondNumber);
                        result = sub;
                        break;
                    //Multiply
                    case 3:
                        BigDecimal multiply = firstNumber.multiply(secondNumber);
                        result = multiply;
                        break;
                    //Devide
                    case 4:
                        if (secondNumber.compareTo(BigDecimal.ZERO) != 0) {
                            BigDecimal devide = firstNumber.divide(secondNumber, 6, RoundingMode.HALF_UP);
                            result = devide;
                        }else{
                            System.out.println();
                            System.out.println();
                            System.out.println("!!!!!!!!!!         Dividing by ZERO       !!!!!!!!!");
                            System.out.println();
                            operation = -1; // result won't be printed
                        }
                        break;
                     default:
                        System.out.println();
                        System.out.println();
                        System.out.println("!!!!!!!!!!           Incorrect value! Must be from 0 to 4. Please try again.        !!!!!!!!!");
                        System.out.println();
                };
                if (operation == 1 || operation == 2 || operation == 3 || operation == 4){
                    System.out.println();
                    System.out.println();
                    System.out.println("Result is:" + result);
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println();
                System.out.println("!!!!!!!!!!!   Incorrect value! Must be a number. Please try again.   !!!!!!!!");
                System.out.println();
            }
        }
    }
}
