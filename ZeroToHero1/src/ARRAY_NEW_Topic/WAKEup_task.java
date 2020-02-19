package ARRAY_NEW_Topic;

import java.util.Arrays;

public class WAKEup_task {
    public static void main(String[] args) {
        int [] numbers = {22,33,10,15,12,44,22,55};
       int count =0;
       int sum = 0;
        for (int i =0; i<numbers.length; i++){
            if (numbers[i]>10&&numbers[i]<30){
                System.out.println(numbers[i]);
                count++;
            }
        }
        System.out.println(count);
for (int nums : numbers){
    sum+=nums;
    System.out.println("for each loop " +nums);
    System.out.println("sum of "+ sum);
}

    }
}
