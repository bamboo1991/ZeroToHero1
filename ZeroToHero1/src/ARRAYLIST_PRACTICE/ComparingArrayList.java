package ARRAYLIST_PRACTICE;



import WrapperClasses.String_CONVERTER;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingArrayList {
    public static void main(String[] args) {
        ArrayList<String> bookshelf1 = new ArrayList();
        ArrayList<String> bookshelf2 = new ArrayList();

        bookshelf1.add("Java");
        bookshelf1.add("PmBook");
        bookshelf1.add("Mind Hacking");
        bookshelf1.add("War and Peace");
        System.out.println("====================================");
        bookshelf2.add("Java");
        bookshelf2.add("PmBook");
        bookshelf2.add("Mind Hacking");
        bookshelf2.add("War and Peace");

        if (bookshelf1.equals(bookshelf2)) {
            System.out.println("books are same");
        } else {
            System.out.println("books are different");

        }
        System.out.println(bookshelf2.set(bookshelf2.indexOf("War and Peace"), "Selenium"));
        if (bookshelf1.equals(bookshelf2)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
        List<String> studentNames = new ArrayList();
        String [] names = {"kate", "Nicole", "Mike", "Patel", "Kushal", "Arpan"};
        studentNames= Arrays.asList(names);
        System.out.println(studentNames.get(1));
        List<String> studentName2 = Arrays.asList(new String[] {"Patel", "Arpan"});

    }

}