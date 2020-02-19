package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class TOO_SMALL_TOO_BIG_NUMBERS {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random randomGenerated = new Random();
       int randomNumbers = randomGenerated.nextInt(101);
       int count = 0;
       int guess;
       do {
           System.out.println("guess you number");
           guess=input.nextInt();
           if(guess<randomNumbers){

               System.out.println("it is too small");
           }else {
               System.out.println("it is too big");
           }
          count++;
       }while (guess!=randomNumbers);
        System.out.println("u got it");
        System.out.println(count);





    }}
