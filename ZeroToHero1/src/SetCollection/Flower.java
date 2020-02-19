package SetCollection;

import java.util.HashSet;
import java.util.Set;

public class Flower {
    String name;
    String color;

    public Flower(String name, String color){
        this.name=name;
        this.color=color;
    }

    public String toString(){

        return " the name of the flower is: "+name+" and color is: "+color;
    }
    // every System.out.ptinln(calls toString Mehtod
    // If the class has not toString method, toString method will come from the object class
    // we are creating the toString method in this class to be able print all our instance
    // variables in any format which we created
    // Print all the object color if object name is starting with B



    public static void main(String[] args) {
        Flower fl1 = new Flower("rose", "Yellow");
        Flower fl2 = new Flower("BlakcStone", "Pink");
        Flower fl3 = new Flower("whiteStone" , "Blue");
        Flower fl4 = new Flower("Bee", "BlacklBlue");
        Flower fl5 = new Flower("Begonia", "Green");

        Set<Flower> newFlower = new HashSet();
        newFlower.add(fl1);
        newFlower.add(fl2);
        newFlower.add(fl3);
        newFlower.add(fl4);
        newFlower.add(fl5);

        for (Flower i : newFlower){
            System.out.println(i.toString());
        }
        for (Flower fl:newFlower){
            if (fl.name.startsWith("B"));
            System.out.println(fl.color);
        }
}}
