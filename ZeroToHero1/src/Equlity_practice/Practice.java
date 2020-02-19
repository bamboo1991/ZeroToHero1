package Equlity_practice;

public class Practice {
   public void equals(){

       System.out.println("method id in practice");
   }
    public static Practice createPractice(){
        Practice pr=new Practice();
        return pr;
    }
    public static void main(String[] args) {
        Practice practice = new Practice();
        Practice practice1 = new Practice();
        Practice practice2=practice;
        System.out.println(practice == practice1);
        System.out.println(practice.equals(practice1));
        System.out.println(practice.equals(practice2));
        System.out.println(practice==practice2);

        practice.equals();
        String name1 = "Tima";
        String name2 = "Tima";
        System.out.println(name1.equals(name2));
        System.out.println(name1==name2);
        System.out.println(name1==name2);

        Integer num=10;
        Integer num1 = new Integer(10);
        System.out.println(num==num1);
        System.out.println(num.equals(num1));





   }
}