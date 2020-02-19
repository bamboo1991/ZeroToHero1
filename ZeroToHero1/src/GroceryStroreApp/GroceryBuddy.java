package GroceryStroreApp;

import java.util.Arrays;

public class GroceryBuddy extends CheckOut{
    String [] fruits={"Apple","Orange", "Watermelon","Banana","Pineapple","Grape","Mango","Strawberry","Peach","Cherry"};
    String [] vegetables={"Carrots","Broccoli","Onion","Potato","Tomato","Cucumber","Corn","Bean","Pepper", "Spinach"};
    String[] otherProducts={"Milk","Bread","Beef","Eggs","Chicken","Sugar","Salt","Coffee","Rice","Pasta"};
    double [] fruitPrices={2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};
    double[] vegetablePrice={4.99, 0.99,7.99,2.49,1.99,1.99,9.49,1.99,5.39,1.79};
    double[] otherPrice={4.9, 0.99,7.99,2.9,1.99,1.99,9.9,1.99,5.39,1.9};
    public void printFruits(){
        System.out.println(Arrays.toString(fruits));
    }
    public void printVegetables(){
        System.out.println(Arrays.toString(vegetables));
    }
    public void printProducts(){
        System.out.println(Arrays.toString(otherProducts));
    }
    public double getPrices(String name){
        double price=0;
        for(int i=0;i<10;i++){
            if(fruits[i].equalsIgnoreCase(name)){
                price=fruitPrices[i];
            }else if( vegetables[i].equalsIgnoreCase(name)){
                price=vegetablePrice[i];
            }else if( otherProducts[i].equalsIgnoreCase(name)){
                price=otherPrice[i];
                break;
            }
        }
        return price;
    }

}
