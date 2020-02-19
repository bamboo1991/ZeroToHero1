package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class RepeatDiceGame {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("did you play mega Million? Y/N");
        String answer = input.next();

        int sumOfLottoNumbers;
        int count = 0;
        if (answer.equalsIgnoreCase("y")) {

        do {
            Thread.sleep(1000);
            System.out.println("what number is your winning number? ");
            int winningNumber1 = input.nextInt();
            System.out.println("next lucky number?");
            int winningNumber2 = input.nextInt();
            System.out.println("next lucky number?");
            int winningNumber3 = input.nextInt();
            System.out.println("next lucky number?");
            int winningNumber4 = input.nextInt();
            System.out.println("next lucky number?");
            int winningNumber5 = input.nextInt();

            int lottoNumber1 = randomNumber.nextInt(100);
            int lottoNumber2 = randomNumber.nextInt(100);
            int lottoNumber3 = randomNumber.nextInt(100);
            int lottoNumber4 = randomNumber.nextInt(100);
            int lottoNumber5 = randomNumber.nextInt(100);
            if (lottoNumber1 == 0) {
                lottoNumber1--;
            }
            if (lottoNumber2 ==0) {
                lottoNumber2--;
            }
            if (lottoNumber3 ==0) {
                lottoNumber3--;
            }
            if (lottoNumber4 ==0) {
                lottoNumber4--;
            }
            if (lottoNumber5 ==0) {
                lottoNumber5--;
            }

            System.out.println("winning numbers are: " + lottoNumber1 + " " + lottoNumber2 + " " + lottoNumber3 + " " + lottoNumber4 + " " + lottoNumber5);
            sumOfLottoNumbers=lottoNumber1+lottoNumber2+lottoNumber3+lottoNumber4+lottoNumber5;
           int sumOfWinningNumbers=winningNumber1+winningNumber2+winningNumber3+winningNumber4+winningNumber5;
            System.out.println("You did not win "+sumOfWinningNumbers+ " it is not winning numbers sum" );
            count++;

        }while(sumOfLottoNumbers==199);
        System.out.println("you did not win "+sumOfLottoNumbers+ "");
        }else{
            System.out.println("you did not try your luck");

    }
}}