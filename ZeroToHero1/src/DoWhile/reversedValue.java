package DoWhile;

import java.util.Scanner;

public class reversedValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter any value");
        String value = input.nextLine();
        char firstLetter = value.charAt(0);
        String reversed = "";
        int lengthOfValue = value.length()-1;/// total length
        do{
            reversed+=firstLetter;

            lengthOfValue--;

        }while (lengthOfValue<=0);
        System.out.println((reversed));



        /*Scanner input =new Scanner(System.in);
        System.out.println("please enter any value");
        String value = input.nextLine();
        String reversed = "a";
        int length = value.length() - 1;
        while (length >= 0) {
        reversed += value.charAt(length);
            length--;
            System.out.println(reversed);
        }*/

    }
}
