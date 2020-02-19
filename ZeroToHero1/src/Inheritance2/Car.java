package Inheritance2;

public class Car extends Vehicle {
    public Car(String carName){
        super(carName);
    }
    public int averageSpeed(){
        return 40;
    }
    String color;
    int doorNum;
    public Integer maxSpeed(){
        return 120;
    }
}
