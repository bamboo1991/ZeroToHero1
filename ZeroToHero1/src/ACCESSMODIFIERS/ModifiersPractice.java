package ACCESSMODIFIERS;

public class ModifiersPractice {
    private int studentNum = 50;
    protected String name = "techtorial";

    public void sum(int number){
        number=studentNum+number;
        printout();
        System.out.println(number);
    }
    private void printout(){
        System.out.println("this is mu main");

    }




}
