package ARRAY_NEW_Topic;

import java.util.Arrays;

public class SundayMorningTask {
    public static void main(String[] args) {
        String [] values =  {"Tech", "Ariet"," Baha", "apple","sunday"};
        for (int i= 0; i <values.length; i++){
            for (int k = values[i].length()-1; k >=0; k--) {
                System.out.print(values[i].charAt(k));
                }
            System.out.println();
    }

        }
    }
