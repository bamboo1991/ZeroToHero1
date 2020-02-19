package Abstraction2;

public class Square extends Shapes {

    int length;
    int width;
    public Square(String name, int length, int width){
        super(name);
        this.length=length;
        this.width=width;

    }
    @Override
    public Number getArea() {
        return length*width;
    }

    @Override
    void draw() {
        System.out.println("drawing "+super.name);
    }
}
