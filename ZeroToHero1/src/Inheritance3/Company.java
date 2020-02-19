package Inheritance3;

public class Company {
    String companyName;

    public Company(){
        super();
    }


    public Company(String name){
        companyName=name;
        this.companyName=name;
    }
    Boolean isHiring(){
        return isHiring();
    }
    protected Object progress(){
        return "this company is good";
    }
}
