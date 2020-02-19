package ARRAY_NEW_Topic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String[] cars = new String[5];
        cars[0] = "Bmw";
        cars[1] = "Toyota";
        cars[2] = "Honda";
        cars[3] = "Mercedes";
        cars[4]= "tesla";
        // cars[10]="Tesla"; -->this line will give runtime error(ArrayIndexOutOfBoundsException)
        // if element value is equals to
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase("honda")){
                System.out.println("this is "+cars[i]);
            }


        }
int nums []=new int[]{200,300, 400};
        int sum=0;
        for (int i =0; i< nums.length; i++ ){
            sum+=nums[i];
            System.out.println(sum);
        }
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(nums));

    }
}