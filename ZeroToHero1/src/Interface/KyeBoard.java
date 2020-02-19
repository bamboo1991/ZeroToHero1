package Interface;

public interface KyeBoard extends Mouse, Screen {
    int BUTTONS = 101;
    boolean ISBLUETOOTH= true;

    // public abstract void type();
    void type();
    int batteryLife();

}
