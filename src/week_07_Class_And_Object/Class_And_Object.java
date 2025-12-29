package week_07_Class_And_Object;

public class Class_And_Object {

    // --------------- Employee Class -----------------

    // ************** Instance Variables   *******************

    public String name; // defining a variable
    public int age;
    public double salary;
    public char gender;
    public int id;
    public String jobTitle;
    public boolean isFullTime;
    public final String schoolName = "Cydeo"; // Initializing a variable



    // -------------------------- Instance or Non-static methods ---------------
    public void work() {
        System.out.println(jobTitle + " " + name + " is working!");
    }

    public void breakTime() {
        System.out.println(jobTitle + " " + name + " " + " is at lanch and eating kebap.");
    }

    public static void salary() {
        System.out.println("I hope you will get really high salaries...");
    }


    @Override
    public String toString() {
        return "Class_And_Object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
