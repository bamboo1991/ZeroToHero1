package ARRAYLIST_PRACTICE;

import Constructor_PRACTICE.BookStore;

import java.util.ArrayList;

import java.util.List;

public class Computer_STORE {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList();
        Computer comp1 = new Computer("MacBook", 2018, 850);
        Computer comp2 = new Computer("Lenovo",2016,860);
        Computer comp3 = new Computer("Dell", 2016, 1600);
        Computer comp4 = new Computer("HP", 2015, 1000);
        Computer comp5 = new Computer("Asus", 2016, 1300);
        Computer comp6 = new Computer("MacBook", 2019, 1000);
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);
        computers.add(comp6);
        System.out.println(computers.get(0).brand);
        System.out.println();
        for (int i =0; i<computers.size(); i++){
            System.out.println(computers.get(i).brand);
        }



        for (Computer prices : computers){
            System.out.println(prices.price);
        }computers.get(0).price= computers.get(0).price-100;
        System.out.println(computers.get(0).price);

        for (int i=0; i<computers.size(); i++){
            computers.get(i).price= computers.get(i).price-100;
            System.out.println("-------> "+computers.get(i).price);

               if(computers.get(i).price<=1000){
                   System.out.println(computers.get(i).brand);
            }
        }
        List<BookStore> books = new ArrayList();
        books.add(new BookStore("Java OCA", 120));
        books.add(new BookStore("War and Peace", 13));
        books.add(new BookStore("Cucumber Automation",55));
        System.out.println("========================================");
        for (BookStore title: books){
            System.out.println(title.title);
        }

        }

    }

