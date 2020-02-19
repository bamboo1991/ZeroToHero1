package Interface3;

public interface MemoryCard {
    Object SIZE=128+"GB";
    String NAME="Sony";

    Object storeFiles();
    default void regularMethod(){
        System.out.println("this is method is from MemoryCard Interface");
    }
    static void staticMethod(){
        System.out.println("this is static method from MemoryCard interface");
    }

}
