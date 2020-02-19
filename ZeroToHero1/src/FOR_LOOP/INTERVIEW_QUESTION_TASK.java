package FOR_LOOP;

import java.util.Scanner;

public class INTERVIEW_QUESTION_TASK {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Product Number");
        int productNumber = input.nextInt();
        int product = 1;
        int sum = 0;
        while (productNumber>0){
            int digits = productNumber%10;
            productNumber/=10;
            product*=digits;
            sum+=digits;
        }
int totalResult = product-sum;
        System.out.println("this is ypur total number "+ totalResult);
    }
}

