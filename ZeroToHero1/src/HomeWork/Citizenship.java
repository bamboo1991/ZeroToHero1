package HomeWork;

import java.util.Scanner;

public class Citizenship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your Age");
        int ageInfo = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("where do you live?");
        String residence = input2.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.println("what is your average score?");
        double averageScore = input.nextDouble();
        Scanner input4 = new Scanner(System.in);
        System.out.println("what is your citizenship?");
        String citizenship = input4.nextLine();
        ageInfo =14; averageScore=75;residence = "Schaumburg";citizenship = "US citizen";
       boolean accepted = ageInfo>=14&&residence.equalsIgnoreCase("Schaumburg")&&averageScore>=75&&citizenship.equalsIgnoreCase("US citizen");
        System.out.println(accepted);
       if(accepted) {
           System.out.println("you can enroll to this school");
       }else{
           System.out.println("you cannot enroll");



      

    }}}
