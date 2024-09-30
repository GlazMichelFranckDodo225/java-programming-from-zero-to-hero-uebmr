package com.dgmf.basics.b.classes;

public class ReturnStatement {
    public static void main(String[] args) {

    }

    public static int sum(int num1, int num2) {
        // return num1 + num2; // Ok
        // return 30; // Ok
        // return "30"; // Error due to Wrong Return Type
        int result = num1 + num2;
        return result;
    }
}
