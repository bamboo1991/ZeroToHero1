package FOR_LOOP;

import java.util.Scanner;

public class NESTED_LOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("i is "+i);
            for (int k =1; k<3;k++){
                System.out.println("k is "+k);
            }
        }
    }
}
