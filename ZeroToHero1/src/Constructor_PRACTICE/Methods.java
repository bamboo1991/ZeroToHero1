package Constructor_PRACTICE;

public class Methods {
    // access modifier, static, return type,   method name.
       public           static    void         method1(){

        System.out.println("i am static method 1");
    }
    public void method2(){
        System.out.println("i am non-static method 2");
        method1();
        method3();
        method2();

    }
    public static void method3(){
        System.out.println("i am static method 3");
    }

    public static void main(String[] args) {
            method1();
           method3();

    }
}
