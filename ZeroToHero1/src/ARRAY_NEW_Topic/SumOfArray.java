package ARRAY_NEW_Topic;


import java.util.Arrays;

public class SumOfArray {
public static void Palindrom(String str){
    String original = str;
    String empty ="";
    for (int i=str.length()-1; i>=0; i--) {
        empty += str.charAt(i);
    }
    if (original.equals(empty)){
            System.out.println("p");
        }else
            System.out.println("not");
    }


    public static void main(String[] args) {
        Palindrom("Ariet");
    }



}



