package StringPractice;

import java.util.Scanner;

public class Makameke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String countryName = input.nextLine();
        int country = countryName.length();
        System.out.println("total char is: "+country);
        System.out.println("your country is: "+countryName);
        System.out.println("total char is: " + countryName.length());
        System.out.println("First char is: "+ countryName.charAt(0));
        System.out.println("last char is: "+countryName.charAt(countryName.length()-1));
        System.out.println("middle char is: "+countryName.charAt((country-1)/2));
        System.out.println("first K is on: "+ countryName.indexOf("K"));
        System.out.println("second k is at: "+countryName.indexOf("k",10));
        System.out.println("last char is on: "+countryName.charAt(10));


/*
your planet is: kyrgyzstan
total characters 10
first char k
last char n
middle char y
first k 0
second k -1
10th char a
there is no 10th char kyrgyzstan
 */
    }
}
/*
 Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Planet name");
        String result = input.nextLine();
        System.out.println("your planet is: " +result);

        int lengthofInput = result.length();
        System.out.println("total characters " +lengthofInput);
        System.out.println("first cahr " +result.charAt(0));
        System.out.println("last char "+result.charAt(result.length()-1));
       // System.out.println(result.charAt(-1));
        System.out.println("middle char "+result.charAt((lengthofInput-1)/2));
        System.out.println("first k "+result.indexOf("k"));
        System.out.println("second k " +result.indexOf("k",3));
        System.out.println("10th char " +result.charAt(8));
        System.out.println("there is no 10th char "+ result);
 */