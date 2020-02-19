package HOMEWORK_FOR_ARRAY;

import java.util.Arrays;

public class UniqueValue {

    public static void main(String[] args) {
        int[] numbers = {22, 33, 44, 44, 22, 33, 35};
        String uniqueChar = "";
        for (int j = 0; j < numbers.length; j++) {
            for (int k = j; k < numbers.length; k++) {
                if (numbers[j] != numbers[k]) {
                    System.out.println(numbers[k]);
                    break;
                }



            }


        }
        System.out.println(uniqueChar);

    }

}