package FOR_LOOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Month_2019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("please enter your year");
    int yearNumber = input.nextInt();
for (int year = yearNumber; year<=2023; year++){
        System.out.println ("this is your "+year);
        for(int month=1; month<=31; month++){
            System.out.println("this is your "+month);
            for(int day=1; day<=31;day++){
                System.out.print(day+",");

            }
            System.out.println();
            }

        }



    }
}
