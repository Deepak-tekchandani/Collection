package EmployeeProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeServiceImple hr = new EmployeeServiceImple();

        Employee employee = new Employee();
//        employee.setId(6862);
//        employee.setName("Deepak");
//        employee.setPassword("kumar");

        hr.add(employee);

        Scanner input = new Scanner(System.in);

        int option = 0;

        do {
            menu();
            option = input.nextInt();                                                                                                                                                                           switch (option) {

                // Case 1
                case 1:


                    System.out.print("What is the Employee id  ? ");
                    int id = input.nextInt();

                    System.out.print("What is the Employee Name ? ");
                    String name = input.next();
//                    input.nextLine();

                    System.out.print("What is the Employee password ? ");
                    String pass = input.next();
                    input.nextLine();

                    employee = new Employee(id , name , pass);
                    hr.add(employee);
                    System.out.println(employee.toString());

                    break;

                // Case 2
                case 2:

                    System.out.print("What is the Student id number ? ");
                    int rId = input.nextInt();

                    hr.delete(employee.getId());

                    break;

                // Case 3
                case 3:

                    System.out.print("What is the Student id number? ");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                // Case 4
                case 4:

                    System.out.print("What is the Employee id ? ");
                    int idd = input.nextInt();

                    if (!hr.find(idd)) {
                        System.out.println("Student id does not exist\n");
                    }

                    break;

                // Case 5
                case 5:
                    hr.findAll();
                    break;
                // Case 4
                case 6:

                    System.out.print("What is the Employee name ? ");
                    String names = input.next();

                    if (!hr.findByName(names)) {
                        System.out.println("Student id does not exist\n");
                    }

                    break;

                // Case 9
                case 9:

                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);

                    break;

                default:

                    System.out.println("\nInvalid input\n");
                    break;
            }
        }
        while (option != 9);
    }

    public static void menu()
    {

        System.out.println("---------------MENU------------");
        System.out.println("1: Add Employee");
        System.out.println("2: Delete Employee");
        System.out.println("3: Update Employee");
        System.out.println("4: findByid Employee");
        System.out.println("5: findAll Employees");
        System.out.println("6: findByName Employee");
        System.out.println("9: Exit program");
        System.out.print("------------Enter your selection : ---------------");
    }
}
