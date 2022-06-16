package EmployeeProject;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeServiceImple implements EmployeeService{

    Scanner obj=new Scanner(System.in);

    LinkedList<Employee> list;

    public EmployeeServiceImple() {
        list =new LinkedList<>();
    }

    @Override
    public Employee add(Employee employee) {
        if(!find(employee.getId())) {
            list.add(employee);
        }
        else {

            System.out.println("employee already exists in the Record list");
        }
        return employee;
    }

    @Override
    public void update(Integer id,Scanner input) {
        if (find(id)) {
            Employee emp = findById(id);

            System.out.print("What is the new employee id  ? ");
            int ids = obj.nextInt();


            System.out.print("What is the new employee name  ? ");
            String name = obj.next();

            System.out.print("What is the new employee password ");
            String pass = obj.next();
            //            obj.nextLine();

            emp.setId(ids);
            emp.setName(name);
            emp.setPassword(pass);
            System.out.println("employee Updated Successfully");
        }
        else {

            System.out.println("Employee Not Found in the Student list");
        }

    }

    @Override
    public Employee delete(Integer id) {

        Employee employeedlt = null;

        for (Employee ll : list) {

            if (ll.getId() == id) {
                employeedlt = ll;
            }
        }

        if (employeedlt == null) {

            System.out.println("Invalid employee Id");
        }
        else {

            list.remove(employeedlt);

            System.out.println("Successfully removed employee from the list");
        }
        return null;
    }

    @Override
    public Employee findAll() {
        if (list.isEmpty()) {

            System.out.println("The list has no Employee\n");
        }
        for (Employee emp : list) {

            System.out.println(emp.toString());
        }
    return null;
    }

    @Override
    public Employee findById(Integer id) {
        for (Employee l : list) {

            if (l.getId() == id) {
                return l;
            }
        }

        return null;

    }

    @Override
    public boolean findByName(String name) {
        for (Employee l : list) {

            if (l.getName()==name) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean find(Integer id) {
        for (Employee l : list) {

            if (l.getId() == id) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }
}
