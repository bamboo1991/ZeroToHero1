package Store;

public class Funiture {
    String name;
    int price;
//    int quantity;
   public Funiture(String name, int price){
        this.name=name;
        this.price=price;
    }
    public void details(){
        System.err.println("price for the funiture "+ price +" and name of the furniture is  "+name);
    }
}
