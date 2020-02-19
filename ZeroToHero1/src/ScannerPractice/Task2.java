package ScannerPractice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("deposits into your bank account");
        int deposit = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("deposits into your bank account");
        int deposit2 = input.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("deposits into your bank account");
        int deposit3 = input.nextInt();
        int result = deposit+deposit2+deposit3;
        System.out.println("your total deposits to your bank will be: " + result );
        Scanner input4 = new Scanner(System.in);
        System.out.println("tell us your expenses");
        double total1 = input4.nextDouble();
        double total2 = input4.nextDouble();
        double computerPrice = 350.99;
        double phonePrice = 250.50;
        double expeses = computerPrice+phonePrice;
        double yourBankBalanse = result-expeses;
        System.out.println("your balance " + yourBankBalanse);


}}

