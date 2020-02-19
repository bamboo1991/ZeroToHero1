package HomeWork;

import java.util.Scanner;

public class Ingridients {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter three ingredients");
        String ingredients = input.nextLine();
        System.out.println("Please enter any single number");
        int num1 = input.nextInt();


        char firstLetter = ingredients.charAt(0);/// first letter
        int space1 = ingredients.indexOf(" ")+1; // space between ingredients
        char secondLeter = ingredients.charAt(space1);// first letter of second word
        int space2 = ingredients.indexOf(" ",space1)+1;// space
        char thirdLetter = ingredients.charAt(space2); // first letter of third word
        System.out.println(""+firstLetter+secondLeter+thirdLetter);
        ingredients=ingredients.replace(""+ingredients.charAt(0),""+num1).replace(""+ingredients.charAt(space1),
                ""+ingredients.replace(""+ingredients.charAt(secondLeter),""+ ++num1).replace(""+ingredients.charAt(space2),""+ ++num1));








    }

}
