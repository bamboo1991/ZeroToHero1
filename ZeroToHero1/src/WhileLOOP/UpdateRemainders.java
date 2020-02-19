package WhileLOOP;

import java.util.Scanner;

public class UpdateRemainders {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter day number");
        int remainder = input.nextInt();
        int update =0;
        while (remainder>=15){
            remainder-=15;
            update++;
            System.out.println(update+ " updates are available");

        }


        }

    }