package week_02_Variables;


import week_06_Methods.Methods;

public class Variables extends Methods{
    public static void main(String[] args) {

        Methods.thirdMethod();
        Methods.firstMethod();

        Methods method_1 = new Methods();
        method_1.thirdMethod();
        method_1.secondMethod();

        // Why do we need Variables?
        System.out.println("Hello Grp_08.");

        System.out.println("Grp_08 is great.");

        System.out.println("Grp_08 has 15 students.");

        String grpName = "Grp_17";
        System.out.println("Hello " + grpName + ".");
        System.out.println(grpName + " is great.");
        System.out.println(grpName + " has 15 students.");


        String grpName2 = "G";
        char grpName3 = 'G';
        System.out.println("Hello " + grpName2 + ".");

        int asl = 1054162121;
        System.out.println("Hello " + asl + ".");

        int myNumber;
        String my_Number12;

        double myClass;

        // Casting

        int num1 = 7;
        System.out.println(num1); //7

        double num2 = num1;
        System.out.println(num2); // 7.0

        double num3 = 1.9999999999999999;
        System.out.println("num3= " + num3); // 1.99999

        int num10 = (int) num3;

        System.out.println("num10 = " + num10); //1

        int num4 = (int) num3;
        System.out.println(num4); // 1


        int num5 = 256;
        byte num6 = (byte) num5;
        System.out.println("num6 = " + num6);


    }
}
