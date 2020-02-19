package ARRAY_NEW_Topic;

import java.util.Scanner;

public class WeekDAYS {

    public static void main(String[] args) {
        int y=10;
        final int x;
        if (y<5){
            x=2*y;
        }else {
            x=3*y;
        }
        System.out.println(x);
        Scanner input = new Scanner(System.in);
        System.out.println("day number");
        int day = input.nextInt();
        String [] dayOfTheWeek = {"Mon","Tues","Wend","Thur", "Fri","Sat", "Sun"};
        System.out.println(dayOfTheWeek[day-1]);
            }
        }

