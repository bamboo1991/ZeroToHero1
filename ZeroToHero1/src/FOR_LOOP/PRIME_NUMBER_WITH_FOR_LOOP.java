package FOR_LOOP;

import java.util.Scanner;

public class PRIME_NUMBER_WITH_FOR_LOOP {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
        int result =0;
        for (int i=number1;i<=number2;i++){
            for (int k=2;k<i;k++){
                if(i%k==0){
                    result+=k;
                    System.out.println("dvsvsdvsdb "+ k);
                }
                if(result==0){
                    System.out.println("i is prime number "+i);
            }

            }
        }
    }
}
