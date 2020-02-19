package ARRAY_NEW_Topic;

import java.util.Arrays;

public class SortingIN_ARRAY {
    public static void main(String[] args) {

        int [] numbers ={2, 55, 3, 11, 44, 101, 34, 8};
        Arrays.sort(numbers);

        int [] smallestToLargest = new int[numbers.length];
        for(int i=0, k=numbers.length-1; i<numbers.length; i++, k--){
            smallestToLargest[i]=numbers[k];
        }
        System.out.println("--------> "+Arrays.toString(smallestToLargest));

    }

}