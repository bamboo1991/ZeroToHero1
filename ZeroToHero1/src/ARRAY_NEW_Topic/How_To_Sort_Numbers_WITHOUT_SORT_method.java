package ARRAY_NEW_Topic;

import java.util.Arrays;
import java.util.Scanner;

public class How_To_Sort_Numbers_WITHOUT_SORT_method {
    public static void main(String[] args) {
        //How to sort numbers without sorting?
        int [] numbers = {1,3,5,2,7,4,8,9,0};
        for (int i=0; i<numbers.length; i++){
            int temp=numbers[i];
                for (int k=i+1; k<numbers.length; k++){
                if (numbers[i]>numbers[k]){
                    temp=numbers[i];
                    numbers[i]=numbers[k];
                    numbers[k]=temp;

                }
            }
        }
        System.out.println("------------> "+Arrays.toString(numbers));
}}