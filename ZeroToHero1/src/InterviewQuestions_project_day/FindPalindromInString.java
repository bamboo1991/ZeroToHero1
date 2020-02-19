package InterviewQuestions_project_day;

import java.util.Scanner;

public class FindPalindromInString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String");
        String str = input.next();
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equals(str)){
            System.out.println("palindrom");
        }else{
            System.out.println("no palindrom");
        }
    }
}
