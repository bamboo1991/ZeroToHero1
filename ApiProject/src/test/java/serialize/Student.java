package serialize;

public class Student {
    private int age;
    private String studentName;
    private String lastName;

    public Student(int age, String studentName, String lastName) {
        this.age = age;
        this.studentName = studentName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
