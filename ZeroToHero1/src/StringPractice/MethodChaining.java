package StringPractice;

import java.util.Scanner;

public class MethodChaining {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two inputs");
        String string = input.nextLine();
        String string1 = input.nextLine();
        string=string.replace("%", "").replace(" of ","-");
        System.out.println(string.equals(string1));


    }
}
