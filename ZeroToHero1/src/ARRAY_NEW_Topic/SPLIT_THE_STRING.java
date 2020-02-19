package ARRAY_NEW_Topic;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class SPLIT_THE_STRING {
    public static void main(String[] args) {
        String longString = "The method split() splits a String into multiple Strings given the delimiter that separates them. The returned object is an array which contains the split Strings. We can also pass a limit to the number of elements in the returned array";
        String[] values = longString.split(" ");
        for (String splitValues: values){
            if (splitValues.length()<4){
                System.out.println(splitValues);
            }


        }
        String javaIs = "Array.is.today's.topic";
        String[] splitJava = javaIs.split("\\.");
        System.out.println(Arrays.toString(splitJava));





    }
}