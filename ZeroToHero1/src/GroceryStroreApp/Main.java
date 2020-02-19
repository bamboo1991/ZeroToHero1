package GroceryStroreApp;

import java.util.Scanner;

public class Main {
    Scanner input=new Scanner(System.in);
    GroceryBuddy gb=new GroceryBuddy();
    GroceryList gl=new GroceryList();
    CheckOut checkOut=new CheckOut();
    public void getInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print Grocery Menu. ");
        System.out.println("\t 1 - To print choice options. ");
        System.out.println("\t 2 - To print the list of grocery items. ");
        System.out.println("\t 3 - To add an item to the list. ");
        System.out.println("\t 4 - To modify an item in the list. ");
        System.out.println("\t 5 - To remove an item from the list. ");
        System.out.println("\t 6 - To search for an item in the list. ");
        System.out.println("\t 7 - To check out the cart");
        System.out.println("\t 8 - To Payment");
        System.out.println("\t 9 - To quit the application.");
    }
    public void allItems(){
        gb.printFruits();
        gb.printProducts();
        gb.printVegetables();
    }
    public void addItem(){
        System.out.println("Please enter the purchased item");
        String item=input.next();
        gl.purchasedItems(item);
    }
    public void modifyItem(){
        System.out.println("Please enter the name and the position number of the item u want to replace");
        String name=input.next();
        int position=input.nextInt();
        gl.modifyList(position,name);
        System.out.println("Your item was replaced");
    }
    public void removeItem(){
        System.out.println("PLease enter the product name u want to remove.");
        String name=input.next();
        gl.removeItem(name);
    }
    public void checkOut(){
        System.out.println(gl.ListOfPurchasedItems());
        System.out.println(gl.totalPrice());
    }
    public void grandTotal(){
        double deliveryFee=12.99;
        double grandTotal= gl.totalPrice()+deliveryFee;
        System.out.println("PLease enter the payment method");
        String payment=input.next();
        System.out.println("Your payment option is " +payment+" grand total is "+grandTotal);
    }
    public void searchItem(){
        System.out.println("Please enter the name of the product u want to search");
        String name=input.next();
        System.out.println(gl.findItem(name));
    }
    public void listOfItems(){
        System.out.println(gl.ListOfPurchasedItems());
    }
    public static void main(String[] args) {
        Main main=new Main();
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Grocery Store");
        main.getInstructions();
        String option=input.next();
        do{
            switch(option){
                case "0" :
                    main.allItems();
                    break;
                case "1":
                    main.getInstructions();
                    break;
                case "2":
                    main.listOfItems();
                    break;
                case "3":
                    main.addItem();
                    break;
                case "4":
                    main.modifyItem();
                    break;
                case "5":
                    main.removeItem();
                    break;
                case "6":
                    main.searchItem();
                    break;
                case "7":
                    main.checkOut();
                    break;
                case "8":
                    main.grandTotal();
                    break;
                case "9":
                    System.out.println("Thank u for shopping in our grocery store");
                    break;
                default:
                    System.out.println("The option you entered is invalid");
            }
            System.err.println("If  you would like to continue, choose available option");
            main.getInstructions();
            option=input.next();
        }while (!option.equals(9));
    }}


