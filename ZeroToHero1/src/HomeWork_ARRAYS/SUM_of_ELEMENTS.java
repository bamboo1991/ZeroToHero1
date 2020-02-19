package HomeWork_ARRAYS;

public class SUM_of_ELEMENTS {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 5, 11, 9, 0};
        int sumOfElements = 0;
        System.out.println("Sum of elements");
        for(int i =0; i<nums.length; i++){
            sumOfElements+=nums[i];
        }
        System.out.println(sumOfElements);
    }
}
