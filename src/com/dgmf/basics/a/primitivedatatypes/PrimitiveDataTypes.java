package com.dgmf.basics.a.primitivedatatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /* byte
        The byte data type :
            -	is 8 bits (1 octet) signed two's complement integer.
            -	has :
                - a minimum value of -128,
                - a maximum value of 127 (inclusive).
                - a default value of 0.
        */

        /* short
        The short data type :
            -	is 16 bits (2 octets) signed two's complement integer.
            -	has :
                - a minimum value of -32,768,
                - a maximum value of 32,767 (inclusive).
                - a default value of 0.
        */

        /* int
        By default, the int data type :
            -	is 32 bits (4 octets) signed two's complement integer,
            -	has :
                - a minimum value of -2^31,
                - a maximum value of 2^31 - 1.
                - a default value of 0.
        In Java SE 8 and later, you can use the int data type to represent an
        unsigned 32 bits (4 octets) integer, which has a minimum value of 0 and
        a maximum value of 2^32 - 1.
        */
        int intVar1, intVar2 = 8; // inVal1 ==> 0

        // System.out.println(intVar1); // Variable 'intVar1' might not have been initialized
        System.out.println(intVar2);

        /* long
        The long data type :
            -	is 64 bits (8 octets) signed two's complement integer.
            -	has :
                - a minimum value of -2^63,
                - a maximum value of 2^63 - 1.
                - a default value of 0L.
        In Java SE 8 and later, you can use the long data type to represent an
        unsigned 64 bits (8 octets) long, which has a minimum value of 0 and
        a maximum value of 2^64 - 1.
        */

        /* float
        The float data type :
            - is a single-precision 32 bits (4 octets) IEEE 754 floating point.
            - has a default value of 0.0f.
        */

        /* double
        The double data type :
            - is a double-precision 64 bits (8 octets) IEEE 754 floating point.
            - has a default value of 0.0d.
        */
        double doubleVar1 = 2.45;
        // double doubleVar2; // 0.0

        System.out.println(doubleVar1);
        // System.out.println(doubleVal2); // Variable 'doubleVal2' might not have
        // been initialized

        /* boolean
        This boolean data type :
            -	represents 1 bit of information, but its "size" isn't something
            that's precisely defined.
            -	has :
                - only two possible values : true or false.
                - default of false.
            Use this data type for simple flags that track true/false conditions.
        */
        boolean boolVar1 = false;
        boolean boolVar2 = true;
        // boolean boolVar3; // false

        System.out.println(boolVar1);
        System.out.println(boolVar2);
        // System.out.println(boolVar3); // Variable 'boolVar3' might not have been initialized

        /* char
        The char data type :
            -	 is 16 bits (2 octets) single Unicode character.
            -	has :
                - a minimum value of '\u0000' or 0,
                - a maximum value of '\uffff' or 65,535 inclusive.
                - a default value of '\u0000'.
        */
        char charVar1, charVar2 = 'M'; // charVar1 ==> '\000'

        // System.out.println(charVar1); // Variable 'charVar1' might not have been initialized
        System.out.println(charVar2);
    }
}
