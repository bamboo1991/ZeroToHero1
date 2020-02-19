package Polymorphism;

public class BankAccount {
    String name;
    int balance;
    public BankAccount(String name, int balance){
        this.name=name;
        this.balance=balance;
    }
    public  void printDetails(){
        System.out.println("bank name :"+name+" and balance: "+balance);
    }
}
