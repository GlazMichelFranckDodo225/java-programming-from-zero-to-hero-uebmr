package com.dgmf.basics.b.objects;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee() {
        System.out.println("Object is getting initialized ...");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
