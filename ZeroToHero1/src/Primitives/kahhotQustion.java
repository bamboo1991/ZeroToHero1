package Primitives;

import java.util.Scanner;

public class kahhotQustion {
    public static void main(String[] args) {
        int x;
        int k=10;
        int r=5;
        if (k>r){
            x=6;

            System.out.println(x);



            ////java does not know results until run time. variables inside the method or any other scope variables is called local variables.
            // you can not access variables outside of the method.
            //instead creating the variable and checking the result in if statement, if you give the values directly inside f stement java knows the result and will not
            // give the complie error.
            int x1=5;
            if(10==10){
                x1++; //will be executed
            }else{
                x1++; //will not be executed becuase
                x1++;
            }
            int num1=5;
            if (3>5) {
                num1++;
                num1--; //this line will cause an error.
            }   else //---> compile time error
                num1++;
                    /*
                    if you are not using curly braces and adding the else statement you must
                    give only one stement afterif cond
                    if you want to use more one stetment under if-else con, you should use the curly braces.

                     */
                    /*
                    Scanner input =new Scanner(System.in);
                    System.out.println("please enter these numbers one at the time: \n10 \n5 \n3 \n8");
                    int numbers = input.NextInt();

                   int first =10;
                    int second =5;
                    int third = 3;
                    int fourth = 8;
                    boolean first
                    write the pseudocode to find biggest to lowest number.
                    1.we nned to ask user to put for different numbers on the console.
                     2. once it has all the number we need to compare nmumber with boolean or other methods.
                     3. each one needs to comparaed to each other and print by order.
                     */
            Scanner input =new Scanner(System.in);
            System.out.println("please enter these numbers one at the time: \n10 \n5 \n3 \n8");
            int numbers = input.nextInt();
            int first =10;
            int second =5;
            int third = 3;
            int fourth = 8;
           if(first>second){
               System.out.println(first);
               if(second>fourth){
                   System.out.println(fourth);
                   if(third<second){
                       //System.out.println(second;
                       if(first>fourth){
                           System.out.println(fourth);
                       }
                   }
               }
           }

            }

        }

    }


