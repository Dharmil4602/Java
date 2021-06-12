package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Number Between 1-7: ");
//        int day = s.nextInt();

        /*

        if (age>50)
        {
            System.out.println("You Are Well Experienced!");
        }

        else if (age>40)
        {
            System.out.println("You Are Semi experienced!");
        }

        else
        {
            System.out.println("You Are Not Experienced!");
        }

        */

        // Switch Case:

        /*
        switch(age)
        {
            case 18:
                System.out.println("You Are Becoming An Adult!");
                break;

            case 20:
                System.out.println("You Are Mature!");
                break;

            default:
                System.out.println("Enjoy Your Life!");
        }
         */


        /*
        switch (day)
        {
            case 1:
                System.out.println("The Day Is Monday!");
                break;

            case 2:
                System.out.println("The Day Is Tuesday!");
                break;

            case 3:
                System.out.println("The Day Is Wednesday!");
                break;

                case 4:
                System.out.println("The Day Is Thursday!");
                break;

                case 5:
                System.out.println("The Day Is Friday!");
                break;

                case 6:
                System.out.println("The Day Is Saturday!");
                break;

                case 7:
                System.out.println("The Day Is Sunday!");
                break;

            default:
                System.out.println("Error!");
        }
         */

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int year;
        year = s1.nextInt();

        if (year % 4 == 0 && year != 1900)
        {
            System.out.println("Entered Year Is Leap Year");
        }

        else if (year == 1900)
        {
            System.out.println("1900 Was Declared As Not A Leap Year");
        }

        else
        {
            System.out.println("Entered Year Is Not A Leap Year");
        }
    }
}
