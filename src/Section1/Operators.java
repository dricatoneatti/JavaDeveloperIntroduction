package Section1;

public class Operators {

    public static void main(java.lang.String[] args) {
        int result = 1 + 2 ;
        System.out.println ("The result of 1 + 2 = " + result);

        //new variable to store the current result and assign to something else and validate the result.
        int previousResult = result;
        result = result - 1;
        System.out.println (previousResult + " - 1 = " +  result);

        previousResult = result;
        result = result * 10;
        System.out.println (previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println (previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println (previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println ("Result is now " + result);
        result ++;
        System.out.println ("Result is now " + result);
        result --;
        System.out.println ("Result is now " + result);

        //To abreviate it, we can also:
        result += 2;
        System.out.println ("Result is now " + result);

        result *= 10;
        System.out.println ("Result is now " + result);

        result -= 10;
        System.out.println ( "Result is now " + result);

        result /= 10;
        System.out.println ("Result is now " + result);

        //When used just one '=', it means that it is setting a value. Two '==' it means that is a comparative
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println ("It is not an alient!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println ("You got the high score!");

        //Both of these conditions must have be true to the message be presented
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println ("Greater than top score and less than 100");

        if((topScore > 50) || (topScore < secondTopScore))
            System.out.println ("Top Score is greater than 50 or less than Second Top Score");

        int newValue = 50;
        if(newValue == 50)
            System.out.println ("New Value is equals to 50");

        boolean isCar = false;
        if (isCar == true)
            System.out.println ("This is not supposted to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println ("WasCar is true");

        //1. Create a double variable with the value 20
            double value = 20;

        //2. Create a second variable of type double with the value 80
            double secondValue = 80;

        //3. Add both numbers up and multiply by 25
           double results = (value + secondValue) * 25;

        //4. Use the remainder operator to figure out to reminder from the sum of #3 divided by 40
            double remainder = results % 40;

        //5. Write an "if" statement that displays a message: "Total was over the list"
        // if the reminder total (#4) is equal to 20 or less.

        System.out.println ("MyTotal is: " + results);
        System.out.println ("Remainder is: " + remainder);

            if(remainder <= 20)
                System.out.println ("Total was over the list");

    }
}

