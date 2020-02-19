package FOR_LOOP;

import java.util.Scanner;

public class ReversedValue {
    public static void main(String[] args) {
        String value = "Ariet Stamov";
        String empty = "";
        for (int i = value.length()-1; i >=0; i--) {
            empty += value.charAt(i);
            System.out.println(empty);}


    }
    }