package Interface;

public class User extends Computer{
    @Override
    public boolean onSale() {
        return false;
    }

    @Override
    public void type() {
        System.out.println("Keyboard is running");
    }

    @Override
    public int batteryLife() {
        return 12;
    }

    @Override
    public void click() {
        System.out.println("Mouse is clicking");
    }

    @Override
    public void display() {
        System.out.println("Display is typing");
    }

    public static void main(String[] args) {
        User user =new User();
        System.out.println(user.batteryLife());
        System.out.println(user.MEMORY);
        System.out.println(user.onSale());
    }
}
