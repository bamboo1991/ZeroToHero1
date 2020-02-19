package WrapperClasses;


import java.util.Arrays;
import java.util.List;


public class WrapperExample {
    public static void main(String[] args) {
       List<String> drinks = Arrays.asList("Coffee $2.20","Tea $2.75", "cappuccino $4.5", "latte $2.75");
       for (int i =0; i<drinks.size(); i++){
           int indexOf$ = drinks.get(i).indexOf("$");
           String prices = drinks.get(i).substring(indexOf$+1);
           double price = Double.parseDouble(prices);
           double newPrice = price*1.1;
           String newValue = drinks.get(i).substring(0,indexOf$+1)+newPrice;
           drinks.set(i,newValue);

       }
        System.out.println(drinks);
    }
}
