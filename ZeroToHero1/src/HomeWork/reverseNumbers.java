package HomeWork;


import java.util.Scanner;

public class reverseNumbers {
    public static void main(String[] args) {
        System.err.println("please enter five digit numbers from 1 to 10");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int two, three, four, five;
        int fifthValue, fourthValue, thirdValue, secondValue, firstValue;

        five= numbers%10;
        fourthValue=numbers/10;
        four =fourthValue%10;
        thirdValue=fourthValue/10;
        three=thirdValue%10;
        secondValue=thirdValue/10;
        two=secondValue%10;
        firstValue=secondValue/10;
        System.out.println("your input numbers "+numbers+" need to reverse them");
        System.out.println(five);
        System.out.println(four);
        System.out.println(three);
        System.out.println(two);
        System.out.println(firstValue);
        System.err.println("sum of the input numbers are: "+ (five+four+three+two+firstValue));
        System.err.println("reversed "+five+four+three+two+firstValue);

    }}