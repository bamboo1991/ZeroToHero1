package Polymorphism;

public class Man extends Human implements Dad, Programmer {
    @Override
    public void eat() {
        System.out.println("Man is eating a lot");
    }

    @Override
    public void walk() {
        System.out.println("man can walk");
    }

    @Override
    public void feed() {
        System.out.println("Dad is feeding the family");

    }

    @Override
    public void code() {
        System.out.println("programmer is coding");
    }

    public static void main(String[] args) {
        Dad dad = new Man();
        dad.feed();

    }
}
