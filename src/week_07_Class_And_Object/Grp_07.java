package week_07_Class_And_Object;

public class Grp_07 {
    public static void main(String[] args) {

        Class_And_Object developer_2= new Class_And_Object();
        developer_2.name="Mike";


        // --------------------------------------------------------------------------
        Aliya aliya_1 = new Aliya();
        aliya_1.name="Mike";
        aliya_1.surname="Mike";
        aliya_1.num=10;

        aliya_1.aliyaTest("Mehmet", "Demir", 35 );

       Aliya.aliyaTest_2("Ahmet", "Çelik", 25 );
       Aliya.schoolName="Cydeo";

        // --------------------------------------------------------------------------
       Aliya aliya_2 = new Aliya();
       aliya_2.name="Aliya";
       aliya_2.surname="Garibli";
       aliya_2.num=11;
       aliya_2.aliyaTest("Ahmet", "Yılmaz", 22);

       Aliya.schoolName="Cybertek";
       Aliya.aliyaTest_2("Cevdet", "Korkmaz", 29);




Student student_1=new Student();
student_1.firstName="Ali";
student_1.lastName="Korkmaz";
student_1.schoolName="Cybertek";
student_1.age=30;
student_1.phone=12167416;
student_1.gender="Male";
student_1.address="New York";

        System.out.println(student_1);


    }
}
