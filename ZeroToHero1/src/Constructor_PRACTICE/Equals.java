package Constructor_PRACTICE;

public class Equals {
    public String name;
    public int age;

    public Equals(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Equals person1 = new Equals("Ariet", 22);
        Equals person2 = new Equals("Sandu", 21);
        Equals person3 = new Equals("Ariet", 22);
        System.out.println(person1.equals(person3));
        System.out.println(person1==person3);
    }

    }

