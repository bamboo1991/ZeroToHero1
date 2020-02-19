package Object____Practice;

public class Student_____Practice {

    String firstName;
    String lastName;
    int age;
    char gender;
    String nationality;

    // public is access modifier.
    // void is return type, in java, if you are not returning anything we need use void retrun type.
    // method signature: name of the method plus parameter, is called method signature.

    public void study(String day) {
        System.out.println("student is studying on " +day);
        System.out.println("10");

    }
    public void reading() {
        System.out.println("reading");
    }
    public int studyTime() {
        int hour = 10;
        System.out.println("Student is studying " + hour + " hours");
        return hour;


    }

    public static void main(String[] args) {
        Student_____Practice first=new Student_____Practice();
        first.firstName="Ariet";
        first.lastName="Stamov";
        first.age=28;
        first.gender='M';
        first.nationality="Kyrgyzstan";
        System.out.println("your name is "+ first.firstName);
        System.out.println("your last name is "+ first.lastName);
        System.out.println("your  age is "+ first.age);
        System.out.println("you gender is "+ first.gender);
        System.out.println("your nationality is "+ first.nationality);
        Student_____Practice second =new Student_____Practice();
        second.firstName="Ariet";
        second.lastName="Stamov";
        second.age=28;
        second.gender='M';
        second.nationality="Kyrgyzstan";
        System.out.println("your name is "+second.firstName);
        System.out.println("your last name is "+ second.lastName);
        System.out.println("your  age is "+ second.age);
        System.out.println("you gender is "+ second.gender);
        System.out.println("your nationality is "+ second.nationality);
        first.study("2");

        int shour=first.studyTime(); //---> The student is studying 10 hours
        System.out.print("The student study "+(shour*60)+" minutes");

}}


