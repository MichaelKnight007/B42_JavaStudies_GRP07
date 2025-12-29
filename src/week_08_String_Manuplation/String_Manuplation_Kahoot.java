package week_08_String_Manuplation;

public class String_Manuplation_Kahoot {
    public static void main(String[] args) {
        // ****************** KAHOOT QUESTIONS ********************

        // ----------------- Q_3 ----------------------

       /* System.out.println("----------------- Q_3 ----------------------");
       String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);*/


        // ----------------- Q_4 ----------------------

     /*  System.out.println("----------------- Q_4 ----------------------");
       String s = "Java String Quiz";
        System.out.println(s.charAt(s.toUpperCase().length()));*/



        // ----------------- Q_5 ----------------------

      /* System.out.println("----------------- Q_5 ----------------------");
       String str = "Hello World";
                  // 012345
       str.trim();
       int z=str.indexOf(" ");
        System.out.println(z);*/



        // ----------------- Q_6 ----------------------

     /* System.out.println("----------------- Q_6 ----------------------");
       String str = "abcde";
               System.out.println(str.substring(1,3));
*/


        // ----------------- Q_7 ----------------------

      /*System.out.println("----------------- Q_7 ----------------------");
       String s1 = "Welcome to Java";
               System.out.print(s1.substring(3,3)); // Nothing
        System.out.println(s1.indexOf('o')); // 4*/

       /* // ----------------- Q_8 ----------------------
        System.out.println("----------------- Q_8 ----------------------");
        String str = "CydeoSchool";
        System.out.print(str.substring(5,3)); //

*/

        // ----------------- Q_10 ----------------------

      /* System.out.println("----------------- Q_10 ----------------------");
        String str1 = " Java ";
        String str2 = " is ";
        String str3 = " awesome    .";


        String strResult = str1.trim() + str2 + str3.trim();
        System.out.println("strResult =" + strResult);
*/

        // ----------------- Q_11 ----------------------

       /* System.out.println("----------------- Q_11 ----------------------");
        String x = "abc";
        String y = " acb ";

       x.concat(y);
        System.out.println(x);*/



        // ----------------- Q_12 ----------------------
/*

        System.out.println("----------------- Q_12 ----------------------");
        String s1 = "abcdefg";
        String s2 = ""+s1.charAt(0)+s1.charAt(s1.length());
        System.out.println(s2);
*/





        // ----------------- Q_13 ----------------------

        System.out.println("----------------- Q_13 ----------------------");
        String s1 = new String("java");
        String s2 = new String("JAVA");

        System.out.println(s1=s2);




        // ----------------- Q_14 ----------------------

        System.out.println("----------------- Q_14 ----------------------");
        String str1 = "Cydeo";
        String str2 = "Cydeo";
        String str3 = new String("Cydeo");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));



        String str22="Java";
        String str222="java";

        System.out.println("str22.equals(str222) = " + str22.equals(str222));//false

        System.out.println("str22.equalsIgnoreCase(str222) = " + str22.equalsIgnoreCase(str222));


    }
}
