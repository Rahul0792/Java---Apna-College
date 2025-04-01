package _6_oops.inheritance;

import javax.sound.midi.Soundbank;

public class demo1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.accountNumber = 113401000;
        bankAccount.balance= 5000;
        bankAccount.customerId=101;
        bankAccount.customerName="Rahul Khilari";

        System.out.println(bankAccount.diposit(500));
        System.out.println(bankAccount.withdraw(1000));
        System.out.println(bankAccount.checkbalance());


    }
}
