package com.company;

import java.util.concurrent.CyclicBarrier;

class Cylinder{

    double pi = 3.14;
    private int radius;
    private int height;

    private double volume;
    private double area;

    public double surfaceArea(){
           return (2 * 3.14 * radius) * (height + radius);
    }

    public double Volume(){
        return 3.14 * radius * radius * height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

class Rectangle{

    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public Rectangle() {
        this.length = 4;
        this.height = 5;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here


        Cylinder c = new Cylinder();
        c.setHeight(50);
        c.setRadius(10);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println("Surface Area Of Cylinder Is: " + c.surfaceArea());
        System.out.println("Volume Of Cylinder Is: " + c.Volume());

        Rectangle r = new Rectangle(5, 4);
//        Rectangle r = new Rectangle();
        System.out.println(r.getHeight());
        System.out.println(r.getLength());



    }
}
