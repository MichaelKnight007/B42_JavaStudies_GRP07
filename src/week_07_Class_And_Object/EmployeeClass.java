package week_07_Class_And_Object;

public class EmployeeClass {

    // ******************** Variables / Fields ****************************************
    public String firstName;
    public String lastName;
    public int age;
    public String jobTitle;
    public String address;
    public int yearsOfExperience;
    public double salary;
    public int registrationNumber;
    public static final String companyName="Cydeo";

    // ******************* Methods **************************************************

    public void working() {
        System.out.println(firstName + " " + lastName + " is working.");
    }

    public void atTheBreak() {
        System.out.println(firstName + " " + lastName + " is at the break.");
    }

    public void sleeping() {
        System.out.println(firstName + " " + lastName + " is sleeping");
    }

    public static void staticMethod() {
        System.out.println("I am static");

    }


    // ******************* toString() Method **************************************************
    @Override
    public String toString() {
        return "EmployeeClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", address='" + address + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary= $" + salary +
                ", registration Number=" + registrationNumber +
                ", Company Name=" + companyName +
                '}';
    }
}
