package week_07_Class_And_Object;

public class Student {

    String firstName;
    String lastName;
    int age;
    static String schoolName;
    String address;
    String email;
    String gender;
    long phone;

    public void study() {
        System.out.println(firstName + " is studying");
    }

    public void eat() {
        System.out.println(firstName + " is eating");

    }

    public void sleep() {
        System.out.println(firstName + " is sleeping");
    }

    public static void schoolName() {
        System.out.println("School Name is " + schoolName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                '}';
    }
}
