package com.dgmf.basics.b.classes;

public class ArithmeticOperations {
    public int sum(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    // public int sum(int num1, int num2) { // Same Method Signature
    // public int sum(int num3, int num4) { // Same Method Signature
    // int sum(int num3, int num4) { // Same Method Signature
    // long sum(int num3, int num4) { // Same Method Signature
    // public int sum1(int num3, int num4) { // Ok
    public int sum(byte num3, int num4) { // Ok
        // int result = num1 + num2; // Compile-time Error ==> Parameters don't match
        int result = num3 + num4;

        return result;
    }
}
