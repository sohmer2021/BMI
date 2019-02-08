package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* BMI = km/m*m
           m = inch *(0.0254/1)
           inch = m*(1/0.0254)
           kg = inch *()
           inch = kg *()
        */
        String heightInInches;
        String heightInFeet;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("What is your height (only feet)?");
        heightInFeet = keyboard.nextLine();
        System.out.println("What is your height (only inches)?");
        heightInInches = keyboard.nextLine();


        int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 6;
        total = firstNumber + secondNumber;


    }
}