package HomeWork;

import java.util.Scanner;

public class FahrenheitTask {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("please enter your temperature in Farenheit");
        int tempInFareiheit = input.nextInt();
        int celisius = (tempInFareiheit-32)*5/9;
        System.out.println(celisius);
    }
}
