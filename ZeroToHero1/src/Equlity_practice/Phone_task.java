package Equlity_practice;

import Constructor_PRACTICE.Phone;

public class Phone_task {
    public Phone_task(String brand1){

    }
public void finalize(){
    System.out.println("this is finalized method");
}
    public static void main(String[] args) {
        Phone_task one=new Phone_task("Iphone");
        Phone_task two=new Phone_task("Samsung");
        one=two;
        Phone_task three=one;
        one=null;
        two=null;
        System.gc();
    }
}
