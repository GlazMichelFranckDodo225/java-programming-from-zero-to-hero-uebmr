package com.dgmf.basics.a.primitivedatatypes;

public class TypeCasting {
    public static void main(String[] args) {
        /* Type Casting ==> Assign a Value of One Primitive Data Type to Another
            - Widening Casting (Automatically/Implicit)
            - Narrowing Casting (Manually/Explicit)
        */

        /* Widening Casting (Automatically/Implicit)
            - ==> Converting a Smaller Type to a Larger Type Size
            - ==> Done Automatically
            - ==> Safe Because There is No Chance to Lose Data
            - byte -> short -> char -> int -> long -> float -> double
        */
        System.out.println("=== Widening Casting (Automatically/Implicit) ===");
        int myIntNum = 16;
        double myDoubleNum = myIntNum; // Widening Casting (Automatically/Implicit)
        System.out.println(myIntNum);
        System.out.println(myDoubleNum);
        float myFloatNum = 3.14F;
        myDoubleNum = myFloatNum; // Widening Casting (Automatically/Implicit)
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);

        /* Narrowing Casting (Manually/Explicit)
            - ==> Converting a Larger Type to a Smaller Type Size
            - Should Be Done Manually by the Developer
            - Otherwise, the Compiler Reports a Compile-time Error
            - double -> float -> long -> int -> char -> short -> byte
            - Narrowing Casting (Manually/Explicit)
        */

        System.out.println("=== Narrowing Casting (Manually/Explicit) ===");
        // float myExplicitFloatNum = myDoubleNum; // Otherwise, the Compiler Reports a
        // Compile-time Error ==> java: incompatible types: possible lossy conversion from
        // double to float
        // Narrowing Casting (Manually/Explicit)
        float myExplicitFloatNum = (float) myDoubleNum; // Otherwise, the Compiler Reports a
        // Compile-time Error
        System.out.println(myDoubleNum);
        System.out.println(myExplicitFloatNum);

        // int myExplicitIntNum = myDoubleNum; // Otherwise, the Compiler Reports a
        // Compile-time Error ==> java: incompatible types: possible lossy conversion from
        // double to int
        // Narrowing Casting (Manually/Explicit)
        int myExplicitIntNum = (int) myDoubleNum; // Otherwise, the Compiler Reports a
        // Compile-time Error
        System.out.println(myDoubleNum);
        System.out.println(myExplicitIntNum);

        // Overflow
        System.out.println("=== Overflow ===");
        int overflowIntNum = 13;
        long overflowLongNum = 2147483648L;
        System.out.println(overflowIntNum);
        System.out.println(overflowLongNum);
        // Compile-time Error ==> java: incompatible types: possible lossy
        // conversion from long to int
        // overflowIntNum = overflowLongNum;
        overflowIntNum = (int) overflowLongNum; // Narrowing Casting (Manually/Explicit)
        // Overflow Happened
        System.out.println(overflowIntNum); // -2147483648
    }
}
