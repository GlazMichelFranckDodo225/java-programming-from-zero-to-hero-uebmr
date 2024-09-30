package com.dgmf.basics.b.classes;

public class MainMethod {
    // public static void main(String[] args) { // Ok
    // Below, JVM cannot start the program any more due to absence of "static" keyword
    // public void main(String[] args) {
    // Below, JVM cannot start the program any more due to absence of "public" keyword
    // static void main(String[] args) {
    public static void main(String[] MyArgs) { // Ok
        System.out.println("Hello World");
    }

    // Ok, but this will not be used by the JVM as Entry Point
    public static void main(String[] MyArgs, float num) {
        System.out.println("Hello World");
    }

    // Ok, but this will not be used by the JVM as Entry Point
    public double main() {
        return 3.5;
    }
}
