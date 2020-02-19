package WallmartApplication;

public class Skokie_location extends MainCorp {
    public Skokie_location(int numberOfWorkers, String city) {
        super(numberOfWorkers, city);
    }
    public void details(){
        System.out.println("Welcome to Skokie location!");
        System.out.println("Name is "+corporationName+" store is located in " +city+" and it has "+numberOfWorkers+" employees");
    }
}
