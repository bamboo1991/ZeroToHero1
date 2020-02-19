package HomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork11202019 {
    public static void main(String [] args){
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter values");
        String value = input.nextLine();
        System.out.println("Please enter the starting number:");
        int num1 = input.nextInt();
        System.out.println("Please enter the ending number:");
        int num2 = input.nextInt();
        System.out.println("print value "+ value.substring(num1,num2));
        //*/
       // ==============================================================//


        String value1 = " Snicker ";
        String value2 = "COOKIE";
         char result=value1.trim().toUpperCase().substring(1,2).charAt(0);
        System.out.println("result of first String "+ result);
          value2=value2.toLowerCase().replace('o','u').concat("s");
        System.out.println("result of String 2 is: "+value2);







    }
}
