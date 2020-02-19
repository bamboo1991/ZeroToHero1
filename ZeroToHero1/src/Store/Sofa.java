package Store;

public class Sofa extends Funiture {
    int quantity;
    public Sofa(String name, int price, int quantity) {
        super(name, price);

        this.quantity=quantity;
    }
    public void details(){
        System.out.println("name of the funiture "+name+" and price is "+ price+ "and quantity "+quantity);
    }
}
