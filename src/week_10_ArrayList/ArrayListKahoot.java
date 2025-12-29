package week_10_ArrayList;

import java.util.ArrayList;

public class ArrayListKahoot {
    public static void main(String[] args) {


        System.out.println("We study GIT");


        System.out.println("----------------------- Kahoot_4 ---------------------------------------");
        ArrayList<String> cars= new ArrayList<>();
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");


        System.out.println("(cars.remove(2)) = " + (cars.remove(2)));
        System.out.println("(cars.remove(\"Mazda\")) = " + (cars.remove("Mazda")));

        System.out.println();
        System.out.println("----------------------- Kahoot_5 ---------------------------------------");
        System.out.println("(cars.add(\"Ferrari\")) = " + (cars.add("Ferrari")));

        System.out.println();
        System.out.println("----------------------- Kahoot_8 ---------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("(numbers.size()+1) = " + (numbers.size() + 1));

        System.out.println();
        System.out.println("----------------------- Kahoot_12 ---------------------------------------");
        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");

        ArrayList<String> cars3 = new ArrayList<>();
        cars3.add("Volvo");
        cars3.add("Ford");

        System.out.println("(cars2.containsAll(cars3)) = " + (cars2.containsAll(cars3)));


        System.out.println();
        System.out.println("----------------------- Kahoot_13 ---------------------------------------");

        cars2.remove("Ford");
        System.out.println(cars2+ " "+ cars3);


        System.out.println();
        System.out.println("----------------------- Kahoot_15 ---------------------------------------");
        ArrayList<String> cars4 = new ArrayList<>();
        ArrayList<String> cars5 = new ArrayList<>();
        cars4.add("Volvo");
        cars4.add("BMW");
        cars4.add("Ford");
        cars5.add("Volvo");
        cars5.add("Ford");

        System.out.println("cars4 = " + cars4);
        System.out.println("cars5 = " + cars5);

        for (String str : cars5) {
            cars4.add(str);

        }

        System.out.println("cars4 after adding cars5 elements= " + cars4);

        cars4.remove("Volvo");
        System.out.println(cars4);



    }
}
