package ConditionStatements;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int apples = 15;
        int bananas = 21;
        if(bananas > apples) {
            System.out.println("we've more bananas than apples");
        }else {
            System.out.println("we've more apple than bananas");

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Please enter the capacity of class: ");
        int capacity = input.nextInt();
        if(numberOfStudents < capacity) {
            System.out.println("You are welcome to class! ");
        }  else if(numberOfStudents == capacity){

            System.out.println("clas is full,  try next year! ");
        }else {
            System.out.println("We cannot except " +numberOfStudents+ "as we have less capacity in class ");
        }
    }
}
