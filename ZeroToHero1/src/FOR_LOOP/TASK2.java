package FOR_LOOP;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any value");
        String value = input.nextLine();

        for (int i=0; i<value.length();i++){
            if(value.charAt(i)=='a'|| value.charAt(i)=='A'){
                System.out.println("THE CHAR IS: "+value.charAt(i));
                System.out.println("the index number is: "+i);
            }
        }
    }
}
