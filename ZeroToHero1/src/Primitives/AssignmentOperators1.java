package Primitives;

import java.sql.SQLOutput;

public class AssignmentOperators1 {
    public static void main(String [] args){
      int truckMillage = 1000;
        System.out.println("beginning millage "+ truckMillage);
      //after driving 2 hours
        truckMillage=truckMillage+100;
        System.out.println("after 2 hours of driving "+ truckMillage);
        //anotherHour Plus 123;
      truckMillage=truckMillage+150;
        System.out.println("after one more hour of driving "+ truckMillage);
      //after two more hours of driving + 157
        truckMillage+=157;
        System.out.println("+ two more hours "+ truckMillage);
        // tickets at 12pm
        int flightTicket = 200;
        System.out.println("flight ticket cost $"+flightTicket);
        // at 2pm
         flightTicket = 300;
         System.out.println("flight ticket cost $"+flightTicket);
        // flightTicket at 4pm
        flightTicket=flightTicket+50;
        System.out.println("flight ticket cost at 4pm $"+flightTicket);
   // flight ticket at 6pm
        flightTicket+=50;
        System.out.println("flight ticket cost at 6pm $"+flightTicket);
        /*flightTicket-=150;*/ flightTicket = flightTicket-150;
        System.out.println("flight ticket cost $"+flightTicket);
        int bookPrice= 5;
        bookPrice*=5;//bookPrice=bookPrice*5; =25;
        //  bookPrice is 25;
        short numberA = 10;
        int numberB = 9;
        int results = numberA+numberB;
        byte n=1;
        short b=3;
        int   result=n+b;
        byte numberC =10;
        short numberD= 6;
        int result1s = numberC+numberD;
        int number1= 1;
        double number32=3;
        double result$ = number1+number32;





    }
}
