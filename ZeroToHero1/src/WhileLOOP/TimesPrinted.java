package WhileLOOP;


import java.util.Scanner;

/// THIS IS OUR HOME WORK FOR NEXT TUESDAY
public class TimesPrinted {
    public static void main(String[] args) {
        Scanner input4 = new Scanner(System.in);
        System.out.println("Please enter starting number");
        int startingNumber = input4.nextInt();
        System.out.println("please enter your ending number");
        int endingNumber = input4.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while (startingNumber <= endingNumber) {
            boolean evenNumber = startingNumber % 2 == 0;
            if (evenNumber) {
                sumOfOdd += startingNumber;
                System.out.println(startingNumber + " even number");
            }else{
                System.out.println(startingNumber+ " odd number");
            }

            if (startingNumber % 1 == 1) {
                System.out.println(startingNumber + " prime");
                sumOfEven += startingNumber;
            }
            startingNumber++;
        }

        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

        Scanner price = new Scanner(System.in);
        System.out.println("your price");
        int priceYouHave = price.nextInt();
        int computerPrice = 800;
        while (priceYouHave<800) {
            priceYouHave++;
            System.out.println("DSFDSFD");
        }


        // can you buy new laptop? you only have $500
        Scanner input5 = new Scanner(System.in);
        System.out.println("what is your budget?");
        int enteredAmount = input5.nextInt();
        int laptopPrice = 800;
        while (enteredAmount < 800) {
           int requiredAmount = laptopPrice - enteredAmount;
            System.out.println("Please keep adding " + requiredAmount);
            requiredAmount = laptopPrice - enteredAmount;
           requiredAmount = input5.nextInt();
            enteredAmount=enteredAmount + requiredAmount;
            if (enteredAmount > laptopPrice) {
            }
            System.out.println("you can buy it");
        }


        int myAge = 25;
        while (myAge<30) {
            myAge++;
            System.out.println("around the world " + myAge);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        int numbers = input.nextInt();
        int zero = 0;
        while (numbers > 0) {
            int remainder = numbers % 10;
            numbers /= 10;
            System.out.println(remainder);
        }

/// train usage with deposit Amount
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please make a deposit");
        int depositAmount = input1.nextInt();
        int costForTrain = 2;
        int totalUsage = 0;
        while (depositAmount > 0) {
            totalUsage++;
            depositAmount -= costForTrain;
        }
        System.out.println("this is total rides u can get " + totalUsage);
// Print your name in reverse
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter your name");
        String fullName = input2.nextLine();
        int indexNumber = fullName.length() - 1;
        while (indexNumber >= 0) {
            System.out.println(fullName.charAt(indexNumber));
            indexNumber--;
        }
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter any value");
        String value = input3.nextLine();
        System.out.println("please enter any number");
        int number = input3.nextInt();
        while (number > 0) {
            System.out.println(value);
            number--;
        }

// start number and end number plus find sum of even and sum of odd number.







}
}