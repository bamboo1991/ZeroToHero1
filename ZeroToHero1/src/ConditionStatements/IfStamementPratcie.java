package ConditionStatements;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfStamementPratcie {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("do you know java?");
       String knowJava = input.nextLine();
       boolean iKnowJava = knowJava.equalsIgnoreCase("yes");
       if (iKnowJava) {
           System.out.println("do you know selenium?");
           String iKnowSelenium = input.nextLine();
           if (iKnowSelenium.equalsIgnoreCase("yes")) {
               System.out.println("do you know Api?");
               String iKnowApi = input.nextLine();
               if (iKnowApi.equalsIgnoreCase("yes")) {
                   System.out.println("you are hired");
               } else
                   System.out.println("we need with Api");
           } else
               System.out.println("we need with selenium");
       }
       else
           System.out.println("we need someone with java knowledge");
   }
   }








