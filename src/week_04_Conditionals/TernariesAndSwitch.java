package week_04_Conditionals;

public class TernariesAndSwitch {
    public static void main(String[] args) {

        //Ternaries
// ? ==> if : ==> else

        int a = (5 > 6) ? 7 : (6 > 5) ? 8 : 0;
                // false        true
        System.out.println("a = " + a);// 8



        // Switch
        int grade = 88;

       /* switch (grade / 10) {
            // case 99 - 80



            case 9, 8:
                System.out.println("Congrats, Perfect. Grade: " + grade);
             break;
            case 10:
                System.out.println("Congrats, Marvelous. Grade: " + grade);
                break;
            case 7, 6:
                System.out.println("Congrats, Perfect. Grade: " + grade);
                break;
            default:
                System.out.println("Needs Improvement");
                break;

        }
*/

        //Switch with Lambda


        switch (grade / 10) {
            case 10 -> System.out.println("Congrats, Marvelous. Grade:" + grade);
            // in case it is 10, then print ...
            case 8, 9 -> System.out.println("Congrats, Perfect. Grade:" + grade);
            default -> System.out.println("Needs Improvement");
        }


    }
}
