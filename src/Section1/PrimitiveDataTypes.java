package Section1;

import java.sql.SQLOutput;

public class PrimitiveDataTypes {
    public static void main(java.lang.String[] args) {
        //A byte variable and set it to any valid byte number
        byte myByteVariable = 10;

        //A short variable and set it to any valid short number
        short myShortVariable = 20;

        //A int variable and set it to any valid int number
        int myIntVariable = 50;

        //A variable of type long and make it equal to 5000 + 10 times the sum
        // of the byte , plus the short plus the int
        long myLongVariable = 5000 + 10 * (myByteVariable + myShortVariable + myIntVariable);

        System.out.println ("My Long Total: " + myLongVariable);

    }

}
