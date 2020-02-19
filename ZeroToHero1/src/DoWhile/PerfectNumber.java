package DoWhile;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        int divident = 1;
        int sum = 0;
        do {
            if (number % divident == 0) {
                sum += divident;
            }
            divident++;
        } while (divident < number);
        if(sum==number){
            System.out.println("this is perfect number");
        }else{
            System.out.println("this is not perfetc number");
        }
    }

}
