package DoWhile;

import java.util.Scanner;

public class Divide7and2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number1");
        int number1 = input.nextInt();
        System.out.println("number2");
        int number2 = input.nextInt();
        int count = 0;

        do {
            if (number1%2==0&&number1%7==0) {



            } else {
                number1 += 14;
                System.out.println(number1 + " all these numbers divided by 2 and 7");
                number1++;
            }

            count++;
        }while(number1<number2);
        System.out.println(count);



    }
}
