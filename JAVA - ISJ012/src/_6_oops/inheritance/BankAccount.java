package _6_oops.inheritance;

public class BankAccount {
    int customerId;
    int accountNumber;
    String customerName;
    double balance;

    public double diposit(int amount){
        return balance += amount;
    }
    public double withdraw(int amount){
        return balance -= amount;
    }
    public double checkbalance(){
        return balance;
    }
}
