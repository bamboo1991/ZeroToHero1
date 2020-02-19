package ARRAY_NEW_Topic;

import java.util.Arrays;

public class Sunday_TASK_2 {
    public static void main(String[] args) {
        String [][] storeProducts = {{"Fruits: waterMelon", "apple", "banana"},
                {"Vegetables: beans", "lettuce", "cabbage", "onion","potato","cucumber"},
                {"Drinks: orange juice","pepsi","water", "lemonade" }};
        for (int i =0; i<storeProducts.length; i++){
            for (int k=0; k<storeProducts[i].length; k++){
                System.out.println(storeProducts[i][k]);
            }
        }



    }
}
