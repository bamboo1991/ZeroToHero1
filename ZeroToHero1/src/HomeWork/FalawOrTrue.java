package HomeWork;

import java.util.Scanner;

public class FalawOrTrue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String that you like");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
       // String str3 = input.nextLine();
        System.out.println("are they equal? "+ str1.equals(str2));
      //  System.out.println("are they equal? "+ str2.equals(str3));
        System.out.println("starting with first String’s last two character " + str1.endsWith(str2.substring(0,2)));
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your email");
        String value = input.nextLine();
        String email = "gmail.com";
        System.out.println("it has gmail.com or not "+ value.endsWith("gmail.com"));
    }
}
/*
Using scanner enter two String input. Print true if second string is starting with first String’s last two character.
 */