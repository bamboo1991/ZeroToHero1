package Inheritance_1;

public class Lion extends WildAnimals {
    public void roar(){
        System.out.println("Lion is roaring");
    }
    @Override
    public void hunt(){
        System.out.println("Lion is hunting all night");
    }
    @Override
    public void sleep(){
        System.out.println("lion is sleeping");
    }
}
