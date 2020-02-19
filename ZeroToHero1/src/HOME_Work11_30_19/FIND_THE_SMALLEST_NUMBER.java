package HOME_Work11_30_19;

import java.util.Scanner;

public class FIND_THE_SMALLEST_NUMBER {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("please enter your numbers");
        int numbers = input.nextInt();
        System.out.println("start entering numbers");
        int firstNumber = input.nextInt();
        int num=input.nextInt();
        while (num<numbers){

            int secondNumber = input.nextInt();
            if (firstNumber>secondNumber){
                firstNumber=secondNumber;
            }
            num++;
        }
        System.out.println("this is smallest number "+ firstNumber);
    }}
/*Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int number = input.nextInt();
        System.out.println("start Entering numbers");
        int firstNumber = input.nextInt();

        int num = 1;
        while (num<number){
            System.out.println("Enter"+(num+1)+".value");
            int secondNumber = input.nextInt();
            if (firstNumber>secondNumber){
                firstNumber=secondNumber;
            }
            num++;
        }
        System.out.println(firstNumber);
*/

