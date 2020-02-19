package FOR_LOOP;

import java.util.Scanner;

public class Break_Statement {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter your value");
        String value = input.nextLine();
        int length = value.length() ;
        for (int i = 0; i<=length; i++ ){
            for (char letter = 'A'; letter<='Z'; letter++){
               // if (value.charAt(i)==letter){
                   // System.out.println(value.charAt(i));
                }
            System.out.println(value.charAt(i));
            }

            }
        }



