package com.dgmf.basics.b.objects;

public class EmployeeStaticVariable {
    String firstName;
    String lastName;
    byte age;
    char gender;
    // All Employee Objects will have the same copy
    // static String employerName = "Google";
    static String EMPLOYER_NAME = "Google";

    public EmployeeStaticVariable() {
        /*this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';*/

        // Constructor Chaining ==> Must Be the First Statement
        this("Will", "Smith", (byte) 55, 'M');

        System.out.println("Object is getting Created and initialized From Default Constructor...");
    }

    public EmployeeStaticVariable(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

        System.out.println("Object is getting Created and initialized From Constructor with Parameters...");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
