package Constructor_PRACTICE;

public class Student {
    String name;
    int studentID;
    static String schoolName;
    static {
        schoolName="techtorial";
    }
    {
        name = "John";
        schoolName="techtorial2";
    }
    //======================================================== below code will demonstrate that ther asi not default
    public Student(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
    public void study(){
        System.out.println(name+" is studying.");

    }
    public void study(int hours){
        System.out.println(name+ " is studying "+hours+ " hours");
    }
    public void  study( String name, int hours){
        System.out.println(name+ " is studying "+ hours+ " hours");
    }
}
