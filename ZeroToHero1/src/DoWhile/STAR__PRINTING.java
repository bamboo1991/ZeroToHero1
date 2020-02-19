package DoWhile;

import java.util.Scanner;

public class STAR__PRINTING {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("number");
        int number = input.nextInt();
        String star = "*";
        do {
            System.out.println(star);
            star+="*";
            number--;
        }while (number>0);
    }



    }

