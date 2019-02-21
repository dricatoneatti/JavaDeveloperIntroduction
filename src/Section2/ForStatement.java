package Section2;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println ("10,000 at 2% interest =  " + calculateInterest (10000.00, 2.0));
        System.out.println ("10,000 at 3% interest =  " + calculateInterest (10000.00, 3.0));
        System.out.println ("10,000 at 4% interest =  " + calculateInterest (10000.00, 4.0));
        System.out.println ("10,000 at 5% interest =  " + calculateInterest (10000.00, 5.0));
        System.out.println ("10,000 at 6% interest =  " + calculateInterest (10000.00, 6.0));
        System.out.println ("10,000 at 7% interest =  " + calculateInterest (10000.00, 7.0));

        for (int i = 2; i < 9; i++) {
            System.out.println ("10,000 at " + i + "%  interest =  " + String.format ("%.2f", calculateInterest (10000.00, i)));
        }

        //Solving example
        for (int i = 8; i >= 2; i--) {
            System.out.println ("10,000 at " + i + "% interest =  " + String.format ("%.2f", calculateInterest (10000.00, i)));
        }

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if(isPrime (i)){
                System.out.println ("Prime number: " + i);
                count ++;
                //how many prime numbers to show
                if(count == 7){
                    System.out.println ("Exiting");
                    break;
                }
            }
        }
    }



        public static double calculateInterest(double amount, double interestRate){
     return (amount * (interestRate/100));
    }



    public static boolean isPrime(int n) {

        //validate if is greater than 1
        if (n == 1) {
            return false;
        }

        //starts in 2, cause it has to be > than 1
        //no number is greater than n divided by two is going to divided into n

        for (int i=2; i <= n/2; i++){
            if ( n % i == 0 ){
                return false;
            }
        }
        return true;
    }



}
