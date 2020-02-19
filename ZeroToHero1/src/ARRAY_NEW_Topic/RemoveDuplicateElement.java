package ARRAY_NEW_Topic;

import java.util.Arrays;
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int [] numbers = {1,2,2,2,2,2,2,2,4,4,5,6,7,8,9,0};
        int [] newNumbers = new int [numbers.length];
        int number=numbers[0];
        newNumbers[0]=number;
        for(int i =0; i<numbers.length; i++){
            if(number!=numbers[i]){
                        newNumbers[i]=numbers[i];
                    }
                    number=numbers[i];
                }
        System.out.println(Arrays.toString(newNumbers));
            }

        }
