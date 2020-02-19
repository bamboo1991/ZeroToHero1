package WallmartApplication;

public class Test_Walmart {
    public static void main(String[] args) {
        MainCorp mainCorp = new MainCorp( 199, "Chicago" );

        MainCorp m = new Skokie_location(22, "Evanstron");
        m.details();
MainCorp m1 = new Chicago_location(32, "Niles");
m1.details();
        System.out.println(m1.corporationName);
        Skokie_location skokie_location = new Skokie_location(21,"Shaulnumrg");
skokie_location.city="Clevelnad";
skokie_location.details();
    }
}
