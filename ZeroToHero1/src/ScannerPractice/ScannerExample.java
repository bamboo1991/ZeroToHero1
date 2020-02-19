package ScannerPractice;



import java.util.Scanner;

public class ScannerExample {
    public static void main(String [] args){
       Scanner input1 = new Scanner(System.in);
        System.out.println("What is your full name?");
        String name = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Yor name is: " +name);
        int currentYear = 2019;
        Scanner input3 = new Scanner(System.in);
        System.out.println("write your birth year? ");
        int result = input3.nextInt();
        int birthYear = currentYear-result;
        System.out.println("you age is:" + birthYear);







    }
}
