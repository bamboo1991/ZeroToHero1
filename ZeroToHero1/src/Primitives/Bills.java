package Primitives;

import java.util.Scanner;

public class Bills {
    public static void main(String [] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter any three digit amount");
        int amount = input.nextInt();
        int _100Bills = amount/100;
        int _100Remainders = amount%100;
        int fifty$ = _100Remainders/50;
        int fiftyRemainders = _100Remainders%50;
        int twenty$ = fiftyRemainders/20;
        int twentyRemainder = fiftyRemainders%20;
        int ten$ = twentyRemainder/10;
        int tenReaminder = twentyRemainder%10;
        int five$ = tenReaminder/5;
        int fiveRemainder = tenReaminder%5;
        int one$ = fiveRemainder/1;
        System.out.println(amount);
        System.out.println(_100Bills);
        System.out.println(fifty$);
        System.out.println(ten$);
        System.out.println(five$);
        System.out.println(one$);
    }
//        int value = 758;
//        int HundredBills = value/100;
//        int hundredRemainders = value%100;
//        int fiftyBills = hundredRemainders/50;
//        int fityremainder = hundredRemainders%50;
//        int twentyBills = fityremainder/20;
//        int twentyremainder = fityremainder%20;
//        int tenBills = twentyremainder/10;
//        int tenremaider = twentyremainder%10;
//        int fiveBills = tenremaider/5;
//        int fiveremainder = tenremaider%5;
//        int oneDollarBill = fiveremainder/1;
//        int totalValue = value;
//
//        System.out.println("this is hundred dollar bills in " + HundredBills);
//        System.out.println("this totla number of fifty dollars " +fiftyBills);
//        System.out.println("this is total number of twenty "+ twentyBills);
//        System.out.println("this is total number of ten dollars "+ tenBills);
//        System.out.println("this is total number of five dollars "+ fiveBills);
//        System.out.println("this is total number of one dollar "+oneDollarBill);
//        System.out.println("this is base value $" +totalValue);
//    }
}
