package com.dgmf.basics.a.primitivedatatypes;

public class CharacterStrings {
    public static void main(String[] args) {
        /* Java Programming Language also Provides Special
        Support for Character Strings via The “Java.Lang.String” Class.
        The String Class is not technically a Primitive Data Type.
        But considering the Special Support given to It by the Language,
        you'll probably tend to think of It as Such.
        Strings are a Sequence of Characters.
        */

        /* Creating Strings */
        /* Direct Way */
        // The most direct Way to create a String is to enclose a Character
        // String within Double Quotes. This will automatically create a
        // new String Object.
        String greeting = "Hello World !";
        System.out.println(greeting);
        // IN THE JAVA PROGRAMMING LANGUAGE, STRINGS ARE OBJECTS.
        // Whenever It encounters a String Literal in the code, the
        // Compiler creates a String Object with its Value, in
        // this case, “hello world !”.

        /* "new" Keyword */
        /* As with any other object, you can create String objects by
        using the « new » keyword and a constructor.
        The String class has several constructors that allow you to provide
        the initial value of the string using different sources, such as an
        array of characters.
        */
        String helloString = new String("Hello World !");
        System.out.println(helloString);

        if(greeting == helloString) {
            System.out.println("greeting Equal helloString");
        } else {
            System.out.println("greeting Not Equal helloString");
        }

        // Strings are more commonly concatenated with the « + » operator
        String stringA = "You are ", stringB = " welcome !";
        System.out.println(stringA + stringB);

        /* Methods
        The String class has a number of methods which appear to
        modify strings.
        Since strings are immutable, what these methods really do is
        create and return a new string that contains the result of the
        operation.
        */
        // length() Method
        // Returns the number of characters contained in the string object.
        System.out.println(greeting);
        System.out.println(greeting.length());

        // concat() Method
        // Method to concatenate two strings. Returns a new String that
        // is string1 with string2 added to it at the end.
        String string1 = "Hello ";
        String string2 = "Friends !";
        String concatString = string1.concat(string2);
        System.out.println("String1 = " + string1);
        System.out.println("String2 = " + string2);
        System.out.println("Concatenated String = " + concatString);
        // You can also use the concat() Method with String literals
        System.out.println("My First Name is ".concat("Glaz"));

        // Static format() Method
        // Returns a String object
        // Creates a Formatted String that you can reuse
        float average = 14.76F;
        String formatAverage = String.format("My Average in Maths is : %.2f", average);
        System.out.println(formatAverage);
        String fullName = "John Doe";
        String formatFullName = String.format("My Full Name is : %s", fullName);
        System.out.println(formatFullName);
        int age = 18;
        String formatAge = String.format("My Age is : %d", age);
        System.out.println(formatAge);

        // NOTE :
        // For each Object that is not a String, its toString() Method
        // is called to convert It to a String. We will see that a little later.
    }
}
