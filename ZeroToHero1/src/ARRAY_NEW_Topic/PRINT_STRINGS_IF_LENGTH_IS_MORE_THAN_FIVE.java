package ARRAY_NEW_Topic;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class PRINT_STRINGS_IF_LENGTH_IS_MORE_THAN_FIVE {
    public static void main(String[] args) {
        String[] values = {"apple","banana","sugar","milk","tea","appleJuice"};
for (String strValues:values){
    int count = 0;
    for (int i=0;i<strValues.length(); i++){
        if (strValues.charAt(i) == 'A' || strValues.charAt(i)=='a'){
            count++;
        }
    }
    System.out.println(strValues+ " number of duplicate letters "+count);
}

        }
    }
