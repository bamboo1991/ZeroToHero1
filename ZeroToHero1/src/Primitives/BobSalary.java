package Primitives;

import java.sql.SQLOutput;

public class BobSalary {
    public static void main(String[] args) {
        int bobYearlySalary = 200000;
        double  fiftyPercentSalary = 50 / 100.000 * bobYearlySalary;
        double   thirtyPercentSalary = 30 / 100.000 * bobYearlySalary;
        double   twentyPercentSalary = 20 / 100.000 * bobYearlySalary;
        System.out.println("total "+ fiftyPercentSalary);
        int fivePercentBonus = 5;
        int eightPercentBonus = 8;
        int tenPercentBonus = 10;
         double   fivePercentApply = fivePercentBonus /100.000 * fiftyPercentSalary;
        double  eightPercentApplied = eightPercentBonus / 100.000 * thirtyPercentSalary;
        double   tenPercentApplied = tenPercentBonus /100.000 * twentyPercentSalary;


        System.out.println("This is an extra amount as a bonus $" + fivePercentApply);
        System.out.println("This is an axtra amount as a bonus for 30 percent salary $" + eightPercentApplied);
        System.out.println("10 percent applied for 20 percent salary $"+tenPercentApplied);
        // Now, we need total add bonus amounts to actual salary
        double  Including5Percent = fiftyPercentSalary+fivePercentApply;
        double  Including8Percent = thirtyPercentSalary+eightPercentApplied;
        double  Including10Percent = twentyPercentSalary+tenPercentApplied;
        System.out.println(" Total salary including bonus $" + Including5Percent);
        System.out.println("Total salary including bonus $" + Including8Percent);
        System.out.println("Total salary including bonus $" + Including10Percent);
        double  totalBonusAmountIs = fivePercentBonus+eightPercentApplied+tenPercentApplied;
        System.out.println("Total bonus that was applied to Bob was $" +totalBonusAmountIs);


    }
}
