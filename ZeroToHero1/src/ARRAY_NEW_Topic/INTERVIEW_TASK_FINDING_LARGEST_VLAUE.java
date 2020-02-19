package ARRAY_NEW_Topic;

public class INTERVIEW_TASK_FINDING_LARGEST_VLAUE {
    public static void main(String[] args) {
        int [] numbers = {677,22,1,44,212,2,34,554,679};
        int largestNumber = numbers[0];
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>largestNumber){
                largestNumber=numbers[i];

            }
        }
        System.out.println(largestNumber);

    }
}
