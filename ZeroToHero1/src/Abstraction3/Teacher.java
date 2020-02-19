package Abstraction3;

public class Teacher {
    final String TEACHERNAME;
    static {
        System.out.println("i am static block of teacher class");
    }
    {
        System.out.println("i am instance block of teacher class");
    }
    public Teacher(String teacherName){
        this.TEACHERNAME=teacherName;
        System.out.println("i am constructor of Teacher class");
    }
}
