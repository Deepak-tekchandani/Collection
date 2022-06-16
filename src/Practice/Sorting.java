package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch;
       // List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee("32", "Deepak"));
//        employeeList.add(new Employee("44", "Pawan"));
//        employeeList.add(new Employee("58", "Boby"));

        //System.out.println(employeeList);
        do{
            List<Employee> employeeList = new ArrayList<>();
            System.out.println("Enter Employee Id :");
            String id = obj.nextLine();
            System.out.println("Enter Employee Name :");
            String name = obj.nextLine();

            employeeList.add(new Employee(id, name));
        System.out.println("if you want to give Employee Details again /nl press y otherwise press n");
        ch = obj.next().charAt(0);
        if(ch=='n' || ch=='N') {
            System.out.println("employeeTest done ");
            System.out.println(employeeList);
            break;
        }

    }while(ch=='y' || ch=='Y');


    }

}

class Employee {

    private String employeeId;
    private String employeeName;
   // private Address address;


    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

class Address{
    private String city;
    private String province;
    private String country;

    public Address(String city, String province, String country) {
        this.city = city;
        this.province = province;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}