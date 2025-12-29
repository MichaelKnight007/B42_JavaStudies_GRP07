package week_06_Methods;

public class Methods {


    //******************** Creating An Instance / Non-static No Return Method **********************
    public void secondMethod() {
        thirdMethod();
        System.out.println("Second Method is instance.");
        firstMethod();
        System.out.println("Second Method is final.");
        thirdMethod();

    }


    //************************* Creating Another Static No Return Method *****************************

    public static void thirdMethod() {
        System.out.println("Third Method is also static.");
        firstMethod();
        System.out.println("Third Method is final.");


    }


    public static void main(String[] args) {


       /* public static void firstMethod_2() {
            System.out.println("First Method is static.");
        }*/


        firstMethod();
        System.out.println(" ////////////////////////////////////////");
        thirdMethod();


        int a = 10;   // 1
        double b = 10.5;  // 2
/*

        // Calling a method
        displayMessage_1();// 3
        displayMessage_1(); // 5

        System.out.println("a+b= " + (a + b)); //5  a+b= 20.5


        System.out.println();
        System.out.println("------------------ Hierarchical Method  Calls --------------------");
        displayMessage_2();*/

        System.out.println();
        System.out.println("------------------ Giving Parameters and Passing Arguments --------------------");

        String nameOfTheBookIRead = "Farewell to Arms";

        displayMessage_1();// I don't have any parameters
        displayMessage_3("Les Missarables"); //
        displayMessage_3(nameOfTheBookIRead);
        displayMessage_4("Michael", "Knight", 1974);


        System.out.println();
        System.out.println(" ------------------------------- Display Number --------------------------");

        int age = 50;

        displayNumber(age);

        displayNumber(10);
        displayNumber(5000);

        System.out.println();
        System.out.println(" ------------------------------- Taking X Square Of A Number --------------------------");
        xSquareOfANumber(2);
        xSquareOfANumber(5);
        xSquareOfANumber(9);

        System.out.println();
        System.out.println("------------------ Multiple Parameters  --------------------");
        //  sum(5, 10);


        method_With_Different_Data_Type_Parameters("Michael", 50, 'M');
        method_With_Different_Data_Type_Parameters("Maya", 18, 'F');
        method_With_Different_Data_Type_Parameters("Nur", 18, 'F');
        method_With_Different_Data_Type_Parameters("Nur", 18, 'F');


        System.out.println();
        System.out.println("------------------ Return Methods  --------------------");

        double maxValue = max(5, 6);
        System.out.println(maxValue * 20); // 120

        System.out.println("min (5, 6) = " + min(5, 6));

        // System.out.println(displayMessage_4("Knight", 1974));

        //  String michael = displayMessage_4("Michael", 1974);

        //System.out.println("michael = " + michael);
        System.out.println(displayMessage_4("Sabrina", "Kaya", 2002));

        String faris = displayMessage_4("Faris", "El Battahe", 1990);

        System.out.println("faris = " + faris);

        System.out.println(sum(5, 6)); // Argument
        System.out.println(sum(5.5, 6));
        System.out.println(sum(5, 6, 7, 8));
        double num56 = sum(5.5, 6.6, 5.8);

        sum(2,5);
        sum(5,9,3);
        sum(5.9, 5, 9.5, 9.5);


    }

    //************************* Creating A Static No Return Method *****************************

    public static void firstMethod() {
        System.out.println("First Method is static.");
    }

    // ***************************************************


    //  ---------------- Calling a method -------------------
    public static void displayMessage_1() {
        System.out.println("Hello Group_6"); //4 -6
    }


    //  ---------------- Hierarchical Method  Calls -------------------

    public static void displayMessage_2() {
        System.out.println("I'm displayMessage_2 and now I'm calling displayMessage_1");
        displayMessage_1();
        System.out.println("Now I'm done...");
    }


    //"------------------ Giving Parameters and Passing Arguments --------------------"
    public static void displayMessage_3(String name_Of_The_Book) {

        System.out.println("Hello, I'm reading " + name_Of_The_Book + " now. It's so interesting.");

    }


    //------------------------------- Display Number --------------------------
    public static void displayNumber(int number) {// when we create it's called parameter
        System.out.println("The value is " + number);
    }


    // ------------------------------- Taking X Square Of A Number --------------------------
    public static void xSquareOfANumber(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= number;
        }

        System.out.println("Result after taking " + number + " Square Of your number = " + result);
    }


    // ------------------------------- Multiple Parameters --------------------------
/*
    public static void sum(int a, int b) {
        System.out.println("The sum is " + a + " + " + b + " = " + (a + b));
    }*/


    public static void method_With_Different_Data_Type_Parameters(String name, int age, char gender) {
        System.out.println("Name of the new student is " + name + " and his/her age is " + age + " and gender is " + gender + ".");
    }


    // *********************************  Return Methods   *************************

    public static double max(int a, int b) {

        int max;

        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else {
            System.out.println("Numbers are equal.");
            return a;
        }
        return  max;
    }


    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        return min;
    }

    public static String displayMessage_4(String firstName, String lastName, int birthyear) {

        int age = 2025 - birthyear;

        // System.out.println( "Hello " + firstName + " " + lastName +  " you're " + age + " years old.");

        // System.out.println(str);

        //return str;

        return "Hello " + firstName + " " + lastName + " you're " + age + " years old.";


    }


    // *********************************  Methods Overloading  *************************

    public static int sum(int a, int b) {

        return a + b;

    }

    public static double sum(int a, double b) {

        return a + b;
    }

    public static double sum(double a, int b) {

        return a + b;
    }

    public static double sum(double a, double b) {

        return a + b;

    }

    public static int sum(int a, int b, int c, int d,  int e) {

        return a + b;

    }

    public static int sum(int a, int b, int c, int d) {

        return a + b + c + d;

    }

    public static double sum(double a, int b, double c, double d) {

        return a + b + c + d;

    }


    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(int a, double b, int c) {
        return a + b + c;
    }


    public static void methodStatic() {
        System.out.println("This is a static method.");
    }

    public void methodInstance() {
        System.out.println("This is an instance method.");
    }

    public static double sum(double a, double b, double c) {

        return a + b + c;

    }

}
