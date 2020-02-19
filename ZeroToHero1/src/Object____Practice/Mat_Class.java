package Object____Practice;

public class Mat_Class {
    public int sum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public int sum1 (int [] nums){
        int sum=0;
        for (int i=0; i<nums.length;i++ ){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Mat_Class mat = new Mat_Class();
        int sum = mat.sum(12, 12,20);
        int numbers[]={12,3,4,5,6,6,7,8,88};
        System.out.println(sum);
        System.out.println(mat.sum1(numbers));
    }
}