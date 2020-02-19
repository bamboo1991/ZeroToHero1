package Abstraction2;

public abstract class Shapes {
    String name;
    public abstract Number getArea();

    public Shapes(String name){
        this.name=name;
    }
    abstract void draw();


    }

