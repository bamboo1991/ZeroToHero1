package ARRAYLIST_PRACTICE;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grocery_Store_Practice {

        /**
         * This class will automatically add values to shopping List
         *and will print Welcome to Grocery Store message with items that needs to bought from store.
         *
         * methods
         * buy(String item) -> this ethod has to remove secific item from your shopping list.
         * return (String item)-> this mehtod will add retrunned item back to shopping list.
         *
         * car()-> it has to tell me "heading to grocery store" message.
         * isOpen()-> has to print if store is open. else false.
         *
         */
        static int time;

       static List<String> shoppingList = new ArrayList();
    static List<String> returnItems= new ArrayList();
    //static List<String> outOfStoreItems = new ArrayList();
     static { //static block
         shoppingList.add("Bread");
         shoppingList.add("Milk");
         shoppingList.add("Cereal");
         shoppingList.add("Potato");
         shoppingList.add("Oil");
         System.out.println("Welcome to Grocery store");
         System.out.println(shoppingList);
        returnItems.add("Bread");
        returnItems.add("Milk");
        returnItems.add("Cereal");
        returnItems.add("Potato");
        returnItems.add("Oil");



    }
    public static void buy(String item){
    shoppingList.remove(item);

    }
    public static void returnItem(String item){

         if(returnItems.contains(item)){
             shoppingList.add(0,item);
             System.out.println(shoppingList);
         }else{
             System.err.println(item+": this product does not match with our product list");
            // outOfStoreItems.add(0,item);


         }

    }
    public static void car(){
        System.out.println("heading to the grocery store");
    }
    public Grocery_Store_Practice(int time){
         this.time=time;
    }
    public static boolean isOpen(){
         if (time>=9&&time<=21){
             return true;
         }else {
             return false;
         }
    }

    public static void main(String[] args) {
        Grocery_Store_Practice store1 =  new Grocery_Store_Practice(8);
        System.out.println(store1.isOpen());
        store1.car();
        store1.buy("Bread");
        store1.returnItem("coc");
        store1.returnItem("Bread");

        System.out.println(store1.shoppingList);




    }
}
