package ARRAY_NEW_Topic;

import java.util.Arrays;

public class FIND_VALUE_OF_5 {
    public static void main(String[] args) {
        int [] numbers = {1,2,4,5,6,7,8,89,9,999,0,3};
        Arrays.sort(numbers);
        int valueThatIsEqualTo = 9;
        for(int i=0; i<numbers.length; i++){
            for(int k=i+1; k<numbers.length; k++){
            if(numbers[i]+numbers[k]==9){
                System.out.println(numbers[i]+ " and " +numbers[k]);

                }
            }


        }

     }
}
