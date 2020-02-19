package DoWhile;

import java.util.Scanner;

public class InterviewQuestions {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("please enter the value ");
        String value = input.nextLine();
        System.out.println("please enter any char");
        char chare = input.nextLine().charAt(0);
        int length=value.length()-1;
        int count =0;
        while(length>=0){
            if(value.charAt(length)==chare){
                count++;
            }
            length--;
        }
        System.out.println(count);

    }
}
