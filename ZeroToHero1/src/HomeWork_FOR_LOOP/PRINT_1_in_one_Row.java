package HomeWork_FOR_LOOP;

import java.util.Scanner;

public class PRINT_1_in_one_Row {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("numbers ");
        int number = input.nextInt();
        String one = "";
        for (int i = 0; i<=number; i++){
            one+="1";
            System.out.println(one);
        }

}
}
