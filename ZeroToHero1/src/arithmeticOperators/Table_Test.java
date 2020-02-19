package arithmeticOperators;

import java.util.Scanner;

public class Table_Test {
    public static void main(String[] args) {
Table tb1= new Table("Ashley", "Brown", "wood and metal","Office table","Ashley Home Furniture");
Table tb2 =new Table();

        System.out.println(tb1.getBrand());
        System.out.println(tb1.getColor());
        System.out.println(tb1.getMaterials());
        System.out.println(tb1.getStoreName());
        System.out.println(tb1.getTypes());
        tb2.setLocation("Chicago");

String value = "ariet stamov";

String space = "";
for (int i=value.length()-1; i>=0; i--){
    space+=value.charAt(i);


} System.out.println(space);




        //        Table table = new Table("Ikea", "White", "wood");
//        System.out.println(table.getBrand());
//        table.setPrice(101);
//        System.out.println(table.getPrice());
//        table.setKind("Coffee table");
//        System.out.println(table.getKind());
//        table.setAvailable(true);
//        System.out.println(table.getIsAvailable());
    }
}
