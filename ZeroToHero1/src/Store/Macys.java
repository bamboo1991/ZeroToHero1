package Store;



public class Macys extends Store{
    String name="Macy's";
    public void sellClothe(){
        System.out.println("Selling clothes from the " +super.name);
    }
public static void staticMethod(){

}
public String toString(){
        return name+" is located in chicago";
}
    public static void main(String[] args) {
        Macys m = new Macys();
    m.sellClothe();
    Store store = new Store();
        store.sellClothe();
        // runtime polymorphism / dynamic binding/ overriding methods.
        // Compile time Polymorphism/ static binding/ overloading.
    }
}
