package ConditionStatements;

import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 4 numbers one at the time:");
        int numbers1 = input.nextInt();//
        int numbers2 = input.nextInt();
        int numbers3 = input.nextInt();
        int numbers4 = input.nextInt();
        if (numbers1 > numbers2) {
            int temp = numbers1;
            numbers1 = numbers2;
             numbers2=temp;

        }
        if (numbers1 > numbers3) {
            int temp = numbers1;
            numbers1 = numbers3;
            numbers3 = temp;

        }
        if (numbers1 > numbers4) {
            int temp = numbers1;
            numbers1 = numbers4;
            numbers4 = temp;

        }else if(numbers2>numbers3) {
            int temp = numbers2;
            numbers2 = numbers3;
            numbers3 = temp;

        }
         if (numbers2>numbers4) {
             int temp = numbers2;
             numbers2 = numbers4;
             numbers4 = temp;

         }else if(numbers3>numbers4){
             int temp = numbers3;
             numbers3=numbers4;
             numbers4=temp;

    }
        System.out.println(numbers4+"\n"+numbers3+"\n"+numbers2+"\n"+numbers1);
    }
}