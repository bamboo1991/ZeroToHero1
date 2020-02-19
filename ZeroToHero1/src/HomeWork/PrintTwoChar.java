package HomeWork;

import java.util.Scanner;

public class PrintTwoChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any Value with more than 2 chars");
        String value1 = input.next();
        String value2 = input.next();
        System.out.println("printing without first char " + value1.substring(1));
    System.out.println("printing without first char " +value2.substring(1, value2.length()-1) ) ;


    }
}
