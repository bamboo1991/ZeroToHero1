package ARRAYLIST_PRACTICE;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ASSA {
    public static void main(String[] args) {
        List<String> coffeeShop = Arrays.asList("coffee $2.2", "cappuccino $4.5", "Latte $3.5", "Hot Chocolate $4.1", "Black tea $3.0");
        for (int i=0; i<coffeeShop.size(); i++){
            int indexOf$ = coffeeShop.get(i).indexOf('$');
            String onlyPriceAmount = coffeeShop.get(i).substring(indexOf$+1);
            double price = Double.parseDouble(onlyPriceAmount);
            double extraValue = price*10/100;
            double newPrice1 = price+extraValue;
            String newValue = coffeeShop.get(i).substring(0,indexOf$+1)+newPrice1;
            coffeeShop.set(i,newValue);




        }
        System.out.println(coffeeShop);




        // coding bat








    }
}








