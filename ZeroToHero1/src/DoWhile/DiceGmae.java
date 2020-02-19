package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class DiceGmae {
    public static void main(String[] args) throws Exception {
       Scanner input =new Scanner(System.in);
       Random random=new Random();
        System.out.println("do you want to play a game? Y/N");
        String answer = input.next();
        int count=0;
        int sum = 0;

        if(answer.equalsIgnoreCase("Y")){
        do{
            System.out.println("your dice is rolling...");
            Thread.sleep(1000);
            int dice1 = random.nextInt(7);
            int dice2 = random.nextInt(7);
            if(dice1==0){
                dice1++;
            }
            if(dice2==0) {
                dice2++;
            }
            System.out.println("dice 1 "+dice1);
            System.out.println("dice 2 "+dice2);
            sum=dice1+dice2;
            System.out.println("your sum is "+sum);
            count++;
        }while (sum!=2);
            System.out.println(count);
        }else{
            System.out.println("have a great day");


        }


    }
}
