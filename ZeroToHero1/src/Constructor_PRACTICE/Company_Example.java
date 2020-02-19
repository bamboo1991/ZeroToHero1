package Constructor_PRACTICE;

import com.sun.security.jgss.GSSUtil;

public class Company_Example {
    String name;
    String location;
    String businessType;
    int employeeNumber;
    String yearlyBudget;

    public Company_Example(String name, String location, String businessType, int employeeNumber, String yearlyBudget) {
        this.name = name;
        this.location = location;
        this.businessType = businessType;
        this.employeeNumber = employeeNumber;
        this.yearlyBudget = yearlyBudget;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(businessType);
        System.out.println(employeeNumber);
        System.out.println(yearlyBudget);

}



public static void main(String[] args) {
    Company_Example company1 = new Company_Example("Techtorial", "Desplaines", "Coding academy", 3, "50000");
    Company_Example company2 = new Company_Example("Chase", "Desplaines", "Bank", 2000, "2000000");
    Company_Example company3 = new Company_Example("Walgreens ", "Chicago", "P", 3, "50000");
    Company_Example company4 = new Company_Example("Techtorial", "Desplaines", "Coding academy", 3, "50000");
    Company_Example company5 = new Company_Example("Techtorial", "Desplaines", "Coding academy", 3, "50000");
company1.displayInfo();
company2.displayInfo();

}
}
