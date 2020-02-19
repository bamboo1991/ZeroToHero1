package Inheritance3;

public class HR_under_the_Company extends Company{
    public HR_under_the_Company(String name){
        super(name);
    }

    @Override
    public Boolean isHiring(){
        return true;
    }
    public String progress(){
        return "HR is working hard in order to complete";
    }

}

