package com.company;

interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornokPlease
{
    void Blowhorn();
    void Hornblow();
}

class AvonCycle implements Bicycle, HornokPlease
{
    public void applyBrake(int decrement) // Interfaces Are By Default Public, so we need to declare them as public.
    {
        System.out.println("Hello, This Is Brake");
    }

    public void speedUp(int increment) // Interfaces Are By Default Public, so we need to declare them as public.
    {
        System.out.println("Hello, This Is SpeedUp");
    }

    public void Blowhorn()
    {
        System.out.println("Blowhorn");
    }
    public void Hornblow()
    {
        System.out.println("Hornblow");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        AvonCycle avon = new AvonCycle();
        avon.applyBrake(1);
//        You can create properties in interfaces and get it by dot operator
        System.out.println(avon.a);
//        You Cannot Modify the properties that are present in interface as they are final
//        avon.a = 50; // By assigning a new value to a will produce error
//        System.out.println(avon.a);

        avon.Blowhorn();
        avon.Hornblow();
    }
}
