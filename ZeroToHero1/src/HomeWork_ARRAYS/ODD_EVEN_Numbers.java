package HomeWork_ARRAYS;

import java.util.Arrays;

public class ODD_EVEN_Numbers {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 11, 9, 8, 7};
        System.out.println("this is odd number:");
        for (int i=0; i<nums.length; i++){
            if (nums[i]%2!=0){
                System.out.println(nums[i]);
            }
        }
        System.out.println("this is even numbers");
        for (int k=0; k<nums.length; k++){
            if (nums[k]%2==0){
                System.out.println(nums[k]);
            }
        }

        }

    }

