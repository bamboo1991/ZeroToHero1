package InterviewQuestions_project_day;

public class Task10 {
    public boolean palindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
            int oneDigit=num%10;
            num=num/10;
            reverse=reverse*10+oneDigit;
        }
        if(reverse==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Task10 task9=new Task10();
        System.out.println(task9.palindrome(101));
    }

}
