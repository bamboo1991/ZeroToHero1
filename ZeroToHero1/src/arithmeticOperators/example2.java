package arithmeticOperators;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        // enter a number that is even and less than 100.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number which is even and less thant 100: ");
        // int number = 25;
        int number = input.nextInt();
        boolean result = number % 2 ==1;
        boolean result2 = number <100;
        System.out.println("entered number is "+(result || result2));
        //System.out.println("number is even: "+ result);


    }
}
