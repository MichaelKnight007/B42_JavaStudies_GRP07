package week_08_String_Manuplation;


public class String_Manuplation_Exe {
    public static void main(String[] args) {
/*
        int num = 5;
        boolean bl12 = true;
        double db1 = 10.5;
        char ch1 = 'C';

        Class_And_Object obj = new Class_And_Object();

        Aliya aliya = new Aliya();

        String name1 = new String("Mike C"); // new keyword
        String str1 = "Java";// String Literal method str1==str2 ==> True
        String str2 = "Java"; // String Literal method
        // str1 and str2 are refencing to the same object in string pool
        String str3 = "java"; // String Literal method ==> It's a different object in String Pool
        //str1==str3 ==> False

        System.out.println(str1==str2); //true ==> Same objects
        System.out.println(str1==str3); // false ==> Different objects in the pool.

        System.out.println(str1.equals(str2)); // true same values
        System.out.println(str1.equals(str3)); // false different values


        String str4 = new String("Java"); // new keyword   ==> Created outside the pool in Heap Memory
        String str102 = new String("Java");
        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/";

        // str1==str4 ==> false different objects
        // str1.equals(str4) ==> true values are equal


        // **** String is "immutable" ****

        // String str1 = "Java";
        // String str2 = "Java";
        str1.toUpperCase();//JAVA
        System.out.println("str1 = " + str1);//Java

        str1 = str1.toUpperCase();//JAVA
        System.out.println("str1 = " + str1);//JAVA

        // ****************** STRING ***************************
        System.out.println();
        System.out.println("****************** STRING ***************************");
        System.out.println("****************** ****** ***************************");

        String string = "java".concat("script");
        System.out.println("string = " + string);//javascript*/

      /*  String str1 = "Java";// String Literal method
        String str2 = "Java"; // String Literal method
        // str1 and str2 are refencing to the same object in string pool
        String str3 = "java"; // String Literal method ==> It's a different object in String Pool*/


       /* String str4 = new String("Java"); // new keyword   ==> Created outside the pool in Heap Memory
        String str5 = new String("Java");

        System.out.println();*/


        // ==================== String Methods ===============================
        System.out.println(" ==================== String Methods ===============================");
       /* System.out.println("----------------- Comparing Strings (\"==\" or \".equals()\")----------------------");
        System.out.println();

        boolean result1 = str1 == str2; // true because "==" is checking if the reference types are referencing to the same object.
        boolean result2 = str1 == str4; //  false because they are not referencing to the same object.
        boolean result3 = str2 == str3; //  false because they are not referencing to the same object although both of them are created in the pool.
        boolean result4 = str4 == str5; //  false because they are not referencing to the same object.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);*/


        // by using "==" to compare 2 String, we mean to compare if they are referencing to the SAME OBJECT.*/


        /*
        String str1 = "Java";// String Literal method
        String str2 = "Java"; // String Literal method
        // str1 and str2 are refencing to the same object in string pool
        String str3 = "java"; // String Literal method ==> It's a different object in String Pool


        String str4 = new String("Java"); // new keyword   ==> Created outside the pool in Heap Memory
        String str5 = new String("Java");
         */

       /* boolean equalsMethod_1 = str1.equals(str2); // true
        boolean equalsMethod_2 = str1.equals(str4); // true
        boolean equalsMethod_3 = str2.equals(str4); // true
        boolean equalsMethod_4 = str1.equals(str3); // false
        boolean equalsMethod_5 = str4.equals(str5); // true




        System.out.println("equalsMethod_1 = " + equalsMethod_1);
        System.out.println("equalsMethod_2 = " + equalsMethod_2);
        System.out.println("equalsMethod_3 = " + equalsMethod_3);
        System.out.println("equalsMethod_4 = " + equalsMethod_4);
        System.out.println("equalsMethod_5 = " + equalsMethod_5);*/

        //   by using ".equals()" to compare 2 String, we mean to compare if they have the SAME VALUE.


       /* System.out.println("----------------- lenght() method----------------------");
        System.out.println();

        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/45567890*984651320ASDFGHJKLŞ"; // how many letters are there?

        int length_Of_Str5 = str5.length();
        System.out.println("length_Of_Str5 = " + length_Of_Str5); //

        String str100="C y d e o ";

       int result100= str100.length();
        System.out.println("result100 = " + result100); //
*/



      /* System.out.println();
        System.out.println("----------------- concat() Method----------------------");
        System.out.println();


        String str6 = "java";
        String str7 = "script";

       String str_101= str6.concat(str7);
        System.out.println("str6 = " + str6); // ??? java
        System.out.println("str7 = " + str7); // ??? script
        System.out.println("str_101 = " + str_101); // javascript
*/

       /* System.out.println();
        System.out.println("----------------- contains() Method----------------------");
        System.out.println();


         String str51 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/";


        boolean bl1 = str51.contains("I love Java and need help to learn more about Java."); // true
        boolean bl2 = str51.contains("Javs"); // false
        boolean bl3 = str51.contains("java"); // false
        boolean bl4 = str51.contains("Java"); // true
        boolean bl5 = str51.contains("I love Java and need help to  learn more about Java."); // false

        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);
        System.out.println("bl3 = " + bl3);
        System.out.println("bl4 = " + bl4);
        System.out.println("bl5 = " + bl5);

*/

        /*System.out.println();
        System.out.println("----------------- toLowerCase() / toUpperCase() Methods ----------------------");
        System.out.println();

        String str8 = "abcACT";

        str8.toUpperCase();//ABCACT
        System.out.println("str8 = " + str8); // abcACT

        String upperCase = str8.toUpperCase(); //ABCACT
        System.out.println("str8 after upperCase= " + upperCase);//abcACT
        // str8=str8.toUpperCase();

        String lowerCase = str8.toLowerCase();
        System.out.println("str8 after lowerCase= " + str8);//abcACT

        System.out.println("upperCase = " + upperCase); //ABCACT
        System.out.println("lowerCase = " + lowerCase); //abcact

*/


        /*System.out.println();
        System.out.println("----------------- trim() Method ----------------------");
        System.out.println();

        String str9_1 = "    Java    is  a programming language      .       ";
        String str9_1Trim = str9_1.trim();
        System.out.println("str9_1Trim =" + str9_1Trim); //Java    is  a programming language      .

        String str9_2 = "Java    is  a programming language      .       ";
        String str9_2Trim = str9_2.trim();
        System.out.println("str9_2Trim =" + str9_2Trim); //Java    is  a programming language      .

        String str9_3 = "    Java    is  a programming language      .";
        String str9_3Trim = str9_3.trim();
        System.out.println("str9_3Trim =" + str9_3Trim);

        String str9_4 = "    Java    is  a prog   ramm  ing language      .       ";
        String str9_4Trim = str9_4.trim();
        System.out.println("str9_4Trim =" + str9_4Trim); //Java    is  a prog   ramm  ing language      .

        */




      /* System.out.println();
        System.out.println("----------------- split() Method ----------------------");
        System.out.println();

        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/";

        System.out.println("str5 = " + str5);

        String [] str5AsArray=str5.split(" ");
        System.out.println("(str5AsArray.toString()) = " + (Arrays.toString(str5AsArray)));

        String[] splittedString = str5.split("");
        System.out.println("(splittedString.toString()) = " + (Arrays.toString(splittedString)));

        String str11 = "abcdefgh";
                     // 01234567
        System.out.println("str11 = " + str11);

        String[] splitedArray = str11.split(""); // Converting a String data type to a String Array.
        System.out.println("splited Array = " + Arrays.toString(splitedArray));


        // String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/";
        System.out.println("str5 = " + str5);
        String[] resultOfStr5AsArray = str5.split(" ");
        System.out.println("resultOfStr5AsArray = " + Arrays.toString(resultOfStr5AsArray));

*/
/*

        System.out.println();
        System.out.println("----------------- charAt() Method ----------------------");
        System.out.println();


        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.$#=(/";

        char ch12 = str5.charAt(16);// using index number...
        char ch2 = str5.charAt(140);
        char ch3 = str5.charAt(str5.length() - 1); //140
        //141 - 1

        System.out.println("ch1 = " + ch12); //n
        System.out.println("ch2 = " + ch2);  // /
        System.out.println("ch3 = " + ch3);  // /


        for (int i = 0; i < str5.length(); i++) {
            System.out.println("str5.charAt(" + i + ")=" + str5.charAt(i));
        }
*/



       /* System.out.println();
        System.out.println("----------------- indexOf() Method ----------------------");
        System.out.println();

         String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.";

        System.out.println("str5.indexOf(\"a\") = " + str5.indexOf("a")); //
        System.out.println("str5.indexOf(\"a\", 111) = " + str5.indexOf("a", 111)); //
        System.out.println("str5.indexOf(\"Java\") = " + str5.indexOf("Java"));
        System.out.println("str5.indexOf(\"Java.\") = " + str5.indexOf("Java.")); //
        System.out.println("str5.indexOf(\"javascript\") = " + str5.indexOf("javascript")); // -1
        System.out.println("str5.indexOf(\"Aisha\") = " + str5.indexOf("Aisha")); // -1
        System.out.println("str5.indexOf(\"%\") = " + str5.indexOf("%")); // -1

        System.out.println("(str5.indexOf(\"a\",str5.indexOf(\"h\"))) = " + (str5.indexOf("a", str5.indexOf("h"))));
*/



        /*System.out.println();
        System.out.println("----------------- replace() Method ----------------------");
        System.out.println();

        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.";


        String resultOfReplace_1 = str5.replaceAll("Java", "JavaScript");
        String resultOfReplace_3 = str5.replace("Java", "JavaScript");

        String resultOfReplace_2 = str5.replace(" ", ",");


        System.out.println("resultOfReplace_1 = " + resultOfReplace_1);
        System.out.println("resultOfReplace_2 = " + resultOfReplace_2);
        System.out.println("resultOfReplace_3 = " + resultOfReplace_3);

*/
       /* System.out.println();
        System.out.println("----------------- substring() Method ----------------------");
        System.out.println();

        String str5 = "I love Java and need help to learn more about Java. So I applied to Cydeo to learn testing applications both manually and in automation.";

        System.out.println("str5.charAt(21) = " + str5.charAt(21)); // return the character at index 21
        System.out.println("str5.charAt(30) = " + str5.charAt(30)); // return the character at index 27


        String resultOfsubstring_1 = str5.substring(21);
        String resultOfsubstring_2 = str5.substring(21, 30);
        // String resultOfsubstring_3 =str5.substring(21, 10);
        String resultOfsubstring_4 = str5.substring(21, 21); //
       // String resultOfsubstring_5 = str5.substring(21, 2);


        System.out.println("resultOfsubstring_1 = " + resultOfsubstring_1);//
        System.out.println("resultOfsubstring_2 = " + resultOfsubstring_2);
        System.out.println("resultOfsubstring_4 = " + resultOfsubstring_4);
        //System.out.println("resultOfsubstring_5 = " + resultOfsubstring_5);

*/

/*
        // ****************** STRING BUILDER_ Not Synchronized ***************************
        System.out.println();
        System.out.println("****************** STRING BUILDER ***************************");
        System.out.println("****************** ************** ***************************");
        System.out.println();


        StringBuilder strBuilder = new StringBuilder("Hello");

        //  ---------------- -------------- append() method and mutability ---------------------- -----------
        System.out.println("---------------- -------------- append() method and mutability ---------------------- -----------");
        strBuilder.append(" ");
        strBuilder.append("World ");
        strBuilder.append(2025);
        System.out.println();


        System.out.println("strBuilder after appending= " + strBuilder);
        System.out.println();

        //  ---------------- -------------- reverse() method  ---------------------- -----------

        System.out.println("---------------- -------------- reverse() method  ---------------------- -----------");
        strBuilder.reverse();
        System.out.println("strBuilder after reverse= " + strBuilder);
        System.out.println();

        //  ---------------- -------------- toString() method  ---------------------- -----------

        System.out.println("---------------- -------------- toString() method  ---------------------- -----------");


        String strBuilderToString = strBuilder.toString();
        System.out.println("strBuilderToString = " + strBuilderToString);

        // strBuilderToString.reverse();

        System.out.println();


        // ****************** STRING BUFFER _ Synchronized ***************************
        System.out.println("****************** STRING BUFFER ***************************");
        System.out.println("****************** ************* ***************************");
        System.out.println();


        StringBuffer strBuffer = new StringBuffer("I love");

        System.out.println();
        //  ---------------- -------------- append() method and mutability ---------------------- -----------
        System.out.println("---------------- -------------- append() method and mutability ---------------------- -----------");
        strBuffer.append(" ");
        strBuffer.append("Java");
        strBuffer.append(17);

        System.out.println("strBuffer = " + strBuffer);

        System.out.println();
        //  ---------------- -------------- reverse() method  ---------------------- -----------

        System.out.println("---------------- -------------- reverse() method  ---------------------- -----------");
        strBuffer.reverse();
        System.out.println("strBuffer = " + strBuffer);
        System.out.println();

        //  ---------------- -------------- toString() method  ---------------------- -----------

        System.out.println("---------------- -------------- toString() method  ---------------------- -----------");
        String strBufferString = strBuffer.toString();
        System.out.println("strBufferString = " + strBufferString);


        String str41 = "5";// character, I cannot use in arithmetic operations.

        System.out.println(1 + 10 + str41 + 1 + 10); //115110
        System.out.println(str41 + 1 + 10 + 1 + 10); //5110110
        System.out.println(1 + 10 + 1 + 10 + str41); //225


        String str42 ="Cydeo"; // str42.length()=5
     //str42.length()  12345
     //index numbers   01234
     */


        // ****************************************************************************************
        String string1 = "java, javascript, Java, JAVA, java, java,java, Java, JAVA, java ";
        String word = "Java";

        string1 = string1.toLowerCase(); //"java, javascript, java, java ..."
        word = word.toLowerCase(); // "java"

        howManySameWords(string1, word);
        System.out.println("*************************************************************");
        howManySameWordsWithSubstring(string1, word);

    }

    public static void howManySameWords(String sentence, String word) {

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while (sentence.contains(word)) {

            // sentence.contains(word);
            count++; //1, 2
            sentence = sentence.replaceFirst(word, "");
        }

        System.out.println(count);
    }

    public static void howManySameWordsWithSubstring(String sentence, String word) {
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        for (int i = 0; i < sentence.length() - word.length(); i++) {
            if ((sentence.substring(i, i + word.length())).equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
