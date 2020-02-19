package ScannerPractice;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your  first number");
        int value = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("please enter your second number");
        int value2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter your third number ");
        int value3 = input3.nextInt();
        boolean firstNumber = value==value2&&value2==value3;
        System.out.println("all numbers are equal " + firstNumber);
        boolean second = value!=value2&&value2!=value3;
        System.out.println("your numbers are not equal "+second);
    }
}
