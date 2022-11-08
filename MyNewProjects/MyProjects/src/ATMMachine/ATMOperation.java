package ATMMachine;

public interface ATMOperation {
    void viewBalance();
    void withDrawAmount(double withDrawAmount);
    void depositAmount(double depositAmount);
    void viewMiniStatement();
}
