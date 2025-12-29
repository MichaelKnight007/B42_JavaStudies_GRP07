package week_07_Class_And_Object;

public class Aliya {

    int num;
    String name;
    String surname;

   static String schoolName;


    public void aliyaTest(String name, String surname, int age) {
        System.out.println();
        System.out.println("Method_1");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);

    }



    public static void aliyaTest_2(String name, String surname, int age) {
        System.out.println();
        System.out.println("Method_2");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);

    }


    public static void main(String[] args) {
        Class_And_Object obj_1=new Class_And_Object();
        obj_1.name="Sila";
        obj_1.age=10;
        obj_1.salary=100;
        obj_1.gender='F';

        System.out.println(obj_1);


        Class_And_Object obj_2=new Class_And_Object();
        obj_2.name="Ramazan";
        obj_2.age=20;
        obj_2.salary=100;
        obj_2.gender='M';
        System.out.println(obj_2);


        obj_1.breakTime();
        obj_2.work();
    }





}

