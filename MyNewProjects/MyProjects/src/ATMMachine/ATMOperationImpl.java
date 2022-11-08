package ATMMachine;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperation{
    ATM atm=new ATM();
    Map<Double,String> miniStatement=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is "+atm.getBalance());
    }

    @Override
    public void withDrawAmount(double withDrawAmount) {
        if (withDrawAmount%500==0||withDrawAmount%200==0||withDrawAmount%100==0) {
            if (withDrawAmount <= atm.getBalance()) {
                miniStatement.put(withDrawAmount, " Amount WithDrawn");
                System.out.println(withDrawAmount + " Withdrawn successfully");
                atm.setBalance(atm.getBalance() - withDrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance !!!");
            }
        }else {
            System.out.println("Please enter the valid amount");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:miniStatement.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
