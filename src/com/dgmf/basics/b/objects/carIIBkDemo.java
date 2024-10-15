package com.dgmf.basics.b.objects;

public class carIIBkDemo {
    String model;
    String color;
    int horsePower;

    // Instance Initialization Block ==> Executed whenever an Object of
    // the is Instantiated
    {
        this.model = "Camry";
        this.color = "Black";
        this.horsePower = 200;

        System.out.println("CarIIBkDemo Object is Being Created ...");
    }

    public void startCar() {
        System.out.println("Car started ...");
    }

    public String stopCar() {
        String output = "Car stopped ...";

        return output;
    }
}
