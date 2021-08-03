package com.company;

interface Bicycle
{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle
{
    public void applyBrake(int decrement) // Interfaces Are By Default Public, so we need to declare them as public.
    {
        System.out.println("Hello, This Is Brake");
    }

    public void speedUp(int increment) // Interfaces Are By Default Public, so we need to declare them as public.
    {
        System.out.println("Hello, This Is SpeedUp");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
