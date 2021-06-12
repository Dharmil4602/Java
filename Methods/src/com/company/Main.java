package com.company;

public class Main {

    // Here static int one is the Method/Function that we created. Name of the method/function is "logic".

//     int logic(int x, int y) // For Calling The Methods Using Objects.
    static int logic(int x, int y) // For Normal Method Conditions.
    {
        int z;
        if (x>y)
        {
            z = x + y;
        }
        else
        {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        int a1,b1,c1;
        a = 5;
        b = 7;

        a1 = 3;
        b1 = 6;

        /* Calling The Methods With The Help Of Object.
           Here We Will Not Be Adding Static At The Start Of The Creation Of Method.
         */
//        Main obj = new Main();
//        c = obj.logic(a,b);

        c = logic(a,b);
        c1 = logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

    }
}
