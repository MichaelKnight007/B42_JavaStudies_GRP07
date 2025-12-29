package week_06_Methods;

public class Methods_Practice_And_Kahoot {
    public static void main(String[] args) {

        Methods.firstMethod();

        // ---------- Adding 10 -----------------
        System.out.println();
        System.out.println("---------- Adding 10 -----------------");

        int a = 10;
        add10(a);
        System.out.println(a);//10
        System.out.println("add10_2(a) = " + add10_2(a)); //20

        System.out.println("new a after add10_2 method is: " + a);

        a = add10_2(a); //20
        System.out.println("a after assigning return value of add10_2()= " + a); //20

        int number_1 = 200;

        System.out.print("doCalculator(var1) = " + doCalculator(number_1)); //400
        System.out.println(" number_1 = " + number_1);

        number_1 = doCalculator(number_1); //400
        System.out.println(" number_1 = " + number_1); //400


    }


    // ****************************** Methods **************************

    public static void add10(int num) {

        num = num + 10; // num+=10 20

        System.out.println("new a after add10 method is: " + num);

    }

    public static void add10(int num, int num2) {

        num = num + 10 + num2; // num+=10 20

        System.out.println("new a after add10 method is: " + num);

    }

    public static void add10(double num) {

        num = num + 10; // num+=10 20

        System.out.println("new a after add10 method is: " + num);

    }

    public static void add10(int num, double num2) {

        num = num + 10 ; // num+=10 20

        System.out.println("new a after add10 method is: " + num);

    }

    private  double add10(double num, int num2) {

        num = num + 10 ; // num+=10 20

        System.out.println("new a after add10 method is: " + num);

        return num;
    }

    public static int add10_2(int num) {
        num = num + 10; // num+=10 20

        // System.out.println("new a after add10 method is: "+ num);
        return num;
    }

    public static int doCalculator(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}
