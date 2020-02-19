package StringPractice;

import java.util.Scanner;

public class TaskStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Gender, name and DOB with following Structure");
        String YourInfo = input.nextLine();
        System.out.println(YourInfo.startsWith("m"));
        System.out.println(YourInfo.contains("Ariet"));
        System.out.println(YourInfo.substring(YourInfo.length()-4));
        System.out.println(YourInfo.endsWith("1991"));


    }
}
