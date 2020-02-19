package HomeWork;

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter three number: ");
        int print = input.nextInt();
        int print2 = input.nextInt();
        int print3 = input.nextInt();
        int number1 = 1;
        int number2 = 5;
        int number3 =10;
        boolean message = number1 > number2;
        boolean message2 = number2 > number3;
        boolean message3 = number2 < number3;
        System.out.println( + number1+ " : is the largest number: " + message);
        System.out.println(+number2+ " : is the largest number: "+ message2);
        System.out.println(+number3+ ": is the largest number: "+message3);

    }
}
