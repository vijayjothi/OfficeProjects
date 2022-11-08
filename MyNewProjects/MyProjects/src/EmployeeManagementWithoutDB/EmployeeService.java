package EmployeeManagementWithoutDB;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Vijay", 24, "Developer", "IT", 25000);
    Employee emp2 = new Employee(102, "Ajith", 26, "Tester", "CS", 57000);
    Employee emp3 = new Employee(103, "Rajini", 20, "Devop_Eng", "ADMIN", 5000);
    Employee emp4 = new Employee(104, "Kamal", 27, "System_eng", "CS", 70000);

    Scanner scan = new Scanner(System.in);

    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;

    EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    public void viewAllEmps() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    //view employee based on their id
    public void viewEmp() {
        boolean found = false;
        System.out.println("Enter the id:");
        id = scan.nextInt();

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }


    public void updateEmp() {
        System.out.println("Enter the id:");
        id = scan.nextInt();

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter the name:");
                name = scan.next();
                System.out.println("Enter the age:");
                age = scan.nextInt();
                System.out.println("Enter the designation:");
                designation = scan.next();
                System.out.println("Enter the department:");
                department = scan.next();
                System.out.println("Enter the Salary:");
                salary = scan.nextDouble();

                emp.setName(name);
                emp.setAge(age);
                emp.setDesignation(designation);
                emp.setDepartment(department);
                emp.setSalary(salary);

                System.out.println("Updated details of employee are :");
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details updated successfully !!");
        }
    }


    public void deleteEmp() {
        System.out.println("Enter the id:");
        id = scan.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully");
        }
    }

    public void addemp() {
        System.out.println("Enter the id:");
        id = scan.nextInt();
        System.out.println("Enter the name:");
        name = scan.next();
        System.out.println("Enter the age:");
        age = scan.nextInt();
        System.out.println("Enter the designation:");
        designation = scan.next();
        System.out.println("Enter the department:");
        department = scan.next();
        System.out.println("Enter the Salary:");
        salary = scan.nextDouble();

        Employee emp = new Employee(id, name, age, designation, department, salary);
        empset.add(emp);

        System.out.println(emp);
        System.out.println("Employee added successfully");
    }

}

