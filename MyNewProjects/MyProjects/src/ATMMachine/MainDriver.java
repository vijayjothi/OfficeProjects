package ATMMachine;

import java.util.Scanner;

/*
1.Validate the user through ATM Number and pin.
2.User able to perform below Operations
     1.Check available balance
     2.Withdraw amount
     3.deposit amount
     4.view mini statements
     5.exit
 */
public class MainDriver {
    public static void main(String[] args) {
        ATMOperation operation=new ATMOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter the Atm Number:");
        int atmNumber=scan.nextInt();
        System.out.println("Enter the pin:");
        int atmPin=scan.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==atmPin)){
            while (true) {
                System.out.println("\n"
                        +"1.view available balance\n" +
                        "2.withdraw amount\n" +
                        "3.deposit amount\n" +
                        "4.View mini statement\n" +
                        "5.Exit\n");
                System.out.println("Enter the choice:");
                int choice=scan.nextInt();
                if (choice==1){
                    operation.viewBalance();
                } else if (choice==2) {
                    System.out.println("Enter the amount to withdraw:");
                    double withdraw=scan.nextDouble();
                    operation.withDrawAmount(withdraw);
                } else if (choice==3) {
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount=scan.nextDouble();
                    operation.depositAmount(depositAmount);
                } else if (choice==4) {
                    operation.viewMiniStatement();
                } else if (choice==5) {
                    System.out.println("Collect your ATM card\n");
                    System.out.println("Thank you for using ATM machine");
                    System.exit(0);
                }else {
                    System.out.println("Please enter correct choice..!!!");
                }
            }
        }else {
            System.out.println("Invalid ATM Number or ATM Pin");
            System.exit(0);
        }
    }
}
