package Section1;

public class ExercisesI {
    public static void main(java.lang.String[] args) {

        checkNumber (9320);
        printMegaBytesAndKiloBytes (2050);
        System.out.println (bark (true, 1));
        System.out.println (bark (true, -1));

        System.out.println (isLeapYear (-1600));
        System.out.println (isLeapYear (1600));
        System.out.println (isLeapYear (2017));
        System.out.println (isLeapYear (2000));

        System.out.println (areEqualByThreeDecimalPlaces (-3.1756, -3.175));
        System.out.println (areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println (areEqualByThreeDecimalPlaces (3.0, 3.0));

        System.out.println (hasEqualSum (1, 1, 1));
        System.out.println (hasEqualSum (1, 1, 2));
        System.out.println (hasEqualSum (1, -1, 0));

        System.out.println (hasTeen(9, 99, 19));
        System.out.println (hasTeen(23, 15, 42));
        System.out.println (hasTeen(22, 23, 34));

    }

    //EXERCISE 1: Positive, Negative and Zero Numbers.
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println ("Positive");
        } else if (number < 0) {
            System.out.println ("Negative");
        } else if (number == 0) {
            System.out.println ("Zero");
        }
    }

    //EXERCISE 2: MegaBytes Converter - 1MB = 1024KB.
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println ("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println (kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    //EXERCISE 3: Barking Dog
    public static boolean bark(boolean barking, int hourOfDay) {


        if (barking == false) {
            return false;
        } else if ((barking == true && (hourOfDay >= 0) && (hourOfDay < 8))) {
            return true;
        } else if ((barking == true && (hourOfDay > 22) && (hourOfDay <= 23))) {
            return true;
        } else if (barking == true && (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        }

        return false;

    }

    //EXERCISE 4: Leap Year
    public static boolean isLeapYear(int year) {
        if ((year <= 1) || (year > 9999)) {
            return false;
        } else if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    //EXERCISE 5: Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        double countA = a * 1000;
        double countB = b * 1000;

        if ((int) countA == (int) countB) {
            return true;
        }

        return false;
    }


    //EXERCISE 6: Has Equal Sum
    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        return false;

    }

    //EXERCISE 7: Has Team - Numbers between 9 and 19
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
        }

    }



