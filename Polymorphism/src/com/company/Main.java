package com.company;

// Lets See Some Examples For Interfaces
interface Camera
{
    void takeSnap();
    void recordVideo();
}

interface Wifi
{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class myCellPhone
{
    void callNumber(int phone)
    {
        System.out.println("Calling " + phone);
    }

    void pickCall()
    {
        System.out.println("Incoming");
    }
}

class mySmartPhone extends myCellPhone implements Camera, Wifi
{

    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }

    public String[] getNetwork() {
        System.out.println("Getting Networks: ");
        String[] networkList = {"Dharmil", "Khushi", "Souravi"};
        return networkList;
    }


    public void connectToNetwork(String network) {
        System.out.println("Connecting To.." + network);
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
//        mySmartPhone m = new mySmartPhone();
//        String[] net = m.getNetwork();
//        for (String item:net)
//        {
//            System.out.println(item);
//        }
//
//        m.callNumber(1234567890);

        Camera cam = new mySmartPhone();
//        cam.getNetwork(); // This is not allowed as we have taken Camera interface and we are accessing Wifi interface object so it will create an error
        cam.recordVideo(); // This command will execute as recordVideo is part of Camera interface
    }
}
