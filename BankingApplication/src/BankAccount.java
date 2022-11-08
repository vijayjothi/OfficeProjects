import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String cusName;
    String cusId;
    BankAccount(String cusName,String cusId){
        cusName=this.cusName;
        cusId=this.cusId;
    }

    void deposit(int amount){
        if(amount>0)
        {
            balance=balance+amount;
            previousTransaction=amount;
        }
    }

    void withdraw(int amount){
        if(amount>0){
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }

    void getPreviousTransaction()
    {
        if(previousTransaction>0){
            System.out.println("Deposited"+previousTransaction);
        }
        else if(previousTransaction<0)
        {
            System.out.println("withdraw"+previousTransaction);
        }
        else {
            System.out.println("No Transaction Occurred");
        }
    }

    void showMenu()
    {
        char option='\0';
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome"+cusName);
        System.out.println("your id is"+cusId);
        System.out.println("\n");

        System.out.println("A: Check your balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit the System");

        do {
            System.out.println("****************************");
            System.out.println("Enter your option");
            option=scan.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("---------------------");
                    System.out.println("balance"+balance);
                    System.out.println("----------------------\n");
                    break;
                case 'B':
                    System.out.println("Enter the amount to deposit");
                    int amount=scan.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("Enter the amount to withdraw");
                    int amt=scan.nextInt();
                    withdraw(amt);
                    System.out.println("\n");
                    break;
                case 'D':
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("**********************");
                    break;
                default:
                    System.out.println("invalid option! please enter the right option...");
                    break;
            }
        }while (option!='E');
        System.out.println("Thanks for using our services...!!!");
    }
}
