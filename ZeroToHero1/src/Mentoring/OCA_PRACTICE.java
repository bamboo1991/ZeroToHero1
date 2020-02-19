package Mentoring;
public class OCA_PRACTICE {
    public static void main(String[] args) {
        int num = 123456789;
       int sum=0;
       int mult = 0;
       while (num>0){
           mult=mult+(num%10)*(num%10);
           sum=sum+num%10;
            num=num/10;

        }
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(mult-sum);

    }

    }




