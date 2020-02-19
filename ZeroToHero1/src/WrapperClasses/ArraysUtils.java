package WrapperClasses;

import java.util.Arrays;

public class ArraysUtils {
static String [] numbers = {"112","1","2121","21","900","0","9","65","2","676767"};
public static int[] descNum(String [] num1){
    int[] newNum = new int[num1.length];
    for (int i=0; i<num1.length; i++){
        newNum[i]=Integer.valueOf(numbers[i]);

    }
    Arrays.sort(newNum);
    int[] sortedNum = new int[newNum.length];
for (int i=0, k=sortedNum.length-1; i<num1.length; k--, i++){
    sortedNum[i]=newNum[k];

}return sortedNum;
}

    public static void main(String[] args) {
        System.out.println("------> "+Arrays.toString(descNum(numbers)));
    }
}
//    static String [] numbers = {"112","1","2121","21","900","0","9","65","2"};
//    public static int[] descNumbers(String [] number1){
//        int[] newNumber = new int[numbers.length];
//        for (int i =0; i<numbers.length; i++){
//            newNumber[i]=Integer.valueOf(numbers[i]);
//        }
//        Arrays.sort(newNumber);
//      int [] sortedNumbers = new int[newNumber.length];
//      for (int i=0, k=sortedNumbers.length-1; i<newNumber.length; i++, k--){
//          sortedNumbers[i]=newNumber[k];
//
//      }return sortedNumbers;
//    }
//    public static void main(String[] args) {
//          System.out.println(Arrays.toString(descNumbers(numbers)));
//      }
//}


























