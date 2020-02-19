package WhileLOOP;

import java.util.Scanner;

public class OilChangeRemainder {
    public static void main(String[] args) {
        ///// Sum of Numbers/////////////////
        Scanner input4 = new Scanner(System.in);
        System.out.println("first numbers");
        int firstNumbers = input4.nextInt();
        System.out.println("second numbers");
        int secondNumbers = input4.nextInt();
        int countofsum = 0;
        while (firstNumbers <= secondNumbers) {
            countofsum += firstNumbers;
            firstNumbers++;
        }
        System.out.println("sum of two entered int is: " + countofsum);
        // Oil Change/////
        Scanner input = new Scanner(System.in);
        System.out.println("How many Years");
        int yearNumbers = input.nextInt();
        int annualOilChange = 12 / 3;
        int zero = 0;
        while (yearNumbers > 0) {
            annualOilChange = annualOilChange * yearNumbers;
            yearNumbers--;
        }
        System.out.println("based on your entered Years, you have " + annualOilChange + " oil changes");
        //// second version of oil change//////
        Scanner input1 = new Scanner(System.in);
        System.out.println("How many Years");
        int years = input.nextInt();
        int month = years * 12;
        int numbers = 0;
        while (month > 0) {
            numbers++;
            int oilChange = month / 3;
            System.out.println(numbers + "  oil change");
            month = month - 3;
        }
        // Print Stars as you wish
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter any value");

        System.out.println("please enter any number");
        int number = input3.nextInt();
        while (number > 0) {
          //  System.out.println(value);
            number--;
        }
    }
}
