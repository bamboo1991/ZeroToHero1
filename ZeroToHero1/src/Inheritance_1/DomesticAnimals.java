package Inheritance_1;

public class DomesticAnimals extends Animal {
    public boolean friendly(){
        return true;
    }
    @Override // Annotation
    public void run(){

    animalName=" Domestic animal";
    System.out.println("Domestic animal is running");
    }
    @Override
    public void eat(){
        System.out.println("Domestic animal eat less");

    }



}
