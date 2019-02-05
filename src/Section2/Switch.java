package Section2;

public class Switch {
    public static void main(String[] args) {

        //Example to print if the number is 1 or 2 or neither both
        int number = 1;
        if (number == 1) {
            System.out.println ("number is 1");
        } else if (number == 2) {
            System.out.println ("number is 2");
        } else {
            System.out.println ("number is not 1 and 2");
        }

        //Same example to print what is the number usind Switch
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println ("Number is 1");
                break;

            case 2:
                System.out.println ("Number is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println ("Number was 3, 4 or 5");
                System.out.println ("It is" + switchValue);
                break;

            default:
                System.out.println ("number is not 1 and 2");
                break;
        }

        String city = "São Paulo";
        switch (city) {
            case "São Paulo":
                System.out.println ("SP");
                break;

            case "Rio de Janeiro":
                System.out.println ("RIO");
                break;

            default:
                System.out.println ("isnt São paulo or Rio de Janeiro");
                break;
        }

        char charValue = 'C';
        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println ("Char is founded");
                break;
            default:
                System.out.println ("Char not founded");
        }


    }
}

