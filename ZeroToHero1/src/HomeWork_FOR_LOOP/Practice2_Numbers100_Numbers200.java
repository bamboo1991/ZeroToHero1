package HomeWork_FOR_LOOP;

import java.util.Scanner;

public class Practice2_Numbers100_Numbers200 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("first number ");
        int number1 = input.nextInt();
        System.out.println("second number");
        int number2 = input.nextInt();
        int divide =11;
        int result =0;
for (;number1<=number2; number1++){
    if (number1%11==0){
        System.out.println("this is number that are divided by 11 "+number1); }
    result+=number1;
}

    System.out.println("result "+ result);
}

}