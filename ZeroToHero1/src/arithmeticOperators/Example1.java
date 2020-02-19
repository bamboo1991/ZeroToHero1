package arithmeticOperators;

public class Example1 {
    public static void main(String [] args){
        boolean isJavaFun = false;
        //System.out.println(!isJavaFun);
        System.out.println(true && false);
        System.out.println(true &&  true);
        System.out.println(false && false);
        System.out.println(false&&true);
        System.out.println("--------------------------------____________________-------------");
        System.out.println(true && true && true && false);
        // && -> all values has to be true in order to get true return.
        System.out.println("--------------------------------____________________-------------");
        System.out.println(true ||true);
        System.out.println(true || false);
        System.out.println(false || false || false || false);
        // -> at least one value should be true in order to get true
    }
}
