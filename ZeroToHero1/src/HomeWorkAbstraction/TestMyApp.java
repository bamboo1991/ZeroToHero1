package HomeWorkAbstraction;
public class TestMyApp {
    public static void main(String[] args) {
        ProductOwner productOwner = new ProductOwner("Chase Bank", "Bank Application", 150000);
        ScrumMaster scrumMaster = new ScrumMaster("Mike","Monitoring", 120000);
        Developer developer = new Developer("Beta team", "Developing", 170000);
        SDET sdet = new SDET("Alpha","Checking Account", 15000);
        System.out.println(productOwner.salary);
        System.out.println(productOwner.progress());
        productOwner.work();
        System.out.println(productOwner.sprintNumber());




    }
}
