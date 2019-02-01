public class MethodOverloading {
    public static void main(java.lang.String[] args) {
        int newScore = calculateScore ("Joaquim", 500);
        System.out.println ("The new score is " + newScore);
        calculateScore (75);
        calculateScore ();
        calFeetAndInchesToCentimeters (6, 0);

        calFeetAndInchesToCentimeters (100);
    }

    public static int calculateScore(java.lang.String playerName, int score) {
        System.out.println ("Player: " + playerName + " - Scored: " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println ("Unnamed player Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println ("No player name, no player score");
        return 0;
    }

    //Exercise: 1 inch = 2.54 cm and 1 feet = 12 inches
    public static double calFeetAndInchesToCentimeters(int feet, int inches) {


        if ((feet < 0) || ((inches < 0) || (inches > 13))) {
            return -1;
        }

        //Calculate the total centimeters
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println ("The comprise is " + centimeters + " centimeters");
        return centimeters;
    }


    public static double calFeetAndInchesToCentimeters(int inches) {

        if (inches < 0) {
            return -1;
        } else {
            //Calculate how many feet exists in the inches
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println (inches + "inches are equals to " + feet + " feet and " + remainingInches + " inches");
            return calFeetAndInchesToCentimeters ( (int) feet , inches);
        }


    }



}
