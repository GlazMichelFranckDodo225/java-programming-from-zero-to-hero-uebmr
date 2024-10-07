package com.dgmf.basics.b.objects;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';

        System.out.println("Object is getting Created and initialized ...");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
