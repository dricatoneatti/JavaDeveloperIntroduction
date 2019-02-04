package Section1;

public class ExercisesII {

    public static void main(java.lang.String[] args) {

        System.out.println( area (5.0));
        System.out.println (area (-1));
        System.out.println (area (5.0 , 4.0));
        System.out.println ( area (-1,4.0)) ;

        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual (-1,-1,-1);
        printEqual (1,2,3);

        System.out.println (isCatPlaying (true, 10));
        System.out.println (isCatPlaying (false, 36));
        System.out.println (isCatPlaying (false,35));
    }

    //Exercise 1: AREA CALCULATOR

      public static double area (double radius) {
        if (radius < 0) {
            return -1;
        }

        double circleArea = radius * radius * Math.PI;
        return  circleArea;
    }

    public static double area (double x, double y){
       double areaRectangle = x * y;

       if((x < 0 ) || (y < 0)){
           return -1;
       }
        return areaRectangle;
    }

    //Exercise II: Minutes to Years And Days Calculator

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println ("Invalid Value");
        } else {

            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDays = day % 365;

            System.out.println (minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }


    //Exercise 3: Equality Printer

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println ("Invalid Value");
        } else if ((a == b) && (a == c) && (c == b)) {
            System.out.println ("All numbers are equal");
        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println ("All numbers are different");
        } else {
            System.out.println ("Neither all are equal or different");
        }

    }

    //Exercise 4: Playing Cat

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer ==true){
            return (temperature >= 25 && temperature <= 45);
        }else{
            return (temperature >=25 && temperature <=35);
        }
    }


}