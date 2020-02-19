package DoWhile;

import java.util.Scanner;

public class MultiplicationTbale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number");
        int number = input.nextInt();
        int multiple = 1;
       ;
        do{
            int result = number*multiple;
            System.out.println(number+"x"+multiple+"="+result);
            multiple++;
        }while(multiple<=10);


    }
}
