package ARRAY_NEW_Topic;

import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        String star ="";
        for (int i =0; i<5; i++){
            star+="*";
            System.out.println(star);
        }
        String star1 = "*****";
        for(int i=0; i<5; i++ ){
            System.out.println(star1);
            star1=star1.substring(1);
        }


        String value = " this is my live and i am very proud of me";
        String[] newValue = value.split("");
        for (String spiltValue:newValue){
            if (spiltValue.length()<3){

            }
            System.out.print(""+spiltValue);
        }



        }

    }