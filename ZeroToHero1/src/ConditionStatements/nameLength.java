package ConditionStatements;

import java.util.Scanner;

public class nameLength {
    public static void main(String[] args) {
        /*
        create an application that will ask for the
        name and check the characters in name
        and if it less than 5 it will give
        message that your name characters
        are less than 5. else it will give message
        your name character more than 5.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please print your name");
        String name = input.next();
        System.out.println("you have " + name.length() + " characters in your name");
        if(name.length() <=5){
            System.out.println("your name has less than 5 characters");

        }else if(name.length()>5){
            System.out.println("you have more than 5 characters in your name");
        }

        /*Scanner input = new Scanner(System.in);
        System.out.println("Write your name...... Please!");
        String name = input.next();
        System.out.println("your name is: "+name);
        System.out.println(name.length());
        if(name.length() <= 5) {
            System.out.println("your name has less that 5 characters.");
        }else if(name.length() > 5){
            System.out.println("your name has more than 5 characters.");


    }
}

         */
    }
}