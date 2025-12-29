package week_07_Class_And_Object;

import java.util.Random;

public class All_Employees {
    public static void main(String[] args) {

        
        // ************************* Objects ************************

        System.out.println("----------------------------------------------------------");
        System.out.println();

        EmployeeClass employee_1 = new EmployeeClass();

        employee_1.firstName = "John";
        employee_1.lastName = "Doe";
        employee_1.age = 25;
        employee_1.registrationNumber = 1;
        employee_1.jobTitle = "Manager";
        employee_1.yearsOfExperience = 1;
        employee_1.salary = 150000;


        System.out.println("employee_1 = " + employee_1);

        employee_1.working();

        System.out.println("----------------------------------------------------------");
        System.out.println();

        EmployeeClass employee_2 = new EmployeeClass();
        employee_2.firstName = "Maya";
        employee_2.lastName = "Kurban";
        employee_2.age = 18;
        employee_2.registrationNumber = 2;
        employee_2.jobTitle = "Manager";
        employee_2.yearsOfExperience = 2;
        employee_2.salary = 250000;

        System.out.println("employee_2 = " + employee_2);

        employee_2.atTheBreak();

        System.out.println("----------------------------------------------------------");
        System.out.println();

        EmployeeClass employee_3 = new EmployeeClass();
        employee_3.firstName = "Nursemin";
        employee_3.lastName = "Metin";
        employee_3.age = 19;
        employee_3.registrationNumber = 3;
        employee_3.jobTitle = "Manager";
        employee_3.yearsOfExperience = 3;
        employee_3.salary = 250000;
        //  employee_3.companyName="Cybertrek";


        System.out.println("Registration Number" + employee_3.registrationNumber + ": " + employee_3);

        employee_3.working();
        EmployeeClass.staticMethod();


    }
}
