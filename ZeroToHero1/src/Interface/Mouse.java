package Interface;

public interface Mouse {
    String COLOR="white";
    void click();

    default void scroll(){
        System.out.println("mouse is scrolling up and down");
    }

}
