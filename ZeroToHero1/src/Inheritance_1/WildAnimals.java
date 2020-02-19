package Inheritance_1;

public class WildAnimals extends Animal{
    @Override
    public void sleep(){
        System.out.println("wilde animals do not sleep");
    }
    @Override
    public void eat(){
        System.out.println("wild animals eat meat");
    }
    public void hunt(){
        System.out.println("Wild animals are hunting");
    }
}
