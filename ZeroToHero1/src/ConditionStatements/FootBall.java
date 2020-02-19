package ConditionStatements;

import java.util.Scanner;

public class FootBall {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter your jersey number?");
        int jerseynumber = input.nextInt();
        if(jerseynumber<=0){
            System.out.println("your jersey number is invalid");

    }else if(jerseynumber%2==0){
            System.out.println("your jersey is number is even");
        }else if(jerseynumber%2==1){
            System.out.println("your jersey number is odd");
        }
}
}