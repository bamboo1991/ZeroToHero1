package Polymorphism;

public class CreditAccount  extends BankAccount{
    public CreditAccount(String name, int balance) {
        super(name, balance);
    }
    public static void printBankDetails(BankAccount bankAccount){
        bankAccount.printDetails();
    }



    public static void main(String[] args) {
        BankAccount b1 = new CreditAccount("Visa", 15000);
        BankAccount b2 = new BankAccount("Master card", 2222);
        CreditAccount c1 = new CreditAccount("Visa", 800);
        CheckingAccount ca1 = new CheckingAccount("Discovery", 600);
        printBankDetails(b1);
        printBankDetails(b2);
        printBankDetails(c1);
        printBankDetails(ca1);
    }
}
