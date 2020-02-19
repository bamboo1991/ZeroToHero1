package GroceryStroreApp;

import java.util.ArrayList;
import java.util.List;

public class GroceryList extends GroceryBuddy {
    List<String> list=new ArrayList();
    public void purchasedItems(String product) {
        boolean found=false;
        for (int i = 0; i<fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(product) || vegetables[i].equalsIgnoreCase(product) ||
                    otherProducts[i].equalsIgnoreCase(product)) {
                list.add(product);
                System.err.println(product+ " was added");
                found=true;
            }}if (!found) {
            System.err.println(product+ " is not available");
        }
    }
    public List ListOfPurchasedItems(){
        return list;
    }
    public double totalPrice(){
        double sum=0.0;
        for(int i=0;i<list.size();i++){
            sum+=getPrices(list.get(i));
        }
        if(sum>50){
            sum=sum*10/100;
        }else if(sum>100){
            sum=sum*15/100;
        }else{
            return sum;
        }
        return sum;
    }
    public void modifyList(int position, String newItem){
        if(position<=list.size())
            list.set(position,newItem);
    }
    public  void removeItem(String name){
        list.remove(name);
    }
    public  int findItem(String name ){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equalsIgnoreCase(name)){
                return i;
            }
        }
        return 0;
    }
    public void modifyListAgain(String currentItem,String newItem){
        for(int i=0;i<list.size();i++){
            if (list.get(i).equalsIgnoreCase(currentItem)) {
                list.get(i).replace(currentItem,newItem);
            }
        }
    }

}
