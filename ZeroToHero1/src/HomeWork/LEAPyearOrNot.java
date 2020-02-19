package HomeWork;

import java.util.Scanner;

public class LEAPyearOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year? ");
        int yearS = input.nextInt();
        System.out.println("please enter one of these numbers \n4\n100\n400 ");
        int numbers = input.nextInt();
        int leapYear = yearS % 4;
        int remainderOf4 = leapYear / 4;
        int leapYear2 = yearS % 100;
        int leapYear3 = yearS % 400;
        int remainderOf400 = leapYear3 / 400;
        boolean result = remainderOf4 == leapYear||remainderOf400 == leapYear3;
        if (result){
            System.out.println("it is leap year");
        }else{
            System.out.println("it is not leap year");

        }
    }
 }