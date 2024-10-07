package com.dgmf.basics.b.objects;

public class EmployeeMain {
    public static void main(String[] args) {
        // Creation of an Employee Object with all the Default Values
        // Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        // Populate Employee Object's Fields
        /*employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 30;
        employee.gender = 'M';*/
        // Calling Non-static Methods of Employee Object
        // System.out.println(employee.getAge());
        // System.out.println(employee.getGender());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());
    }
}
