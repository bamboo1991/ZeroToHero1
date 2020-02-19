package Encapsulation;

public class Employees {
    private String name;
    private int salary;
    private String position;
    private Departments departments;
public Employees(String name, int salary, String position, Departments departments){
    this.name=name;
    this.salary=salary;
    this.position=position;
    this.departments=departments;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }
}
