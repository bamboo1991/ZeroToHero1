package HomeWork_ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 11, 9, 7};
        Arrays.sort(nums);
        int[] reversed = new int[nums.length];

        for (int i = 0, k = nums.length - 1; i < nums.length; i++, k--) {
            reversed[k]=nums[i];
        }
        System.out.println(Arrays.toString(reversed));


        }
    }
