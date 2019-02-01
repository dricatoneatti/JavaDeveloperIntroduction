public class SecondsAndMinutesChallenge {
    public static void main(java.lang.String[] args) {
        System.out.println (getDurationString (65,45));

    }



    public static java.lang.String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) ||(seconds<0) || (seconds > 59)) {
            System.out.println ("Invalid value");
        }
        //convert the minutes to hours
        long hours = minutes / 60;

        //minutes that cannot fit into one hour
        long remainingMinutes = minutes % 60;

        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
}
