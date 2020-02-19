package Equlity_practice;

public class PassByValue {
    public static void updateNum(int num){
        num=10;
    }
public static String  updateWord(String str){
        str="java is my world";
return str;}
public static double aBoolean(double bl){
        bl=bl*10%5;
    System.out.println("-->"+ bl);
    return bl;
    }
    public static void main(String[] args) {
        int num=5;
         String str="java";
        updateNum(num);
        System.out.println(num);
        updateWord(str); //java is working with pass by value. bc it will not change the str value.
        //java will take copy of my str, it eill keep working working on 'java
        System.out.println(str);
        double bl=6.4;
        float fl = 6.4f;
        float fl1 =6;
        aBoolean(bl);
        System.out.println(aBoolean(bl));
        //bl=aBoolean(bl);
        System.out.println(bl);
    }

}
