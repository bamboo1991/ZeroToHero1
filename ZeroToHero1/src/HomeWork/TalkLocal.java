package HomeWork;

import java.util.Scanner;

public class TalkLocal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please make a deposit in order to make phone calls");
        int depositAmount = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Price for international calls?");
        double callPrice = input2.nextDouble();
        double maxAmountOfCalls = depositAmount/callPrice;
        System.out.println("Maximum amount of international calls " + maxAmountOfCalls);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Price for local calls?");
        callPrice = input3.nextDouble();
        double maxAmountOfCall = depositAmount/callPrice;
        System.out.println("Maximum amount of local calls " + maxAmountOfCall);
        System.out.println("Max number of call according to our deposit " +maxAmountOfCall);



    }
}
