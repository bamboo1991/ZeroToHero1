package WallmartApplication;

public class Chicago_location extends MainCorp {
    public Chicago_location(int numberOfWorkers, String city) {
        super(numberOfWorkers, city);
    }
    public void details(){
        System.out.println("---> Name is "+corporationName+" store is located in " +city+" and it has "+numberOfWorkers+" workers");
    }
}
