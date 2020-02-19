package INTERFACE2;

public class Bird implements Flyable, Noise {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("chick chick");
    }
}
