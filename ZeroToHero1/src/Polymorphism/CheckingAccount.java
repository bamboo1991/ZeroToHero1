package Polymorphism;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name, int balance) {
        super(name, balance);
    }

    public static void printBankDetails(BankAccount bankAccount){
        bankAccount.printDetails();
    }


}
