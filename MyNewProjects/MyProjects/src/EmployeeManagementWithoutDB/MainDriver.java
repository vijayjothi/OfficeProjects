package EmployeeManagementWithoutDB;

import java.util.Scanner;

public class MainDriver {
    static boolean ordering =true;

    public static void menu() {
        System.out.println("********Welcome to Employee Management System"
                + "\n1. Add employee"
                + "\n2. view employee"
                + "\n3. update employee"
                + "\n4. delete employee"
                + "\n5. viewAll employee"
                + "\n6. exit \n");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        EmployeeService service=new EmployeeService();
        do {
            menu();
            System.out.println("Enter your choice:");
            int choice=scan.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addemp();
                    break;

                case 2:
                    System.out.println("view employee");
                    service.viewEmp();
                    break;

                case 3:
                    System.out.println("update Employee");
                    service.updateEmp();
                    break;

                case 4:
                    System.out.println("delete Employee");
                    service.deleteEmp();
                    break;

                case 5:
                    System.out.println("viewAll Employee");
                    service.viewAllEmps();
                    break;

                case 6:
                    System.out.println("Thank you for using application..!!!");
                    System.exit(0);

                default :
                    System.out.println("Please enter valid choice:");
                    break;
            }
        }while(ordering);

    }

}
