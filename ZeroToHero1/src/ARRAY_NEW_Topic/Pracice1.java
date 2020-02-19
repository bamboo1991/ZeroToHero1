package ARRAY_NEW_Topic;

import java.util.Arrays;

public class Pracice1 {

    public static void main(String[] args) {
        int [] numbers = new int[10];
        numbers [0]=12;
        numbers [1]=2;
        numbers [2]=32;
        numbers [3]=62;
        numbers [4]=12;
        numbers [5]=52;
        numbers [6]=11;
        numbers [7]=10;
        numbers [8]=13;


        numbers[4]= 5;

        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<numbers.length; i++){
        System.out.println("this is waht we have " +(i+1)+ " is "+numbers[i]);

        }
















    }
}
