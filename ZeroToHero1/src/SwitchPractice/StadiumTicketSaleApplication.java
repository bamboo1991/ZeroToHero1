package SwitchPractice;

import java.util.Scanner;

public class StadiumTicketSaleApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Class name");
        String ClassName = input.nextLine();
        switch (ClassName){
            case "Class C":
                System.out.println("Please enter the price range between $50-70 ");
                int enteredPrice = input.nextInt();
                if (enteredPrice>=50&&enteredPrice<=70){
                    System.out.println("Your place at the Colum D Row 19 ");
                    break;
                }
                case "Class B":

             System.out.println("Enter Price between $70 and 90");
             enteredPrice = input.nextInt();
             if (enteredPrice>=70&&enteredPrice<=90){
                 System.out.println("Your place is at the Column K Row 10");
                 break;
             }
         case "Class A":

             System.out.println("enter Price between $90 and $110");
             enteredPrice=input.nextInt();
             if (enteredPrice>=90&&enteredPrice<=110){
                 System.out.println("Your place is at the Column P Row 5");
                 break;
             }
         case "class A":
             System.out.println("Enter the Price");
             enteredPrice=input.nextInt();
             if (enteredPrice<90) {
                 System.out.println("Please enter rest of the amount");
                 if (enteredPrice > 83) {
                     enteredPrice = input.nextInt();
                     System.out.println("Session is completed please return beginning");
                     if (enteredPrice==83){
                         enteredPrice = input.nextInt();
                         break;
                     }
                 }
             }
         default:
             System.out.println("this is not available class type.");
     }

    }




}
