package FOR_LOOP;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any value");
        String value = input.nextLine();
        for (int i=value.length()-1;i>=0;i--){
            System.out.println(value.charAt(i));



        }

    }
}
