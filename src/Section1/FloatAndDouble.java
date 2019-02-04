package Section1;

public class FloatAndDouble {
        public static void main(java.lang.String[] args) {

        //width of a int: 32 (4bytes)
        int myIntValue = 5/2;

        //width of a float: 32 (4bytes)
        float myFloatValue =  5f/2f;

        //width of a double: 64 (8bytes)
        double myDoubleValue = 5d/2d;

        System.out.println ("My int Value = " + myIntValue);
        System.out.println ("My float Value = " + myFloatValue);
         System.out.println ("My double Value = " + myDoubleValue);


        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of the pounds.
            double numberPounds = 200d;
        //2. Calculate the number of Kilograms for the number above and store in a variable
            double numberKilograms = numberPounds * 0.45259237;
        //3. Print out the result
            System.out.println (numberKilograms);
        //NOTES: 1 pound is equal to 0.45259237 kilograms.


    }
}
