package Variables;

public class DataTypes{
    public static void main(String [] args){
        int StudentNumber = 14;
        System.out.println(StudentNumber);
        /*
        appleFreshMarket=1;
        appleFreshMarket=2;
        appleFromWallmar=3;
         */
        // total apple form markets
        int appleFromWholeFoods =40;
        int appleFreshMarket =15;
        int appleFromWallmart = 18;
        // payments to market or cost of apples
        int paymentsFreshmarket = appleFreshMarket * 2;
        int paymentsFromWholeFoods = appleFromWallmart * 2;
        int paymentsFromWallmart = appleFromWholeFoods * 3;
        // total price for  all apples
        int totalpayments = paymentsFreshmarket+paymentsFromWallmart+paymentsFromWholeFoods;
        System.out.println("this is my total price " + totalpayments);
        int sumOfApple = appleFreshMarket + appleFromWholeFoods + appleFromWallmart;
        System.out.println("this is sum of apple " + sumOfApple);

    }
        }