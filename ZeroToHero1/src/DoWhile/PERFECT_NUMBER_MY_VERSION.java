package DoWhile;

import java.util.Scanner;

public class PERFECT_NUMBER_MY_VERSION {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("number");
        int number = input.nextInt();
        int divide = 3;
        int sum = 0;
        do {
            if (number%divide==0){
                sum+=divide;
            }

            divide++;
        }while (divide<number);
        if (sum==number){
            System.out.println("this is perfect number");

        }else{
            System.out.println("not a perfect");
        }




    }
}
