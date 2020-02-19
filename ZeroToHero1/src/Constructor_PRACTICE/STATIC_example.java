package Constructor_PRACTICE;

public class STATIC_example {
    int num1;
    static int num2;

    public static void main(String[] args) {
        num2=20;
       STATIC_example example1 = new STATIC_example();
       STATIC_example example2 = new STATIC_example();
       example1.num1=20;
       num2=example1.num1*5; // num2 =100;
        example1.num1=example2.num2*2; // example1.num1 =200;
       example1.num1=example2.num1*2;  //example2. num2 = 100, example1.num1 =200;

       System.out.println();
       //example1.num1=20;
       //num2=example1.num1*5;

















    }
}
