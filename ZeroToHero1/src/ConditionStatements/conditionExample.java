package ConditionStatements;

import java.util.Scanner;

public class conditionExample {
    public static void main(String[] args) {
        /*
        write a code that will accept month number
        and it will print a message with month name
        and number of days in of that month
         */
        Scanner example = new Scanner(System.in);
        System.out.println("Enter month number?");
        byte monthNumber = example.nextByte();
        if(monthNumber == 1){
            System.out.println("january has 31 days.");

        }else if(monthNumber ==2){
            System.out.println("february has 28 days.");
        }else if(monthNumber == 3){
            System.out.println("march has 31 dasy.");
        }else if(monthNumber == 4){
            System.out.println("april has 30 days");
        }else if(monthNumber == 5){
            System.out.println("may has 31 days. ");

        }else if(monthNumber == 6){
            System.out.println("june has 31 days");

        }else if(monthNumber==7){
            System.out.println("july has 31 days");

        }else if(monthNumber == 8){
            System.out.println("august has 31 days ");
        }else if(monthNumber ==9){
            System.out.println("september has 30 days" );

        }else if(monthNumber == 10){
            System.out.println("october has 31 days ");

        }else if(monthNumber==11){
            System.out.println("november has 30 days");

        }else if(monthNumber==12){
            System.out.println("december has 31 days ");

        }else {

            System.out.println("your month number is invalid");
        }
    }
}
