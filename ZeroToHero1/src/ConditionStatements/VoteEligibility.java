package ConditionStatements;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? ");
        int personAge = input.nextInt();

        if(personAge >= 18){
            System.out.println("You are eligible to vote.");

        }else if(personAge<18){
            System.out.println("You are not eligible to vote.");
        }
    }
}
