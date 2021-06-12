package com.company;


class One{
    public void greet(){
        System.out.println("Good Morning..!!");
    }

    public void name(){
        System.out.println("My Name Is Java.");
    }
}

class Two extends One{

    public void welcome(){
        System.out.println("You Are Welcomed Here..!!");
    }

    public void name(){
        System.out.println("My Name Is Java In Class Two.");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        One obj = new Two();
        obj.greet();
        obj.name();
    }
}
