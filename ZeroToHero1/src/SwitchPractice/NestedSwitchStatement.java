package SwitchPractice;

import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your char \na or \nb");

        String ch = input.next();
        int number =5;
        String animalName="Dog";
        final String animalCat= "cat";
        switch (ch){
            case "a":
                switch (number){
                    case 5:
                        System.out.println(""+ch+5);
                        break;
                    case 10:
                        System.out.println(""+ch+10);
                        break;
                }
            case "b":
                switch (animalName){
                    case "Dog":
                        System.out.println("your animal kind is Dog");
                        break;
                    case animalCat:
                        System.out.println("your animal kind is Cat");
                        break;
                }
            break;
        }
    }
}
