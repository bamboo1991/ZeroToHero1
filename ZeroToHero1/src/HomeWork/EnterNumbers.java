package HomeWork;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class EnterNumbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any numbers: ");
        int number1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter second any number: ");
        int number2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("what operations you want: \n1.plus, \n2.minus, \n3.multiply, \n4.division");
        int operations = input3.nextInt();
        int plus = 1, minus = 2, multiply = 3, division =4;

        if(operations==1) {
            System.out.println("your result " +(number1+number2));
        }else if(operations==2){
            System.out.println("your result will be " +(number1-number2)  );
        }else if(operations==3) {

            System.out.println("your result will be "+(number1*number2));
        }else if (operations==4){


        System.out.println("your result will be "+(number1/number2) );
        }


        }
}



