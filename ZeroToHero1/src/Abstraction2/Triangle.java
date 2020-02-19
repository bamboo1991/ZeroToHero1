package Abstraction2;

public class Triangle extends Shapes {
   int height;
    int base;

    public Triangle(String name, int height, int base) {
        super(name);
        this.height=height;
        this.base=base;
    }

    @Override
    public Number getArea() {
        return height*base/2;
    }

    @Override
    void draw() {
        System.out.println("Drawing  "+super.name);
    }
}
