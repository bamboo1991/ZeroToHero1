package Encapsulation;

public class HR {
    public static void main(String[] args) {
        Departments departments = new Departments("IT", 101);
        Employees employees = new Employees("Sarah", 100, "SDET",new Departments("IT",101));
        int departmentId=employees.getDepartments().getDepartmentID();
        employees.getDepartments().setDepartmentID(102);
        employees.getDepartments().setDepartmentName("Sales");
Employees employees1 = new Employees("Areit",95, "dev",new Departments("Developer",101));
        Employees employees2 = new Employees("Baha",915, "dev",new Departments("Developer",101));
        Employees employees3 = new Employees("Beka",905, "dev",new Departments("Developer",101));
        Employees[] allemployees = new Employees[]{employees,employees1,employees2,employees3};

        for (int i=0; i<allemployees.length; i++){
            if (allemployees[i].getDepartments().getDepartmentID()==101&&allemployees[i].getSalary()>100){
                System.out.println(allemployees[i].getName());
            }

        }

    }




}
