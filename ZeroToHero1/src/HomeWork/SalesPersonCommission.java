package HomeWork;

import java.util.Scanner;


    public class SalesPersonCommission {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 1");
            double dayOneSales = input.nextDouble();
            Scanner input2 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 2");
            dayOneSales+= input.nextDouble();
            Scanner input3 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 3");
            dayOneSales+= input.nextDouble();
            Scanner input4 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 4");
            dayOneSales+= input.nextDouble();
            Scanner input5 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 5");
            dayOneSales+= input.nextDouble();
            Scanner input6 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 6");
            dayOneSales+= input.nextDouble();
            Scanner input7 = new Scanner(System.in);
            System.out.println("Please enter your sales amount for day 7");
            dayOneSales+= input.nextDouble();
            System.out.println("total sales for the week was: $" +dayOneSales);
            Scanner commisionRate = new Scanner(System.in);
            System.out.println("Please enter your commision rate for sales Person");
            double percentage = commisionRate.nextDouble();
            double commission = percentage*dayOneSales/100;
            System.out.println("total commission was : $" +commission);
        }

    }

