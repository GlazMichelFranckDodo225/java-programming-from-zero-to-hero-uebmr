package com.dgmf.basics.b.objects;

public class CarStaticVariable {
    String model;
    String color;
    int horsePower;
    // All Car Objects will have the same copy
    // final ==> To Avoid Unwanted Modifications of the Static variable
    // static final byte noOfWheels = 4;
    static final byte NO_OF_WHEELS = 4;

    // Instance Initialization Block ==> Executed whenever an Object of
    // the is Instantiated
    {
        System.out.println("CarIIBkDemo Object is Being Created ...");
    }

    public CarStaticVariable() {
    }

    public CarStaticVariable(String model, String color, int horsePower) {
        this.horsePower = horsePower;
        this.color = color;
        this.model = model;
    }

    public void startCar() {
        System.out.println("Car started ...");
    }

    public String stopCar() {
        String output = "Car stopped ...";

        return output;
    }
}
