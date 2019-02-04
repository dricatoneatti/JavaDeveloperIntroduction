package Section1;

public class Methods {

    public static void main(java.lang.String[] args) {
        //In this class, we created a method 'calculatorScore' and we put the variables
        //that we had created before on 'ifKeywordsAndCodeBlocks' class as a parameter of the method.


        calculatorScore (false, 10000, 8, 200);

        int highScore = calculatorScore (true, 4000, 5, 100);
        System.out.println ("Your final score is: " + highScore);

        int highScorePosition = calculatedHighScorePosition (1000);
        displayHighScorePosition ("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition (900);
        displayHighScorePosition ("Tom", highScorePosition);

        highScorePosition = calculatedHighScorePosition (150);
        displayHighScorePosition ("Bob", highScorePosition);

        highScorePosition = calculatedHighScorePosition (50);
        displayHighScorePosition ("Felipe", highScorePosition);
    }

    public static int calculatorScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = +2000;

        }
        return -1;
    }


    public static void displayHighScorePosition(java.lang.String name, int highPosition) {
        System.out.println (name + " manage to get into position " + highPosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {

//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500){
//           return  2;
//        } else if (playerScore >= 100){
//            return 3;
//
//            //If there isnt any option more, we can leave without else
//        }
//            return 4;

        //For use less return statement, we can put in a variable that return the value of the position
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
                }


}
