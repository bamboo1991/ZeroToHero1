package ARRAY_NEW_Topic;

import java.util.Arrays;

public class How_to_Find_missing_Formula {
    public static void main(String[] args) {
        int [] numbers = {1,4,2,7,5,6,9,8};
        int formula = 9*10/2;
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum+=numbers[i];

        }int missing = formula-sum;
        System.out.println("missing number "+missing);
    }
}
