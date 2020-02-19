package Inheritance2;

public class Truck extends Vehicle {
    String model;
public Truck(String model){
super(model);
}
public Integer capacity(){
    return 10000;
}
public String getModel(){
    return model;
}
}
