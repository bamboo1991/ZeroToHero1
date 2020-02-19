package HomeWork;

import java.util.Scanner;

public class HomeworkShoppingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of tomatoes:");
        int numberOfTomatoes, numberOfCucumber, numberOfCarrot, numberOfEggplant;
        numberOfTomatoes = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter number of Cucumbers:");
        numberOfCucumber = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter number of Carrot:");
        numberOfCarrot = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Please enter number of Eggplant:");
        numberOfEggplant = input4.nextInt();
        int totalPriceForTomatoes = numberOfTomatoes*1;
        double totalpriceForCucumber = numberOfCucumber*0.5;
        double totalPriceForCarrot = numberOfCarrot*.25;
        int totalPriceForEggplant = numberOfEggplant*2;
        int minPurchase = 10;
        double totalPrice = totalPriceForTomatoes+totalpriceForCucumber+totalPriceForCarrot+totalPriceForEggplant;
        double discountRate = totalPrice*10/100;
        boolean result = minPurchase>10;
           double result1 = totalPrice-discountRate;
        double discountAmount = totalPrice-result1;
           if (result){
            System.out.println("original price was "+totalPrice+ " but your " +"total price $" + result1 + " and you seved: $"+discountAmount);
        }else{
               System.out.println("you dont have any discount");
           }


    }
}
