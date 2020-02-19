package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(2);
        String answer;

        do {
            String flipped = random==0? "Heads": "Tails";
            System.out.println("coin is flipping now...");
            System.out.println("please tell me your guess? is it Heads/Tails?");
            String guess = input.next();
            if (guess.equalsIgnoreCase(flipped)){
                System.out.println("you are lucky today, you win the game");
            }else{
                System.out.println("you are such a looser");
            }
            System.out.println("do you want to continue playing? YES/NO");
            answer = input.next();
            }while (answer.equalsIgnoreCase("YES"));
        System.out.println("it was nice playing with you");
        }






        }
