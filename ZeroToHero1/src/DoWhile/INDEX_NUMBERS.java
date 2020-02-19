package DoWhile;

import java.util.Scanner;

public class INDEX_NUMBERS {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("please enter your name ");
        String name = input.nextLine();
        int indexNumber = name.length()-1;
        do {
            System.out.println(indexNumber);
            indexNumber--;
        }while(indexNumber>=0);
}


    }

