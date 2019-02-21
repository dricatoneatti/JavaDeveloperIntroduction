package Section2;

public class Sum3And5Challenge {
    public static void main(String[] args) {

        int count=0;
        int sum = 0;

        //For statement that sum and show the number that is divisible by 3 and 5.
        for (int i = 1; i<=1000; i++) {
            if((i%3 ==0) && (i%5 ==0)){
                count++;
                sum += i;
                System.out.println ("Number that has conditions: " + i);
            }

            if(count==5){
                break;
            }

        }

        System.out.println ("Sum = " + sum);
    }
}
