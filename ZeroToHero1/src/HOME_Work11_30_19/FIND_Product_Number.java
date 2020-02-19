package HOME_Work11_30_19;

import java.util.Scanner;

public class FIND_Product_Number {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("product Number");
        int productNumber = input.nextInt();
        int product =1;
        int sum =0;
        while (productNumber>0){
            int digit = productNumber%10;
            productNumber/=10;
            product*=digit;
            sum+=digit;

        }
        int totalSum = product-sum;
        System.out.println("this is total sum "+totalSum);
        }
}
