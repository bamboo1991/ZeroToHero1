package InterviewQuestions_project_day;

public class PerfectNumber {
public void perfectNum(int number){
    int divident=1;
    int sum=0;
    do {
        if (number%divident==0){
            sum+=divident;
        }
        divident++;

    }while (divident<number);
    if (sum==number){
        System.out.println("perfect Num");
    }else{


    System.out.println("not perfect");
}}
    public static void main(String[] args) {
        PerfectNumber task6 = new PerfectNumber();
        task6.perfectNum(8);
    }
}




