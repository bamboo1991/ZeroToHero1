package ARRAY_NEW_Topic;

import java.util.Arrays;

public class SPLIT_STRING {
    public static void main(String[] args) {
        String date = "12-07-2019-12.45";
        String[] values = date.split("-");
        System.out.println(Arrays.toString(values));
        if (values[2].equalsIgnoreCase("2017")){
            System.out.println("year is 2019");
        }else{
            System.out.println("year is not 2019");


    }
    }
}
