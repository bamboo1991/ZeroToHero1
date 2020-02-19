package ARRAYLIST_PRACTICE;

import java.util.ArrayList;

public class ArrayLIstDATATYPE {
    public static void main(String[] args) {
        ArrayList<String> name1 = new ArrayList();
        name1.add("Java");
        name1.add("c#");
        name1.add("Python");
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(5);
        numbers.add(33);
        numbers.add(22);
        numbers.add(21);
        numbers.add(66);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
        for (Integer nums : numbers) {
            if (nums % 2 == 0) {
                System.out.println(nums);

            }
        }
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("carrots");
        shoppingList.add("Cereal");
        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.set(4, "yogurt");
        System.out.println(shoppingList);
        shoppingList.set(shoppingList.indexOf("milk"), "tea");
        System.out.println(shoppingList);
        System.out.println(shoppingList.contains("Bread"));
        shoppingList.remove("milk");
        System.out.println(shoppingList);
        System.out.println(shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("stop waisting money");
        } else {
            System.out.println("keep shopping");

            shoppingList.clear();
            System.out.println(shoppingList);
            System.out.println(shoppingList.isEmpty());


        }
    }}
