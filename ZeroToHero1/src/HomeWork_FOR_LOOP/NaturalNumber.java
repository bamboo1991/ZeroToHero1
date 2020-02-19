package HomeWork_FOR_LOOP;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your natural number");
        int number = input.nextInt();
        int sum = 0;
        int naturalNumber =0;
        for (int i =1; i<=number; i++){
            naturalNumber+=2*i-1;
            sum+=naturalNumber;
            System.out.println("natural Numbers "+ naturalNumber);

        }
        System.out.println("sum of "+sum );
    }
}
