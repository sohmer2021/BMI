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
        int heightInFeet;
        int heightInInches;
        int total;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("What is your height (only feet)?");
        heightInFeet = keyboard.nextInt();
        System.out.println("What is your height remainder(only inches)?");
        heightInInches = keyboard.nextInt();
        total = (heightInFeet *12)+heightInInches;
        total = keyboard.nextInt();


        /*int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 6;
        total = (firstNumber *12) + secondNumber;*/




    }
}