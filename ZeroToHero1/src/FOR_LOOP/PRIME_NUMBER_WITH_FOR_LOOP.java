package FOR_LOOP;



import java.util.ArrayList;
import java.util.Scanner;

public class PRIME_NUMBER_WITH_FOR_LOOP {
   public static ArrayList<Integer> ArrayList(int start, int endNumber){
       ArrayList<Integer> primes = new ArrayList<>();
       for (int n =start; n<endNumber; n++){
           boolean prime= true;
           int i =2;
           while (i<=n/2){
               if(n%i==0){
                   prime=false;
               }
               i++;
           }
           if (prime&&1!=n){
               primes.add(n);
           }
       }
   return primes;
   }

    public static void main(String[] args) {
        System.out.println(ArrayList(1,100));
    }
        }


