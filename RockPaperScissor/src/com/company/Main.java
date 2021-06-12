package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 0 - Rock
        // 1 - Paper
        // 2 - Scissor

        //User Input Code Is Below One:

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
        int n = s.nextInt();


        if (n == 0) {
            System.out.println("User Input: Rock");
        }

        else if (n == 1) {
            System.out.println("User Input: Paper");
        }

        else if (n == 2) {
            System.out.println("User Input: Scissor");
        }

        // Computer Input Code Is Below One:

        Random random = new Random();
        int computerInput = random.nextInt(3);


        if (computerInput == 0) {
            System.out.println("Computer Input: Rock");
        }

        else if (n == 1) {
            System.out.println("Computer Input: Paper");
        }

        else if (n == 2) {
            System.out.println("Computer Input: Scissor");
        }


        if (n == computerInput)
        {
            System.out.println("Draw...!!");
        }

        else if (n == 0 && computerInput == 2 || n == 1 && computerInput == 0 || n == 2 && computerInput == 1)
        {
            System.out.println("User Wins And Computer Lose..!!");
        }

        else
        {
            System.out.println("Computer Wins..!!");
        }

    }
}
