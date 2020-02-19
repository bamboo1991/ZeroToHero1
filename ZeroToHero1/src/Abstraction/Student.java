package Abstraction;

public abstract class Student {
    int studentId;
    String studentName;


    public void study(){
        System.out.println("student is studying");
    }
    public abstract void attendClass();
    abstract Boolean isActive();



}
