package ScannerPractice;

import java.util.Scanner;

public class MuammerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter your daily income");
        int amount=input.nextInt(); //500
        System.out.println("Please enter your daily income");
        amount+=input.nextInt(); //300
        System.out.println("Please enter your daily income");
        amount+=input.nextInt();//400 ----->1200
        System.out.println("total bank account balance " + amount);
        System.out.println("how much you spend for computer ");
        float spending=input.nextFloat();
        System.out.println("how much did you spend for phone?");
        spending-=input.nextFloat();
        amount-=spending;
        System.out.println("total amount in your bank account " + amount);

    }
}
