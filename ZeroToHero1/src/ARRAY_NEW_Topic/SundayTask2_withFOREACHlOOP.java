package ARRAY_NEW_Topic;

public class SundayTask2_withFOREACHlOOP {
    public static void main(String[] args) {
        String [][] storeProducts = {{"Fruits: waterMelon", "apple", "banana"},
                {"Vegetables: beans", "lettuce", "cabbage", "onion","potato","cucumber"},
                {"Drinks: orange juice","pepsi","water", "lemonade" }};
        for (String[] name:storeProducts){
            for (String newName :name){
                System.out.println(newName);
            }

        }
    }
}
