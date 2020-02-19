package FOR_LOOP;

import java.util.Scanner;

public class FIND_CHARS_INT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your String value");
        String stringValue = input.nextLine();
        for (char letter = 'A'; letter<='Z'; letter++ ) {
            for (int i = 0; i < stringValue.length(); i++) {
                if (stringValue.charAt(i) == letter) {
                    System.out.println(stringValue.charAt(i));
                }

            }

        }}}






