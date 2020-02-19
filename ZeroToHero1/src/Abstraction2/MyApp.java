package Abstraction2;
public class MyApp {
    static final int num;
    static {
        num=3;
    }


    public static void main(String[] args) {


    Circle circle = new Circle("circle", 5);
        System.out.println(circle.getArea());
        Square square = new Square("square", 5, 4);
        System.out.println(square.getArea());
        Triangle triangle = new Triangle("triangle",4,2);
        System.out.println(triangle.getArea());
        circle.draw();
        triangle.draw();
        square.draw();



}
}
