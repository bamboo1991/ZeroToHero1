package Abstraction;

import java.util.Random;

public abstract class Student {
    public static int  generateRandomId() {
        Random random = new Random();
        random.nextInt(9);
        String numbers = String.valueOf(random);
        System.out.println(numbers);
        return random.nextInt(9);

    }

    public static void main(String[] args) {
        System.out.println(generateRandomId());
    }






}
