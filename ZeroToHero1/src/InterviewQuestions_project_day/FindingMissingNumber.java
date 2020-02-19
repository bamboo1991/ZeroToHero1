package InterviewQuestions_project_day;

public class FindingMissingNumber {
    public static void main(String[] args) {
    int [] numbers = {1,4,2,7,5,6,9,8};
    int formula = 9*10/2;
    int sum = 0;
    for (int i=0; i<numbers.length; i++){
        sum+=numbers[i];

    }int missing = formula-sum;
        System.out.println(missing);
    }}