package Section2;

public class SumOldExercise {

    public static void main(String[] args) {
        System.out.println (sumOdd (1, 100));
        System.out.println (sumOdd (-1, 100));
        System.out.println (sumOdd (100, 100));
        System.out.println (sumOdd (100, -100));
        System.out.println (sumOdd (100, 1000));

    }

    public static boolean isOdd(int number) {
        //ODD NUMBER: REMAINDER NUMBER IS DIFFERENT THAN 0
        if ((number < 0)) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else
            return false;

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end < start) || (start < 0) || (end < 0)) {
            return -1;
        }

        int i = 0;
        for (i = start; i <= end; i++) {
            if (isOdd (i)) {
                sum += i;
            }
        }
        return sum;
        }

}






