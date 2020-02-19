package ARRAY_NEW_Topic;

import java.util.Arrays;

public class TWO_DIMENSIONAL_ARRAY_EXAMPLE {
    public static void main(String[] args) {
        int [][] containers = new int[2][3];
        containers[0][0]=15;
        containers[0][1]=25;
        containers[0][2]=90;
        containers[1][0]=60;
        containers[1][1]=80;
        containers[1][2]=90;
        System.out.println(Arrays.toString(containers[0]));
        System.out.println(Arrays.toString(containers[1]));
        for (int i =0; i<containers.length;i++){
            //container. length will go up to 2 because my container array includes only two anther array.
            for (int k=0;k<containers[i].length;k++){

                System.out.println(containers[i][k]);
                 }

                //container[i].length will get the size of your inner array.


        }}
    }
