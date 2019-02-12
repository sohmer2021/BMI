package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* BMI = weight (lbs) *703 / height
        */
        int heightInFeet;
        int heightInInches;
        int total;
        int weightInPounds;
        int bmi;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("What is your height (only feet)?");
        heightInFeet = keyboard.nextInt();
        System.out.println("What is your height remainder(only inches)?");
        heightInInches = keyboard.nextInt();
        total = (heightInFeet *12)+heightInInches;
        System.out.println("Sum of integers = " + total + " inches");
        System.out.println("What is your weight in pounds?");
        weightInPounds = keyboard.nextInt();
        bmi = (weightInPounds *703) /total;
        System.out.println(bmi);



        /*
        * */


        /*int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 6;
        total = (firstNumber *12) + secondNumber;*/




    }
}