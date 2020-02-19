package WrapperClasses;
import java.util.Scanner;
public class Wrapper_Classes {
    public static void main(String[] args) {
        // int -> Integer;/
        //double -> Double;
        Integer num1 = new Integer("22");
        int num1prm = num1; //Unboxing
        num1prm = num1prm + 5;
        System.out.println(num1prm);
        Integer anynumber = Integer.valueOf("33");
        int result = anynumber;
        System.out.println(result+4);
        Integer num2 = Integer.valueOf("101");
        int num2prm = num2;
        int myNUm = 1;
        Integer myNumWrap = myNUm; //autoboxing
        System.out.println(myNumWrap);
        Double double1 = Double.valueOf("4.5");
        double doublprm = double1;
        System.out.println(double1);
        //BOOLEAN
        Boolean b1=Boolean.valueOf("FALSE");
        System.out.println(b1);
        Integer number1 = 5;
        Integer number2 =10;
        System.out.println(number1+number2);
        System.out.println(number1.equals(number2));
        Boolean boolean1 = false;
        Boolean boolean2 =false;
        System.out.println("---->> " +boolean1.equals(boolean2));
        int number3 = Integer.parseInt("9"); // it will return int.
        System.out.println(number3);
        double number4 = Double.parseDouble("3.5");
        System.out.println(number4);
int number5 = Integer.sum(5,2);
        System.out.println(number5);
        //===========================================================================
        Scanner input =new Scanner(System.in);
        System.out.println("enter numbers in a String");
        String strNumbers = input.next();
        Integer ScanNumbers = Integer.valueOf(strNumbers);
        System.out.println(ScanNumbers+ScanNumbers);




    }
}
