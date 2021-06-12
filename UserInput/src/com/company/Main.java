package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Taking Input From User");
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Number 1: ");
//        int a = s.nextInt();
//        System.out.println("Enter Number 2: ");
//        int b = s.nextInt();
//
//        int sum = a + b;
//        System.out.println("Summation Is: " + sum);

//        Checking Whether the user input is integer or not
        boolean c = s.hasNextInt();
        System.out.println(c);

    }
}
