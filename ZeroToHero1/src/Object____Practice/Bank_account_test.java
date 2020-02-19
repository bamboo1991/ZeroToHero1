package Object____Practice;

import java.util.Scanner;

public class Bank_account_test {

    public static void main(String[] args) {
        System.out.println("This is Chase Bank Application");
        System.out.println("What is your name");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Chase Bank " +input.next()+"!");

        int exit=0;
Bank_account chase = new Bank_account();
do{
    chase.displayTheFunctionality();
    System.out.println("Please enter your choose");
    int myOption =input.nextInt();
    switch (myOption){
        case 0:
            chase.bankInfo();
            break;
        case 1:
            System.out.println("Please enter your deposit amount");
            int depositAmount =input.nextInt();
            chase.deposit(depositAmount);
            break;
        case 2:
            System.out.println("Please enter withdraw amount");
            int withDrawAmount = input.nextInt();
            chase.withDraw(withDrawAmount);
            break;
        case 3:
            System.out.println("Please enter your singUp info");
            String personName = input.next();
            System.out.println("Please enter your account Number");
            double accountNumber = input.nextInt();
            System.out.println("Please enter your balance");
            double balance = input.nextDouble();
            System.out.println("Please enter username ");
            String username =input.next();
            System.out.println("Please enter your password");
            String password = input.next();
            System.out.println("Please enter your account open date");
            String acoountOpenDate = input.nextLine();
            chase.signUp(personName,accountNumber,balance,username,password,acoountOpenDate);
            break;
        case 4:
            System.out.println("please enter your password");
            String loginPassword = input.next();
            System.out.println();
            String loginUserName = input.next();
            chase.login(loginPassword,loginUserName);
            break;
        case 5:
            exit=5;
            System.out.println("have a nice day!");
            break;
    }
}while (exit!=5);





    }
}