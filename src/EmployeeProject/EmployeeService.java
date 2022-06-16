package EmployeeProject;

import java.util.Scanner;

public interface EmployeeService {

    Employee add(Employee employee);
    void update(Integer id, Scanner input);
    Employee delete(Integer id);
    Employee findAll();
    Employee findById(Integer id);
    boolean findByName(String name);


    Boolean find(Integer id);


}
