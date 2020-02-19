package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class EGGS_EATEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many eggs you want to put in your basket");
        int numberEggs = rand.nextInt(10);
        do {
            System.out.println("How many eggs you eat already");
            int eatenEggs = input.nextInt();
            if (eatenEggs>numberEggs) {
            }
            numberEggs-=eatenEggs;
        }while (numberEggs>=0);
        System.out.println("you ate all your eggs ");
//        //Scanner input = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("number of eggs were entered in the box...");
//        int eggs = random.nextInt(10);
//
//
//        do {
//            System.out.println("how many eggs eaten at the end of the day?");
//            int eatenEggs = input.nextInt();
//            if (eatenEggs>eggs) {
//            }
//            eggs -= eatenEggs;
//        } while (eggs>=0);
//        System.out.println("you ate all eggs");
}
}