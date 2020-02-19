package InterviewQuestions_project_day;

public class ProductNumber {
        public void ProductNumber(int num ){
        int productNum =1;
        int sum = 0;
        while (num>0){
            int digit = num%10;
            num/=10;
            productNum*=digit;
            sum+=digit;
        }int totalSum = productNum-sum;
        System.out.println(totalSum);
    }
    public static void main(String[] args) {
        new ProductNumber().ProductNumber(3454);
    }
}
