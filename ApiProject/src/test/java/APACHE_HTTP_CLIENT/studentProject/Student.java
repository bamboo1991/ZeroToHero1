package APACHE_HTTP_CLIENT.studentProject;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private String facultyName;
    private List<SchoolLocations> names;
    private List<ClassList> classesList;
    private int cost;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<SchoolLocations> getNames() {
        return names;
    }

    public void setNames(List<SchoolLocations> names) {
        this.names = names;
    }

    public List<ClassList> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<ClassList> classesList) {
        this.classesList = classesList;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public Student(int studentId, String studentName, String facultyName, List<SchoolLocations> names, List<ClassList> classesList, int cost) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.facultyName = facultyName;
        this.names = names;
        this.classesList = classesList;
        this.cost = cost;
    }
}
