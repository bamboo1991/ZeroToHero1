package Abstraction3;
public class Programmer extends Teacher {
    public Programmer(String teacherName){
        super(teacherName);
        System.out.println("i am block of teacher class");
    }
    static {
        System.out.println("i am static block of Programmer class");
    }
    {
        System.out.println("i am instance block of Programmer class");
    }
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Arslan");
        System.out.println("------------------------");
        Programmer programmer1 = new Programmer("Doe");
    }
}
