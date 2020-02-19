package DoWhile;

import java.util.Scanner;

public class SPEED_COUNT {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("enter your current Speed");
        int currentSpeed = input.nextInt();
        System.out.println("enter your target Speed ");
        int targetSpeed = input.nextInt();
        int onesecond = 0;
        do {
            System.out.println("my current Speed "+currentSpeed);
            currentSpeed+=10;
            onesecond++;

        }while (currentSpeed<=targetSpeed);
        System.out.println("this is total amount of time: "+onesecond);

    }
}