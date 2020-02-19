package Inheritance2;

public class Camry extends Car {
    String name;
    public Camry(String name){
        super(name);
        this.name=name;

    }
    @Override
    public int averageSpeed(){
        return 35;
    }
    @Override
    public Integer maxSpeed(){
        return 125;
    }

}
