package FOR_LOOP;

import java.util.Scanner;

public class FIND_LARGETS_VALUE {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.println("please enter any number");
      int number = input.nextInt();
        System.out.println("start entering the numbers");
        int firstNum = input.nextInt();
        for (int i =0; i<number-1;i++) {
            int second = input.nextInt();
            if (firstNum > second) {
                firstNum = second;
            }
        }
        System.out.println("your biggest number "+firstNum);
    }
}
