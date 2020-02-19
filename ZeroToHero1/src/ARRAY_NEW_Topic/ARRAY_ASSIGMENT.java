package ARRAY_NEW_Topic;

import java.util.Arrays;

public class ARRAY_ASSIGMENT {
    public static void main(String[] args) {
      int [] numbers = {22,1,3,0,222,92919,21929129,4,5,6,7,8,9};
      int [] num2 = {3233,342};
      int [] num3 = {33,23};

      Arrays.sort(numbers);
      int [] reversed = new int[numbers.length];
      for (int i=0, k=numbers.length-1; i<numbers.length; i++, k--){
          reversed[k] = numbers[i];

      }
        System.out.println("----> "+Arrays.toString(reversed));
        System.out.println(Arrays.binarySearch(numbers,100));

}}
