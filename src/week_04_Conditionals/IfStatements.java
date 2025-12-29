package week_04_Conditionals;

public class IfStatements {
    public static void main(String[] args) {


        // Single If ==> Single Condition

        boolean hasFullTimeJob = false;

        if (hasFullTimeJob) { //false
            System.out.println("Congrats, you have full time job.");
        }

        if (5 * (3 + 4) == 35) { //true
            System.out.println("Congrats, you've digested the last week's lecture.");
        }

        // If/elseIf ==> 2 Conditions


        boolean isMarried = true;
        if (isMarried) {
            System.out.println("Congrats, you are lucky because you've found your true love.");
        } else {
            System.out.println("Try to search for your true love");
        }


        // Multi Block If ==> Multiple Conditions

        int grade = 67;

        /*if (grade <= 100 && grade >= 90) { //false
            System.out.println("Congrats, you are perfect.");
        } else if (grade <= 89 && grade >= 80) { // false
            System.out.println("Congrats, you are fine.");

        } else if (grade <= 79 && grade >= 70) { // false
            System.out.println("Congrats, you are done.");
        } else if (grade <= 69 && grade >= 60) { //true
            System.out.println("Congrats, you passed.");
        } else {
            System.out.println("Congrats, you are not perfect.");
        }*/


        // Nested If

        if (!(grade >= 100 || grade < 0)) { //false
            if (grade <= 100 && grade >= 90) { //false
                System.out.println("Congrats, you are perfect.");
            } else if (grade <= 89 && grade >= 80) { // false
                System.out.println("Congrats, you are fine.");

            } else if (grade <= 79 && grade >= 70) { // false
                System.out.println("Congrats, you are done.");
            } else if (grade <= 69 && grade >= 60) { //true
                System.out.println("Congrats, you passed.");
            }
            //System.out.println("Additional lines.");

            else {
                System.out.println("Congrats, you are not perfect.");
            }

        }
        System.out.println("Invalid grade, check your value of grade.");

        if (5 <= 6) System.out.println("5 is smaller than 6.");
        else if (6 > 5) System.out.println("6 is bigger than 5.");
        //System.out.println("Additional lines.");
        else System.out.println("There is no number in this condition");


        System.out.println("Additional lines.");

    }


}

