package InterviewQuestions_project_day;

public class Task3 {
    public static void main(String[] args) {
        int [] numbers ={9,2,3,6,5,1,8,4};
int formula = 9*10/2;
         int sumOfExistingNumber = 0;
        for (int i =0; i<numbers.length; i++){
            sumOfExistingNumber+=numbers[i];

        }int missingNumber = formula-sumOfExistingNumber;
        System.out.println(missingNumber);
    }
}
