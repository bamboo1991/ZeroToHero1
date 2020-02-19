package WallmartApplication;

import GroceryStroreApp.Main;

public class MainCorp {
    int numberOfWorkers;
    String city;
    static String corporationName="WallMart corp.";


    static {
        System.out.println("this is main corporation!");
    }
    {
        System.out.println("this is instance block");
    }
    public MainCorp(int numberOfWorkers, String city){
        this.numberOfWorkers=numberOfWorkers;
        this.city=city;

    }
    public MainCorp(String corporationName){
this.corporationName=corporationName;
    }
    public void details(){
        System.out.println("corporate name is "+corporationName+" store is located in "+city+" and it has "+numberOfWorkers+" workers" );
    }
}
