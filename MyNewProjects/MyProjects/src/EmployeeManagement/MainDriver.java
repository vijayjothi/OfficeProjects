package EmployeeManagement;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        int id;
        String name;
        EmployeeDaoInterface dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner scan = new Scanner(System.in);
        //CRUD operation
        do {
            System.out.println("\n1. Add employee" +
                    "\n2. Show all employee" +
                    "\n3. Show employee based on id" +
                    "\n4. Update employee" +
                    "\n5. Delete employee" +
                    "\n6. Exit\n");

            System.out.println("Enter a Choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter Id");
                    id = scan.nextInt();
                    System.out.println("Enter the name");
                    name = scan.next();
                    System.out.println("Enter the salary");
                    double salary = scan.nextDouble();
                    System.out.println("Enter the age");
                    int age = scan.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployees();
                    break;
                case 3:
                    System.out.println("Enter the employee id to show the details ");
                    id=scan.nextInt();
                    dao.showEmployeeBasedOnId(id);
                    break;
                case 4:
                    System.out.println("Enter the employee id to update the details");
                    id=scan.nextInt();
                    System.out.println("Enter the new name");
                    name=scan.next();
                    dao.updateEmployee(id,name);
                    break;
                case 5:
                    System.out.println("Enter the employee id to delete ");
                    id=scan.nextInt();
                    dao.deleteEmployee(id);
                    break;

                case 6:
                    System.out.println("Thanks for using our application");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;
            }
        } while (true);

    }
}
