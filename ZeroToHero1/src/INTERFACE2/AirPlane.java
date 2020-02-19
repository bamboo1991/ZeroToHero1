package INTERFACE2;

public class AirPlane  implements Flyable,Noise{
    @Override
    public void fly() {
        System.out.println("plane is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Zhhhh");
    }
}
