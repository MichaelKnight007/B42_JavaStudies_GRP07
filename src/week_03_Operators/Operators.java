package week_03_Operators;

import week_07_Class_And_Object.EmployeeClass;

public class Operators {



    public static void main(String[] args) {


        EmployeeClass  employeeClass=new EmployeeClass();
        employeeClass.yearsOfExperience=5;

        System.out.println("Hello World" + " Hello Cydeo");

        System.out.println(35 + "Hello grp_07"); //
        System.out.println(3 + 5 + "Hello grp_07"); //
        System.out.println(3 + 5 + "Hello grp_07" + 3); //
        System.out.println(3 + 5 + "Hello grp_07" + 3 + 5); //
        System.out.println(3 + 5 + "Hello grp_07" + (3 + 5)); //
        System.out.println(3 + 5 + "" + 3 + 5); //
        System.out.println("Cydeo" + 5 * 5); //

        System.out.println("-------------------------------------------------------------");
        System.out.println(5 + 5); // 10
        System.out.println(5 - 5); // 0
        System.out.println(5 * 5); // 25
        System.out.println(25 / 5); // 5
        System.out.println(2564 / 10); //
        System.out.println(2564 % 10); // Modules

        long creditCardNumbers = 4152_6523_8564_9687l; // 41** **** **** 9687

        long last4DigitsOfCreditCard = creditCardNumbers % 10000;
        System.out.println("last4DigitsOfCreditCard = " + last4DigitsOfCreditCard);


        // Preceeding of math operations

        System.out.println("( 5+4*5) = " + (5 + 4 * 5)); //25
        System.out.println("((5 + 4) * 5) = " + ((5 + 4) * 5)); // 45

        // PAMDS ==> Paranthesis, Addition, Multiplication, Division, Subtruction

        System.out.println("((3+3) -5 * 2) = " + ((3 + 3) - 5 * 2)); // (6) - 5 * 2 // -4

        System.out.println("(12 + 6 - 3) = " + (12 + 6 - 3)); //15

        System.out.println("(12 + 6 / 3) = " + (12 + 6 / 3)); //6


        // -------------- Unary Opeartors ------------------


        System.out.println(" // -------------- Unary Opeartors ------------------");

        // -------------- Pre Increment and decrement

        System.out.println("// -------------- Pre Increment and decrement");
        int num = 25;
        System.out.println(num + 1); //26

        System.out.println("num = " + num); // 25

        System.out.println("(++num) = " + (++num)); // 26 num=num+1
        System.out.println("num = " + num);// 26


        System.out.println(num - 1); //25

        System.out.println("num = " + num); // 26

        System.out.println("(--num) = " + (--num)); // 25 num=num-1
        System.out.println("num = " + num);// 25

        // -------------- Post Increment and decrement

        System.out.println("// -------------- Post Increment and decrement");

        int speed = 50;

        System.out.println(speed--);//50 speed= speed-1
        // speed
        System.out.println("speed = " + speed); //49

        int int_1 = 4 / 2; // 2
        float flt_1 = 4 / 2f; // 2.0

        double db = 9 / 2; // 4.5
        int int_2 = 9 / 2; // 4

        int a = 5;
        System.out.println("(a += 3) = " + (a += 3)); // a=a+3;

        System.out.println("a = " + a); // 8

        //a /= 2;

        System.out.println("a = " + a);
        //

        System.out.println((5 >= 6) & ++a >= 6 ); // false
        // false & true ==> false

        System.out.println((5 >= 6) && ++a >= 6 ); // false
        // false & true ==> false
    }
}
