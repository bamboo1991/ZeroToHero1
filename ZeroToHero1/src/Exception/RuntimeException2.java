package Exception;

import java.util.Scanner;

public class RuntimeException2 {
    public static void main(String[] args) {
//        int a =5;
//        int b=0;
//        int dvision =a/b;
        try{
            System.out.println(2+2);
            System.exit(0);
        }
        finally{
            System.out.println("finally is always executed!");
        }
    }
}

//
//            Scanner input = new Scanner(System.in);
//
//            int num = 1;
//            do {
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
//
//                try {
//                    System.out.println("division of two numbers is: " + num1 / num2);
//                    num=1;
//                } catch (Exception e) {
//                    System.out.println("you cannot divide the number by 0");
//                    num = 0;
//                }
//
//
//            } while (num == 0);
//            System.out.println("Thank you for using my app");
//
//

