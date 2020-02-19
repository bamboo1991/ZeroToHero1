package InterviewQuestions_project_day;

public class FindingArmsNumber {
    public void armsNum(int num){
        int temp = num;
        int oneDigit= 0;
        int a = 0;
        while (num>0){
            oneDigit=num%10;
            num=num/10;
            a+=oneDigit*oneDigit*oneDigit;
        }
        if (temp==a){
            System.out.println("arms");
        }else
            System.out.println("no Arms");
    }
public void palindrom(String str){
        String original = str;
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }if (original.equals(reversed)){
        System.out.println("palindrom");
    }else
        System.out.println("no palindrom");
}
    public static void main(String[] args) {
        FindingArmsNumber a = new FindingArmsNumber();
        a.armsNum(153);
        a.palindrom("ArA");
    }



}