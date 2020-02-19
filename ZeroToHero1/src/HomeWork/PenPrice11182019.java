package HomeWork;

import java.util.Scanner;

public class PenPrice11182019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the pen price?");
        double price = input.nextDouble();
        System.out.println("Give us a discount Please?");
        double discount = input.nextDouble();
        double percentage = discount * price / 100;
        System.out.println("Discount amount $" + percentage);
        double finalPrice = price - percentage;
        System.out.println("Final price for pen is: $" + finalPrice);

    }
}


