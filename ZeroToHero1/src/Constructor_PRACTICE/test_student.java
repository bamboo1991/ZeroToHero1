package Constructor_PRACTICE;



public class test_student {
    public static void main(String[] args) {
        Student st1 = new Student("Ismail", 7);
        Student st2 = new Student("Baha", 8);
        Student st3 = new Student("Ariet", 9);
        Student st4 = new Student("Bermet", 10);
        //st1.schoolName="Techtorial";
        System.out.println(st4.schoolName);
      //  Student.schoolName="NLU";
        System.out.println(st1.schoolName);
        System.out.println(st2.schoolName);
        System.out.println(st3.schoolName);
        System.out.println(st4.schoolName);
        st1.study("ariet",3);
        System.out.println(st1.name);
    }
}
