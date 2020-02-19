package DoWhile;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("any value");
        String value = input.next();
        System.out.println("any value");
        value = input.next();
        while(value.length()<20){
            value+="x";
        }
        System.out.println(value);
        do{
            value+="x";

        }while(value.length()<20);
        System.out.println(value);
    }

    }
