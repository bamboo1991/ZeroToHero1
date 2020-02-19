package SwitchPractice;

import java.util.Scanner;

public class ChicagoNewYorkorLosAngeles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter city name");
        String cityNames = input.nextLine();
        switch (cityNames){
            case "Chicago":
                System.out.println("How much you spend in this city?");
                int totalAmount = input.nextInt();
                double amountIncludingTax = totalAmount*5/100;
                if (totalAmount>=1000){
                    System.out.println("total amount will be $"+(amountIncludingTax+totalAmount)+ " that includes % 5 tax");
                }
                if(totalAmount<1000){
                    amountIncludingTax = totalAmount*10/100;
                    System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 10 tax");
                break;
                }
            case "New York":
                System.out.println("How much you spend in New York city?");
                totalAmount = input.nextInt();
                amountIncludingTax = totalAmount*7/100;
                if (totalAmount>=2000){
                    System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 7 tax");
                }
                    if (totalAmount<=1000&&totalAmount>=500){
                    amountIncludingTax = totalAmount*9/100;
                    System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 9 tax");
                }
                        if (totalAmount<500){
                            amountIncludingTax = totalAmount*11/100;
                            System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 11 tax");
                        }
            case " ":
                System.out.println("How much you spend in LA?");
                totalAmount = input.nextInt();
                amountIncludingTax = totalAmount*4/100;
                if (totalAmount>=15000){
                    System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 4 tax");
                }
                    if (totalAmount<15000&&totalAmount>=5000){
                        amountIncludingTax = totalAmount*6/100;
                        System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 6 tax");
                    }
                        if (totalAmount<=5000){
                            amountIncludingTax = totalAmount*8/100;
                            System.out.println("total amount will be $" +(amountIncludingTax+totalAmount) + " that includes % 8 tax");
                        }
        }
    }
}
