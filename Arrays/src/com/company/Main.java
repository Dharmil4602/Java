package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

//        Displaying 2-D Array
        System.out.println(" ");
        System.out.println("Displaying The 2-D Array: ");
        for (int i = 0; i< flats.length; i++)
        {
            for (int j = 0; j<flats[i].length; j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        String [] students = {"Dharmil", "Souravi", "Disha"};
//        marks[0] = 80;
//        marks[1] = 70;
//        marks[2] = 75;
//        marks[3] = 85;
//        marks[4] = 95;
        System.out.println(marks[0]);
        System.out.println(marks.length);
        System.out.println(students[0]);

        // Printing Array Using For Loop

        for (int i = 0; i< marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println(" ");
        System.out.println("Reverse Oder Of The Marks Array Is:");
        for (int i = marks.length - 1; i>= 0; i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println(" ");
        System.out.println("Displaying Student Array Using For Each Loop:");
        for (String element: students)
        {
            System.out.println(element);
        }


    }
}
