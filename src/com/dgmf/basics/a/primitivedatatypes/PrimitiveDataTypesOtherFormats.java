package com.dgmf.basics.a.primitivedatatypes;

public class PrimitiveDataTypesOtherFormats {
    public static void main(String[] args) {
        /* Primitive Data Types Other Formats */
        // Octal Number Format
        // Start by O (Zero) and Followed by at Least
        // 2 Digits from 0 to 7
        int myIntOctalNumber1 = 031; // 25 in Decimal
        int myIntOctalNumber2 = 0346; // 230 in Decimal
        int myIntOctalNumber3 = 07; // 7 in Decimal
        System.out.println("=========== Octal Number ===========");
        System.out.println(myIntOctalNumber1);
        System.out.println(myIntOctalNumber2);
        System.out.println(myIntOctalNumber3);

        // Hexadecimal Number Format
        // Start by O (Zero) and X (or x) Followed by
        // a Hexadecimal Number from 0 to 9 and A to F
        int myIntHexadecimalNumber = 0x1A3; // 419 in Decimal
        float myFloatHexadecimalNumber = 0X453F; // 17727.0 in Decimal
        System.out.println("=========== Hexadecimal Number ===========");
        System.out.println(myIntHexadecimalNumber);
        System.out.println(myFloatHexadecimalNumber);

        // Binary Number Format
        // Start by O (Zero) and B (or b) Followed by
        // a Binary Number Containing Only 0 and 1 Digits
        byte myByteBinaryNumber = 0b011; // 3 in Decimal
        int myIntBinaryNumber = 0B1101; // 13 in Decimal
        System.out.println("=========== Binary Number ===========");
        System.out.println(myByteBinaryNumber);
        System.out.println(myIntBinaryNumber);
    }
}
