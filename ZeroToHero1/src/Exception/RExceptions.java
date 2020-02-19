package Exception;

import java.util.Scanner;

public class RExceptions {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name=input.next();
//        System.out.println("number of chars is: "+name.length());
        String name =null;

        try {
            int sum = 10/0;
        int length= name.length();

        }catch (Error e){
            System.out.println("you cannot get length of null String");

        }catch (Exception ee){
            System.out.println("There is Arithmethic Exception");

        }catch (Throwable e){
            System.out.println("Throwing Exception ");
        }
    }
}
