package ARRAYLIST_PRACTICE;
import java.util.Arrays;
import java.util.List;
public class ArrayList_PRACTICE {
        public static void main(String[] args) {
            List<String> itemList = Arrays.asList("1", "5", "2", "8");
            List<String> priceForItems1 = Arrays.asList("$22.77", "$43.31", "$10.9", "$32.05");
          double totalExpense = 0 ;
          for (int a =0; a<itemList.size(); a++){
              int newList = Integer.parseInt(itemList.get(a));
              String removed$ = priceForItems1.get(a).substring(1);

              double newPrice = Double.parseDouble(removed$);
              totalExpense+=newList*newPrice;

          }
            System.out.println("casca "+totalExpense);



        }}