import java.util.Scanner;

public class PrimeNumber1toN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int count,cn;  //current number
        System.out.println("List of prime numbers from 1 to "+num+ " is :");

        for (int i=1;i<=num;i++){
            cn=i;
            count=0;
             for (int j=1;j<=cn;j++) {
                 if (cn%j==0){
                     count++;
                 }
             }
            if (count==2){
                System.out.println(""+cn);
            }
        }
    }
}
