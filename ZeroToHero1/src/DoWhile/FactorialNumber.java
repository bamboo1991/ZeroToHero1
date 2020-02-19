package DoWhile;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your factorial number");
        int number = input.nextInt();
        int multiple = 1;
        int one = 1;
        while (multiple < number) {
            one *= multiple * number;
            number--;
        }
        System.out.println(one);
        System.out.println("please enter another number");
        int number2 = input.nextInt();
        int factorial1 = 1;
        do {
            factorial1 *= number2;
            number2--;
        } while (1 < number2);
        System.out.println(factorial1);
////////// reversed String for interview question///////



    }}