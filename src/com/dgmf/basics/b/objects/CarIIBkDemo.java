package com.dgmf.basics.b.objects;

public class CarIIBkDemo {
    String model;
    String color;
    int horsePower;

    // Instance Initialization Block ==> Executed whenever an Object of
    // the is Instantiated
    {
        System.out.println("CarIIBkDemo Object is Being Created ...");
    }

    public CarIIBkDemo() {
    }

    public CarIIBkDemo(String model, String color, int horsePower) {
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
