package HomeWork;

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {
       Scanner input1 = new Scanner(System.in);
       Scanner input2 = new Scanner(System.in);
       Scanner input3 = new Scanner(System.in);
        System.out.println(" Please Enter three numbers: ");
       int number1 = input1.nextInt();
       int number = input2.nextInt();
       int number5 = input3.nextInt();
            //int number1 = 1;
           ///int number5 = 5;
            //int number = 10;

         boolean smaller = number1 > number5&&number>number5;
         boolean secondSmaller = number1 > number5&&number>number1;
         boolean third = number5 < number&&number1>number1;
        System.out.println(+number1+ " is larger number? " +smaller);
        System.out.println(+number5+ " is larger number? " +secondSmaller);
        System.out.println(+number+ " is larger number? " + third);


    }
}
