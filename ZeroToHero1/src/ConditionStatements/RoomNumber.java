package ConditionStatements;

import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your room number?");
        int roomNumber = input.nextInt();
        if (roomNumber <= 100) {
            System.out.println("Your room is located in the first floor");
        } else if (roomNumber > 100 && roomNumber <= 199) {

            System.out.println("Your room is on second floor");
        } else if (roomNumber >= 200 && roomNumber <= 299) {
            System.out.println("Your room is on third floor");

        } else
            System.out.println("room number is invalid");
        }
    }

