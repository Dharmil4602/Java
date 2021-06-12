package com.company;

class Base{
    int x;

    Base() {
        System.out.println("I Am A Constructor..!!");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    Derived(){
        System.out.println("I am a Derived Class Constructor...!!");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Base b = new Base();
        Derived d = new Derived();
    }
}
