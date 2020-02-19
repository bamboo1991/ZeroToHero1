package HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your purchased amount? ");
        int tablePrice = 110;
        int numberOfTables = input.nextInt();
        //if (numberOfTables >=10&&numberOfTables<15){
        int priceAfterDiscount1 = numberOfTables * 10 / 100 * 110;
        int priceAfterDiscount2 = numberOfTables * 15 / 100 * 110;
        int priceAfterDiscount3 = numberOfTables * 20 / 100 * 110;
        if (numberOfTables >= 10 && numberOfTables < 15) {
            System.out.println("this is your price including 10 percent off " + priceAfterDiscount1);
        } else if (numberOfTables >= 15 && numberOfTables < 20) {
            System.out.println("this is your price including 15 percent off " + priceAfterDiscount2);
        } else if (numberOfTables >= 20) {
            System.out.println("your cost will include 20 percent off " + priceAfterDiscount3);

        } else {
            System.out.println("you get not discount");
        }


    }
}
