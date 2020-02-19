package ACCESSMODIFIERS;
public class SATURDAY_TASK {
    public static boolean isPalindrome(String word){
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        if(word.equals(reversed)){
            return true;
        }
        return false;
    }
    public static boolean isNumberPalindrome(int num){
        String word=""+num;
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        if(word.equals(reversed)){
            return true;
        }
        return false;
    }
    public static boolean isNumberPalindrome1(int num){
        int original=num; // 91098
        int reversedNum=0;
        while( num>0){
            int digit=num%10;
            num=num/10;
            reversedNum=reversedNum*10+digit;
        }
        if(reversedNum==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="radar"; // RadaR
        System.out.println(isPalindrome(str));
        System.out.println(isNumberPalindrome(9101));
        System.out.println(isNumberPalindrome1(91019));
    }
}





