package FOR_LOOP;

import java.util.Scanner;

public class CONTINUE_STATEMENT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("your value");
        String value = input.nextLine();

       for (int i =0; i <value.length(); i++) {
           if (value.charAt(i)=='e'||value.charAt(i)=='k'){
               continue;
           }
           System.out.println(value.charAt(i));



       }



        }
    }
