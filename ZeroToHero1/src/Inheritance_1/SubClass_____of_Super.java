package Inheritance_1;

public class SubClass_____of_Super extends SuperClass {
    public void subMethod(){
        myMethod();
        System.out.println(name+" and "+number);
    }

    public static void main(String[] args) {
        SubClass_____of_Super superClass = new SubClass_____of_Super();
        superClass.subMethod();
    }


}
