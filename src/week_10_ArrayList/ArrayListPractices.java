package week_10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractices {
    public static void main(String[] args) {

        System.out.println(" Hello Group7");

        // ----------- ArrayList Structure -----------------------

       /* String[] strArray = new String[5];
        System.out.println("strArray = " + Arrays.toString(strArray));// [null, null, null, null, null]

        strArray[4] = "Cydeo";

        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("list1 = " + list1);

        list1.add("Cydeo");// 1st element index 0
        list1.add("Java");// 2nd element index 1
        list1.add("Phyton");// 3rd element index 2
        list1.add("Cybertek");


        System.out.println("list1 = " + list1); //[Cydeo, Java, Phyton, Cydeo]

        ArrayList<String> list = new ArrayList<>(5);
        System.out.println("list = " + list);
*/

        // ---- What is the output? -----------
        //ArrayList<int> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>(); // Wrapper classes
        //Arraylist accepts only non-primitives (objects)

        ArrayList<Integer> list2 = new ArrayList<>();


        // ************** ArrayList Methods ************************
        System.out.println("************** ArrayList Methods ************************");
        System.out.println();
        System.out.println("------------------ add() and remove() ------------------");
        System.out.println();


        ArrayList<Double> prices = new ArrayList<>();

        prices.add(5.5); //index 0
        prices.add(6.6);//index 1
       // prices.add(6);//index 2

        System.out.println("prices = " + prices);// [5.5, 6.6]

        prices.add(0, 7.7); //
        System.out.println("prices = " + prices);//[7.7, 5.5, 6.6]

        prices.remove(1); //5.5
        System.out.println("prices = " + prices); //[7.7, 6.6]

        prices.add(7.7);
        System.out.println("prices = " + prices); //[7.7, 6.6, 7.7]

        prices.add(0, 8.8);
        System.out.println("prices = " + prices); //[8.8, 7.7, 6.6, 7.7]

        prices.remove(7.7);
        System.out.println("prices = " + prices); //[8.8, 6.6, 7.7]

        prices.add(9.9);
        System.out.println("prices = " + prices); //[8.8, 6.6, 7.7, 9.9]


        prices.add(4, 9.8);
        System.out.println("prices = " + prices);

       /* prices.add(40.0);
        prices.remove(40.0);*/

        //**********************************************************

/*
        System.out.println("*******************************************************");
        ArrayList<Integer> list22 = new ArrayList<>();
        list22.add(44);
        list22.add(55);
        list22.add(66); //
        System.out.println("list22 = " + list22); //[44, 55, 66]

        //list22.remove(44);
        list22.remove( (Integer) 44); // Casting
        System.out.println("list22 = " + list22);

        System.out.println("list22.remove(Integer.valueOf(66)) = " + list22.remove(Integer.valueOf(66)));
        System.out.println("list22 = " + list22); //[55]


        System.out.println();
        System.out.println("------------------ Arrays.asList(), addAll(), get() and set() ------------------");
        System.out.println();


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("nums = " + nums);

        nums.addAll(Arrays.asList(6, 7, 8, 9));
        System.out.println("nums = " + nums);

        nums.set(0, 10); //
        System.out.println("nums = " + nums);

        nums.set(4, nums.get(0));
        System.out.println("nums = " + nums);

        nums.add(1, 100);
        System.out.println("nums = " + nums);
*/


        System.out.println();
        System.out.println("------------------ contains(), containsAll(), equals() ------------------");
        System.out.println();

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        boolean contains5 = list3.contains(5);//true
        System.out.println("contains5 = " + contains5);

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        boolean list3Containslist4 = list3.contains(list4);// false

        System.out.println("list3 contains list4 = " + list3Containslist4);
        System.out.println("(list3 contains All(list4)) = " + (list3.containsAll(list4))); // true


        boolean list3EqualsList4 = list3.equals(list4); //true
        System.out.println("list3 equals list4 = " + list3EqualsList4);

        list4.add(0, list4.get(1));
        System.out.println("list4 = " + list4);

        boolean list3EqualsList4_2 = list3.equals(list4);
        System.out.println("list3 equals list4_2 = " + list3EqualsList4_2); //false

        list4.remove(2);
        System.out.println("list4 = " + list4);
        System.out.println("list3 = " + list3);

        boolean list3EqualsList4_3 = list3.equals(list4);
        System.out.println("list3 equals list4_3 = " + list3EqualsList4_3);


        System.out.println();
        System.out.println("------------------ sort(), clear() ------------------");
        System.out.println();


        //list4.sort(null);
        Collections.sort(list4);
        System.out.println("list4 before clear method= " + list4); //[1, 2, 3, 4, 5]

        list4.addAll(Arrays.asList(1, 1, 1, 1));
        System.out.println("list4 = " + list4); //[1, 2, 3, 4, 5, 1, 1, 1, 1]

        /*Collections.sort(list4);
        System.out.println("list4 after sort= " + list4);*/

        list4.remove((Integer) 1);
        System.out.println("list4 after remove()= " + list4);

        list4.removeAll(Arrays.asList(1));
        System.out.println("list4 after removeAll()= " + list4);

        System.out.println("list4.get(2) = " + list4.get(2));

        list4.clear();
        System.out.println("list4 after clear method= " + list4);


        System.out.println();
        System.out.println("------------------------- Loops ----------------------------");
        System.out.println();

        System.out.println("------------------ for loop ------------------");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));

        }

        System.out.println("------------------ forEach loop ------------------");

        ArrayList<Integer> list33 = new ArrayList<>();
        list33.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for (int each : list33) {
            if (each % 2 != 0) {
                continue;

            }
            System.out.println(each + " ");
        }


    }
}
