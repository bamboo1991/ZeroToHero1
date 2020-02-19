package Object____Practice;

public class student_TEST {
    String firstName;
    String lastName;
    int age;
    char gender;
    String nationality;
    public void reading() {
        System.out.println("reading");
    }
    public static void main(String[] args) {
        student_TEST test = new student_TEST();
        test.firstName = "Ariet";
        test.lastName = "Stamov";
        test.age = 28;
        test.gender = 'M';
        test.nationality = "Kyrgyzstan";
        System.out.println("your name is " + test.firstName);
        System.out.println("your last name is " + test.lastName);
        System.out.println("your  age is " + test.age);
        System.out.println("you gender is " + test.gender);
        System.out.println("your nationality is " + test.nationality);
test.reading();
    }
}
