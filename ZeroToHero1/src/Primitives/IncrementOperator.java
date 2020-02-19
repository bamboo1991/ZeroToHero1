package Primitives;

public class IncrementOperator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1++);
        System.out.println(++num1);
        int result=num1++ + --num1 - num1--;
        //           13   +    13  - 13 = 13;
        System.out.println(num1);
        int total;
    }
}
