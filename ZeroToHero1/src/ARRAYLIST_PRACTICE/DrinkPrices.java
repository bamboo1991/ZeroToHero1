package ARRAYLIST_PRACTICE;

import java.util.Arrays;
import java.util.List;

public class DrinkPrices {
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("coffee $2.20", "cappuccino $4.50", "Latte $3.50", "Hot Chocolate $4.10", "Black tea $3.0");
        for (int i=0; i<drinks.size(); i++){
            int indexOf$ = drinks.get(i).indexOf('$');
            String priceStr = drinks.get(i).substring(indexOf$+1);
            double price = Double.parseDouble(priceStr);
            double newPrice = price*1.1;
            String newValue = drinks.get(i).substring(0,indexOf$+1) +newPrice;
            drinks.set(i,newValue);
        }
        System.out.println(drinks);
    }
}
