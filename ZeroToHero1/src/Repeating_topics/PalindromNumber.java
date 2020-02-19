package Repeating_topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
        int number = input.nextInt();
        int reversed=0, original=number;
while (number>0) {
    int digit = number % 10;
    number = number / 10;
    reversed = reversed * 10 + digit;
}
if (original==reversed){
    System.out.println("palindrom");
}else{
    System.out.println("not a palindrom");
}
    }
}
