package com.dgmf.basics.b.objects;

public class CarStaticVariableMain {
    public static void main(String[] args) {
        CarStaticVariable carStaticVariable1 = new CarStaticVariable();
        CarStaticVariable carStaticVariable2 = new CarStaticVariable(
                "Camry", "Black", 200
        );

        // System.out.println(CarStaticVariable.noOfWheels);
        // Problem with Static Variables
        // Compile Error ==> Since "noOfWheels" Variable become now "final"
        // CarStaticVariable.noOfWheels = 75;
        // System.out.println(CarStaticVariable.noOfWheels);
        System.out.println(CarStaticVariable.NO_OF_WHEELS);
    }
}
