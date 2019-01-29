public class IfKeywordsAndCodeBlocks {
    public static void main(java.lang.String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

         if ((score < 5000) && (score > 1000)){
             System.out.println ("Your score was less than 5000 and greater than 1000");
         } else if (score < 1000) {
             System.out.println ("Your score was less than 1000");
         }
         else{
             System.out.println ("Got here");
         }

         //Valida a pontuação final de um jogo terminado
        if(gameOver ==true){
            int finalScore = score + (levelCompleted * bonus);
             System.out.println ("Your final score is: " + finalScore);
        }

        //Print out a second score on the screen with the following
        //Score set to 10000
        //level completed set to 8
        //Bonus set to 200
        //But make sure the first print out above still displays as well

        //Ps: instead create new variables, we can just change the value of then:
         gameOver = true;
         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if ((score > 9000) && (score < 20000)) {
            System.out.println ("Your pontuation is greater than 9000 but it less than 20000");
        }
        else if(score < 10000){
            System.out.println ( "Your pontuation is less than 10000");
        } else {
            System.out.println ("Got here");
        }
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println ("Your final score is: " + finalScore);
        }

        }



    }

