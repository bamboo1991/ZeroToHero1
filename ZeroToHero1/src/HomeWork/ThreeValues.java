package HomeWork;

import java.util.Scanner;

public class ThreeValues {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("please enter your three different values?");
        String name1 = value.nextLine();
        String name2=value.nextLine();
        String name3=value.nextLine();
        int values1 = name1.length();
        int values2=name2.length();
        int values3=name3.length();
        int valuesOfLength = values1+values2+values3;
        System.out.println("total length: "+valuesOfLength);
        System.out.println("first char of name1 is: " + name1.charAt(0));
        System.out.println("first char of name1 is: " + name2.charAt(0));
        System.out.println("first char of name1 is: " + name3.charAt(0));
        System.out.println("Last char is: "+name1.charAt(name1.length()-1));
        System.out.println("Last char is: "+name2.charAt(name2.length()-1));
        System.out.println("Last char is: "+name3.charAt(name3.length()-1));
        System.out.println("middle char of these three string is: "+name1.charAt((values1-1)/2));
        System.out.println("middle char of these three string is: "+name2.charAt((values2-1)/2));
        System.out.println("middle char of these three string is: "+name3.charAt((values3-1)/2));
        System.out.println("4th char of these string is: "+ name1.charAt(3));
        System.out.println("4th char of these string is: "+ name2.charAt(4));
        System.out.println("4th char of these string is: "+ name3.charAt(4));
        System.out.println("Print index of  'k' if it is there "+ name1.indexOf("k"));
        System.out.println("Print index of  'k' if it is there "+ name2.indexOf("k"));
        System.out.println("Print index of  'k' if it is there "+ name2.indexOf("k"));
        System.out.println("values start with  letter C or c "+name1.startsWith("C"));
        System.out.println("values start with  letter C or c "+name2.startsWith("C"));
        System.out.println("values start with  letter C or c "+name3.startsWith("C"));
        System.out.println("values ends with letter a "+ name1.endsWith("a"));
        System.out.println("values ends with letter a "+ name2.endsWith("a"));
        System.out.println("values ends with letter a "+ name3.endsWith("a"));
        boolean theyAreEqual = values1==values2&&values2==values3;
        System.out.println("are values equal " + theyAreEqual);
        System.out.println("three inputs are equals to each other " +name1.equals(name2) );
        System.out.println("three inputs are equals to each other " +name2.equals(name3) );




    }
}
