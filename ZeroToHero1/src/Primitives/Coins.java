package Primitives;

public class Coins {
    public static void main(String [] args){
        /*Given value from 1 to 99
        calculate: how many quaters, dims, nickel and pennies.
        */
        int value= 98;
        int quaters=value/25;//3
        int quaterRemainder= value % 25;//23
        int dimes=quaterRemainder/10; //2 dimes
        int dimesRemainder=quaterRemainder%10; //23%10=3
        int nickels= dimesRemainder /5; //0
        int nickelsRemainder=dimesRemainder % 5; //3
        int pennies=nickelsRemainder / 1; //3
        int penniesRemainder=nickelsRemainder%1;

        System.out.println("Tottal value is " +value);
        System.out.println("Quater is "+ quaters);
        System.out.println("Dimes is "+ dimes);
        System.out.println("Nickels is "+nickels);
        System.out.println("Pennies is " +pennies);
    }
}

    
