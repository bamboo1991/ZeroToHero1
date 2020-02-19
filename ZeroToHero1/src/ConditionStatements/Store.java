package ConditionStatements;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        /*
        if customer buys between 10 or 15 tables, he(she) get 10% discount
        if customer buys more than 15 tables, there is 20% discount
        if customer buys more than 20 tables, he*(she) wil get 25%.
        write a program that will adk form user to enter number of tables
        he(she) is buying and give hom final price.
        1 table = $110
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter how many tables you want to buy?");
        int tableNumber = input.nextInt();
        int priceOftable = 110;
        if(tableNumber <=10){
            System.out.println("your total price will be "+ tableNumber*priceOftable);


        }else if(tableNumber >=0 &&tableNumber < 10 && tableNumber<15){
            int discountAmount = tableNumber*110*10/100;
            System.out.println("your dicsoutn ammount "+discountAmount);
            System.out.println("your total price will be " + (tableNumber*priceOftable-discountAmount));
        }else if(tableNumber >15 &&tableNumber <20){
            int discountAmount = tableNumber*priceOftable*20/100;
            System.out.println("your dicsoutn ammount "+discountAmount);
            System.out.println("your total price will be: "+(tableNumber*priceOftable-discountAmount));
        }else if(tableNumber >=20 ){
            int discountAmount = tableNumber*priceOftable*25/100;
            System.out.println("your dicsoutn ammount "+discountAmount);
            System.out.println("your total will be: "+(tableNumber*priceOftable-discountAmount));
        }else{
            System.out.println("total number is invalid.");
        }



    }
}
