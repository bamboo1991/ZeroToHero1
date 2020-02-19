package Repeating_topics;

public class Repeapt_fibonachi {
    public static void main(String[] args) {
int preNum = 0;
int nextNum = 1;
int sum = 0;
for (int i =1; i<=20; i++ ){
    if(preNum<=20){
    }
    System.out.println(preNum);
    sum=preNum+nextNum;
    preNum=nextNum;
    nextNum=sum;
}

String str ="XixHix";
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i)=='x'||str.charAt(i)=='X'){
                System.out.println("Hi");
            }else
                System.out.println(str);
        }






        ////        int startNum = 0 ;
////        int nextNumber =1;
////        int sum = 0;
////        for (int i =1; i<=50; i++){
////            if (nextNumber<=50){
////            }
////            System.out.println(startNum+" ");
////            sum=startNum+nextNumber;
////            startNum=nextNumber;
////            startNum=sum;
//        }
//        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
//        int FindValue = 5;
//        for (int i=0; i<numbers.length; i++){
//            for (int k=i+1; k<numbers.length; k++){
//                if (numbers[i]+numbers[k]==5) {
//                    System.out.println(numbers[i]+ " and "+numbers[k]);
//                }}}
String  space = "";
        String [] values = {"Apple", "delaware", "Moscov","Nina"};
       for (String newValue:values){
           for (int i=newValue.length()-1;i>=0; i--)
           space+=newValue.charAt(i);


        }System.out.println(""+space+" ");
        }




    }
