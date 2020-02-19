package ARRAY_NEW_Topic;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch_practice {
    public static void main(String[] args) {
        System.out.println(" this is binary Search");
        int[] numbers = {0, 2, 3, 4, 5, 6, 7, 7, 234556, 5, 45, 7457, 8, 68, 5, 867, 867, 9};
     for (int i=0; i<numbers.length; i++){
         Arrays.sort(numbers);
     }
        System.out.println(Arrays.binarySearch(numbers,100000));

    }}