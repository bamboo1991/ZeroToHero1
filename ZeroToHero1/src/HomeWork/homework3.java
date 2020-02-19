package HomeWork;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter three number ");
        int output1 = input.nextInt();
        int output2 = input.nextInt();
        int output3 = input.nextInt();
        boolean num1 = output1>= output2 && output1>=output3;
        boolean num2 = output2>=output1 && output2>=output3;
        boolean num3 = output3>=output1 && output3>=output2;
        System.out.println(output1+ " is largest number: " + num1);
        System.out.println(output2+ " is largest number: " + num2);
        System.out.println(output3+ " is largest number: " + num3);
    }
}
