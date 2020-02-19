package GroceryStroreApp;

import java.util.Scanner;

public class CheckOut {
    Scanner input=new Scanner(System.in);
    public String returnsString(String paymentOption){
        System.out.println("We accept credit card, debit card, Paypal, Bitcoin etc.");
        paymentOption=input.nextLine();
        return "You payment option is "+paymentOption;
    }
}


