package Inheritance3;

public class IT_DEPT extends Company {
    public IT_DEPT(String name){
        super(name);

    }
    @Override
    public Boolean isHiring(){
        return true;
    }
    public void SDET(){
        System.out.println("SDET is testing one application");
    }


}
