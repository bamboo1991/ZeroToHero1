package Primitives;

public class OperatorPrecedence {
    public static void main(String[] args) {

        //*, / and % will be executed before the + and -;
        // if there are same level of precedence, it will be executed left to right
        int calculate = 10 + 3 / 8;
        System.out.println(calculate);
        double decimalNumber = 9 / 5d;
        System.out.println(decimalNumber);
        int totalNumber = 10 * 3 + 4 % 3 - 8 * 2;
        // if you want to change the precedence than put paranthesis ()
        // 10*3=30 +
        System.out.println(totalNumber);
        int totalNumber1 = 10 * (3 + 4) % (3 - 8) * 2;
        // 3+4=7
        //3-8=5
        //10
        System.out.println(totalNumber1);
    }
}
