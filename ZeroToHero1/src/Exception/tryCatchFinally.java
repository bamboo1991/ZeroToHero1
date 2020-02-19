package Exception;

import java.util.Scanner;

public class tryCatchFinally {
    public static void main(String[] args) {
        int [] nums = new int[]{4,5,66,33};
        for (int i =0; i<=nums.length; i++){
         try {
             System.out.println(nums[i]);
         }catch (ArrayIndexOutOfBoundsException e){
             System.err.println("------->"+i+" index");
             System.out.println(e.getMessage());
             return;
         }catch (Throwable e){
             System.out.println(e.getMessage());
         }finally {
             System.out.println("I am finally method");
         }

         }System.out.println("After finally");

        }
    }
