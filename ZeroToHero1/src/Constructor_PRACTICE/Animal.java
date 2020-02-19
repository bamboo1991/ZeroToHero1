package Constructor_PRACTICE;

public class Animal {

        String name;
        String location;
        public Animal(String name, String location) {
this.name=name;
this.location=location;

    }
    public static void main(String[] args) {
        Animal animal = new Animal("Pars", "chicago");
        // every time when we create the object constructor will be called.
        System.out.println(animal.name);
        System.out.println(animal.location);
    }
}
