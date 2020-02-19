package Encapsulation;

public class Departments {
    private String departmentName;
    private int departmentID;




    public Departments(String departmentName, int departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }


}
