package HomeWork112819;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter word");
        String text =input.next();
        int count=0;
        char replaceChar='a';
        String result=text;
        do {
             result=result.replace(text.charAt(count),replaceChar);
            count++;
            System.out.println(result);
        }while(count<=text.length()-1);




    }
}
/*
while(value.length()<20){
            value+="x";
        }
        System.out.println(value);
        do{
            value+="x";

        }while(value.length()<20);
        System.out.println(value);
 */