package FOR_LOOP;

import java.util.Scanner;

public class Replace_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("your value");
        String value = input.nextLine();
        String letter = "a";
        int length = value.length();
        for (int i =0; i<value.length(); i++){
            value=value.replace(value.charAt(i),'a');
            System.out.println(value);
    }

    }}