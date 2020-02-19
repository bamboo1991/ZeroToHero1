package ARRAY_NEW_Topic;

import java.util.Arrays;
import java.util.Scanner;

public class STORE_NUMBERS {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.println("enter 7 different numbers");
        int[] numbers = new int[] {1,2,3,5,11,9,7};
        int[] number2 = new int[numbers.length];
        for (int i = 0; i <numbers.length; i++) {
            number2[i]=numbers[i];
           // numbers[i] = input.nextInt();
            if (numbers[i]>0) {
                numbers[i]+=3;
numbers[0]=3;
//numbers[i]=number2[i];
            }

        }
        System.out.println("this is my value "+ Arrays.toString(numbers));
        System.out.println(Arrays.toString(number2));
    }}
