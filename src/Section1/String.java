package Section1;

public class String<lastString, myInt> {

    public static void main(java.lang.String[] args) {
        java.lang.String myString = "This is a String";
        System.out.println ("myString is equal to: " + myString);
        myString = myString + " with more text to add";
        System.out.println ("myString were updated to: " + myString);
        myString = myString + " \u00A9 2019 ";
        System.out.println ("myString adding an unicode: " + myString);

        //It not will br calculated cause is a text, not a number
        java.lang.String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println ("The result is " + numberString);

        //Java converts the integer number to a string, so isnt calculated, is just add as string
        java.lang.String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println (lastString);

        //same example with double number is gonna to happen the same thing: Java will convert to string and add the values
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println (lastString);
    }

    }

