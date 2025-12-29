package week_09_Arrays;


import java.util.Arrays;

public class Arrays_Study {
    public static void main(String[] args) {


        // Storing multiple data
        int num_1 = 5;
        int num_2 = 10;
        int num_3 = 51;
        int num_4 = 55;
        int num_5 = 78;
        int num_6 = 98;


        // ******************** Array Decleration *******************


        System.out.println();
        System.out.println("******************** Array Decleration *******************");
        System.out.println();

/*

        String[] strArr1 = new String[3]; // size is 3
        String strArr22[] = new String[3]; // size is 3


        System.out.println("strArr1 = " + strArr1); //
        System.out.println("strArr1 = " + Arrays.toString(strArr1));

        String str1, str2, str3 = "Cydeo";

        String[] strArr2, strArr3, strArr4;


        // System.out.println("strArr2 = " + strArr2);
        strArr2 = new String[5];
        System.out.println("str2 = " + strArr2);
        System.out.println("strArr2 = " + Arrays.toString(strArr2));
*/
/*        String strArr5[], str6, strArr7[], str8;


        //String strArr7;
       // strArr7 = "Group_04 is great.";

        int[] num = {1, 2, 3, 4, 5};
        //num = {1, 2, 3, 4, 5};


        strArr5 = new String[3];
        str6 = "Group_04 is great.";

        System.out.println("strArr5 = " + Arrays.toString(strArr5));
        System.out.println("str6 = " + str6);


        int[] intArr1 = new int[3];
        int[] intArr2 = {1, 2, 3};
        int[] intArr3 = new int[]{1, 2, 3};

        char[] charArr1 = new char[3];
        boolean[] boolArr1 = new boolean[910];
        long[] longArr1 = new long[3];
        short[] shortArr1 = new short[3];

*/


/*



        // ******************** Instantiation of an Array *******************
        System.out.println();
        System.out.println("******************** Instantiation of an Array *******************");


        //---------------- Creating an array object by using new keyword ----------------

        System.out.println("---------------- Creating an array object by using new keyword ----------------");
        System.out.println();

        String[] guestsOfHotelCalifornia = new String[115]; // size of the array
        guestsOfHotelCalifornia[0] = "Ahmet";
        guestsOfHotelCalifornia[10] = "Adam";
        guestsOfHotelCalifornia[21] = "Bryan";
        guestsOfHotelCalifornia[55] = "Alice";//

        // guestsOfHotelCalifornia[115] = "Jane";//ArraysIndexOutOfBound//
         guestsOfHotelCalifornia[114] = "Jane";//


        System.out.println("Guests Of Hotel California = " + Arrays.toString(guestsOfHotelCalifornia));



        // ------------- Declaration, Instantiation and Initialization_Array Literal -----------------
        System.out.println();
        System.out.println("---------------- Creating an array object by using new keyword ----------------");
        System.out.println();

        String[] animals = {"Dog", "Cat", "Tiger", "Chicken", "Fox"};

            
        //  OR;

        String[] animals_1 = new String[]{"Dog", "Cat", "Tiger", "Chicken", "Fox"};


        System.out.println("animals = " + Arrays.toString(animals));
        System.out.println("animals_1 = " + Arrays.toString(animals_1));


*/



/*

        // ******************** Accessing the Elements of an Array *******************
        System.out.println();
        System.out.println("******************** Accessing the Elements of an Array *******************");

        String[] animals = {"Dog", "Cat", "Tiger", "Chicken", "Fox"};
                         //   0      1       2         3        4

        System.out.println("animals = " + Arrays.toString(animals));

        animals[3] = "Lion";
        System.out.println("animals = " + Arrays.toString(animals));

        System.out.println("animals [3] = " + animals[3]);
      //  System.out.println("animals [5] = " + animals[5]);

        System.out.println("animals[2] = " + animals[2]);

*/






/*

       // ******************** Multidimensional Array *******************
        System.out.println();
        System.out.println("******************** Declaring a Multidimensional Array *******************");

        int[][][][] multidimentionalArr1;
        int[] multidimentionalArr2[];
        int multidimentionalArr3[][];

        int[][] arr1, arr2;
        int[] arr3[], arr4; // int [][]arr3 and int [] arr4
        int arr5[][], int_6;

        arr1 = new int[3][3];
        int[][] nums = {{10, 20, 30}, {15, 150, 350, 50}, {30, 40, 50, 100, 200}};

        int[][] numsInArr = new int[3][4];
        System.out.println("numsInArr = " + numsInArr);
        System.out.println("numsInArr = " + Arrays.toString(numsInArr));
        System.out.println("numsInArr = " + Arrays.deepToString(numsInArr));

        numsInArr[0][0] = 1;


        System.out.println("numsInArr = " + Arrays.deepToString(numsInArr));

*/


/*

        System.out.println("---------------- Creating a multidimensional array object by using new keyword ----------------");
        System.out.println();

        int[][] arr1 = new int[2][3];
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr1 = " + Arrays.deepToString((arr1)));

        int[][] nums = {{10, 20, 30}, {15, 150, 350, 50}, {30, 40, 50, 100, 200}};

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
*/

/* arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;


        System.out.println("arr1[1][0] = " + arr1[1][0]);
        System.out.println("arr1[1][1] = " + arr1[1][1]);

        System.out.println("arr1[1] = " + arr1[1]);
        System.out.println("arr1[1] = " + Arrays.toString(arr1[1]));

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr1 = " + Arrays.deepToString(arr1));
*/
      /*  System.out.println();
        System.out.println("---------------- Creating a multidimensional array object by using Array Literal ----------------");
        System.out.println();

        int[][] nums = {{10, 20, 30}, {15, 150, 350, 50}, {30, 40, 50, 100, 200}};
                       // 0,  1,  2    0,   1,   2,   3    0,  1,  2,  3,   4
                      //    0                   1                   2


        System.out.println("nums = " + Arrays.deepToString((nums)));


        System.out.println();
        System.out.println("---------------- Accessing the Elements of a Multi Dimensional Array----------------");
        System.out.println();

        System.out.println("nums[0][0] = " + nums[0][0]);

        nums[0][0] = 1000;

        System.out.println("nums[0][0] = " + nums[0][0]);
        System.out.println("nums[0] = " + Arrays.toString(nums[0]));
        System.out.println("nums = " + Arrays.deepToString((nums)));


*/


        //  ********************* Commonly Used Array Methods *********************************


        System.out.println();
        System.out.println("********************* Commonly Used Array Methods *********************************");
        System.out.println();

//        System.out.println("********************* copyOf() / copyOfRange()  *********************************");
        System.out.println();

        int[] numbers = {1, 2, 3, 10, 25, 55, 68}; //7

        int[] copyOfNumbers = Arrays.copyOf(numbers,6); //[1, 2, 3, 10, 25, 55]
        int[] copyOfNumbers_1 = Arrays.copyOf(numbers, numbers.length); //[1, 2, 3, 10, 25, 55, 68]
        int[] copyOfNumbers_4 = Arrays.copyOf(numbers, 7); // [1, 2, 3, 10, 25, 55, 68]
        int[] copyOfNumbers_2 = Arrays.copyOf(numbers, 3); //[1, 2, 3]
        int[] copyOfNumbers_3 = Arrays.copyOf(numbers, 10); //[1, 2, 3, 10, 25, 55, 68, 0, 0, 0]

        System.out.println("copyOfNumbers = " + Arrays.toString(copyOfNumbers));
        System.out.println("copyOfNumbers_4 = " + Arrays.toString(copyOfNumbers_4));
        System.out.println("copyOfNumbers_2 = " + Arrays.toString(copyOfNumbers_2));
        System.out.println("copyOfNumbers_3 = " + Arrays.toString(copyOfNumbers_3));


        int[] arr1 = {1, 2, 3, 4, 5};
        // 0,1,2,3,4
        System.out.println("arr1 = " + Arrays.toString(arr1));

        int[] arr9 = Arrays.copyOfRange(arr1, 0, 5);
        System.out.println("arr9 = " + Arrays.toString(arr9));

        int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("(Arrays.equals(arr1,arr2)) = " + (Arrays.equals(arr1, arr2))); // False
        System.out.println("(Arrays.equals(arr1,arr9)) = " + (Arrays.equals(arr1, arr9))); // True

        arr9[0] = arr9[1];
        arr9[1] = 1;

        System.out.println("arr9 = " + Arrays.toString(arr9));
        System.out.println("(Arrays.equals(arr1,arr9)) = " + (Arrays.equals(arr1, arr9)));//False

        Arrays.sort(arr9);
        System.out.println("arr9 = " + Arrays.toString(arr9));


        for (int i = 0; i < arr1.length; i++) {

            System.out.println("arr1[i] = " + arr1[i]);

        }


        String[] animals = {"Dog", "Cat", "Tiger", "Chicken", "Fox"};

        for (var eachAnimal : animals) {
            System.out.println("eachAnimal = " + eachAnimal);

        }


        int[][] nums = {{10, 20, 30}, {15, 150, 350, 50}, {30, 40, 50, 100, 200}};

        for (int[] eachNumArr : nums) {
            System.out.println("eachNumArr = " + Arrays.toString(eachNumArr));

        }


        String str = "I like my group members...";
        System.out.println(str);

        String[] arrSplit = str.split("");
        System.out.println("arrSplit = " + Arrays.toString(arrSplit));


        System.out.println("====================================================================");
        int[] nums_5 = {1, 3, 6, 9, 2, 5, 7};
        // 0,1,2,3,4,5,6

        int x = nums_5[3]; // x=9

        for (int k = 0; k < nums_5.length; k++) {

            if (nums_5[k] < x) { // 1<9, 3<1
                x = nums_5[k];
            }

        }

        System.out.println("x = " + x); // x=1

        char[] chArr = {'D', 'C', 'B', 'A'};
        Arrays.sort(chArr);

        for (int i = 0; i < chArr.length; i++) {

            // System.out.print(" " + chArr[i]);

            if (chArr[i] == 'D') {
                continue;
            }

            System.out.print(" " + chArr[i]);
        }
    }
}
