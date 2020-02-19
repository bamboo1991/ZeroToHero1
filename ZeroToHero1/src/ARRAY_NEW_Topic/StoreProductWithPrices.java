package ARRAY_NEW_Topic;


import java.util.Arrays;

public class StoreProductWithPrices {
    public static void main(String[] args) {


        String [][] storeProducts = {{"waterMelon", "apple", "banana"},
                {" beans", "lettuce", "cabbage", "onion","potato","cucumber"},
                {" orange juice","pepsi","water", "lemonade" }};
        Double [][] prices = {{1.99, 1.49,0.48},{ 1.0, 0.99,2.99, 1.99,0.69,1.0},{3.99,1.0, 4.0,5.0}};
        int [][] availaability = {{10,21,200},{22,44,555,33,1,44},{33,22,55,43}};

       // for (int [] )
        for (int i =0; i<storeProducts.length; i++){
            for (int k=0; k<storeProducts[i].length; k++){

                System.out.println(availaability[i][k]+ " "+storeProducts[i][k]+""+prices[i][k]);
                System.out.println(Arrays.toString(storeProducts[i]));
                }


                    }
                }
            }
