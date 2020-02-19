package FOR_LOOP;

public class FIBONACII_number_interview_question {
    public static void main(String[] args) {
        int sum = 0;
        int preNumber = 0;
        int nextNumber =1;
        for(int i=1; i<=50; i++){
            if(preNumber<=50){
            }
            System.out.print(preNumber+" ");
            sum=preNumber+nextNumber;
            preNumber= nextNumber;
            nextNumber=sum;
        }
    }


}


