package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1. Create array of 5 floats and find their sum.
        System.out.println("Summation Of 5 Numbers..!!");
        float summation = 0;
        float[] sum = new float[5];
        sum[0] = 1.6f;
        sum[1] = 6;
        sum[2] = 4.2f;
        sum[3] = 7.9f;
        sum[4] = 10;

        for (int i = 0; i < sum.length; i++) {
            summation = summation + sum[i];
        }
        System.out.println("Summation is: " + summation);

        System.out.println(" ");

        // 2. Find whether the given number is in array or not.

        System.out.println("Finding Whether The Given Number Is In Array Or Not..!!");

        float[] marks = {1.3f, 3.2f, 8.7f ,2.2f, 5.2f, 3.6f, 4.9f, 19.3f};
        float num = 2.2f;
        boolean isInArray = false;
        for (float number:marks)
        {
            if (num==number)
            {
               isInArray = true;
               break;
            }
        }

        if (isInArray)
        {
            System.out.println("Given Number Is Present In Array");
        }
        else
        {
            System.out.println("Given Number Is Not Present In Array");
        }

        System.out.println(" ");

        // 3. Adding Elements Of two 2-D Matrices.

        System.out.println("Adding Two Matrices...!!");
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};

        int [][] mat2 = {{11, 12, 13},
                         {14, 15, 16}};

        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1[i].length; j++)
            {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        // 4. Reversing Array.
        System.out.println("Reverse Array Of The Given Array Is: ");
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = arr.length;
        int temp, a, b;
        int n = Math.floorDiv(l, 2);
        for (int i = 0; i < n; i++)
        {
             temp = arr[i];
             arr[i] = arr[l - i - 1];
             arr[l - i - 1] = temp;
        }
        for (int element:arr)
        {
            System.out.println(element);
        }
        for (int e:arr) {
            System.out.println();
        }

    }
}
