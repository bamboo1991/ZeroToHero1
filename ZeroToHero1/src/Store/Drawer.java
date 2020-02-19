package Store;

public class Drawer extends Funiture {
    int quantity;
    public Drawer(String name, int price, int quantity) {
        super(name, price);
        this.quantity=quantity;
    }
    public void details(){
        System.err.println("name of the funiture " +name+ " and price is "+ price+ "and quantity " +quantity);
    }

    public static void main(String[] args) {
//        Funiture funiture1 =new Funiture("Funiture", 10);
//        Funiture funiture2 = new Table("coffe table", 50, 2);
//        Funiture funiture3=new Drawer("small",100,1);
//        Funiture funiture4 =new Sofa("Grey sofa", 140,3);
//        funiture2.details();
        Funiture [] funitures = new Funiture[3];
        funitures[0]=new Table("White", 50,4);
                funitures[1]=new Drawer("samll ",100,2);
        funitures[2]=new Sofa("grey ",200,2);
        int sum =0;
        for (int i=0; i<funitures.length; i++){
            sum+=funitures[i].price+funitures[i].price;
            }System.out.println(sum);



    }
}
