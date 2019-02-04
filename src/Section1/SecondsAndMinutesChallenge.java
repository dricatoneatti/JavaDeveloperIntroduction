package Section1;

public class SecondsAndMinutesChallenge {

    //Constant variable
    private static final java.lang.String INVALID_VALUE_MESSAGE = "Ivalid value";
    public static void main(java.lang.String[] args) {


        System.out.println (getDurationString (65, 45));
        System.out.println (getDurationString (3945L));
        System.out.println (getDurationString (-41));
        System.out.println (getDurationString (65, 9));

    }


    public static java.lang.String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return  INVALID_VALUE_MESSAGE;
        }

        //calculate the hour
        long hour = minutes / 60;

        //calulate the remaining minutes
        long remainingMinutes = minutes % 60;

        //Add zero when had just 1 number on hour, minutes or seconds
        java.lang.String hourString = hour + "h ";
        if(hour <10 ){
                hourString = "0" + hourString;
        }

        java.lang.String minuteString = remainingMinutes + "m ";
        if (remainingMinutes <10){
            minuteString = "0" + minuteString;
        }

        java.lang.String secondsString = seconds + "s ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hourString + minuteString +secondsString;
    }


    private static java.lang.String getDurationString(long seconds){
        if(seconds <0){
            return INVALID_VALUE_MESSAGE;
        }
        //calculate minutes in the seconds
        long minutes = seconds / 60;

        //remaining seconds
        long remainingSeconds = seconds % 60;

        //call overLoading method
        return getDurationString (minutes, remainingSeconds);

    }

}