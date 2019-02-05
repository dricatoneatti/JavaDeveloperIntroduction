package Section2;

public class DayOfTheWeekChallenge {
        public static void main(String[] args) {
        printDayOfTheWeek (-1);
        printDayOfTheWeek (3);
        printDayOfTheWeek (5);
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println ("Sunday");
                break;
            case 1:
                System.out.println ("Monday");
                break;
            case 2:
                System.out.println ("Tuesday");
                break;
            case 3:
                System.out.println ("Wednesday");
                break;
            case 4:
                System.out.println ("Thursday");
                break;
            case 5:
                System.out.println ("Friday");
                break;
            case 6:
                System.out.println ("Saturday");
                break;
            default:
                System.out.println ("Invalid Day");
                break;
        }
    }

        public static void printDayOfTheWeekIfAndElse(int dayII){
            if(dayII == 0) {
                System.out.println ("Sunday");
            }else if (dayII ==1){
                System.out.println ("Monday");
            } else if (dayII ==2){
                System.out.println ("Tuesday");
            }else  if (dayII ==3){
                System.out.println ("Wednesday");
            } else if (dayII ==4){
                System.out.println ("Thursday");
            } else if (dayII ==5){
                System.out.println ("Friday");
            } else if (dayII ==6 ){
                System.out.println ("Saturday");
        } else {
            System.out.println ("Invalid day");
        }
        }
    }

