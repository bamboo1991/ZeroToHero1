package StringPractice;

import java.util.Scanner;

public class StringMethod {
    public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country");
        String countryThatYouPut = input.next();
        int result = countryThatYouPut.length();
        System.out.println("your first char will be " + countryThatYouPut.charAt(0));
        System.out.println("middle char " + countryThatYouPut.charAt((result-1)/2));
        String cityOfChicago = " I am leaving in Chicago";
        cityOfChicago=cityOfChicago.toUpperCase();
        System.out.println(cityOfChicago);
        cityOfChicago=cityOfChicago.toLowerCase();
        System.out.println(cityOfChicago);















































    }}




