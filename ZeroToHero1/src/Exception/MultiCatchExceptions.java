package Exception;

import Mentoring.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiCatchExceptions {
    public static void main(String[] args) {

        String number = "";
        try {
            int num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
        } finally {
            Scanner intput = new Scanner(System.in);
            System.out.println("please enter your name");
            String name = intput.next();
            System.out.println(name.length());
        }

    }}



