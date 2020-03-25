package InterviewQuestions_project_day;

import java.util.Scanner;

public class ProductNumber {
    public static void productNumber(int num){
        int prodNum = 1;
        int sum =0;
        while (num>0){
            int digit = num%10;
            num/=10;
            prodNum*=digit;
            sum+=digit;
        }
        int totalSum = prodNum-sum;
        System.out.println(totalSum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        productNumber(number);
    }

















}
/*
public void ProductNumber(int num ){
        int productNum =1;
        int sum = 0;
        while (num>0){
            int digit = num%10;
            num/=10;
            productNum*=digit;
            sum+=digit;
        }
        int totalSum = productNum-sum;
        System.out.println(totalSum);
 */