package TernaryOperaotr;

public class ternaryOperators {
    public static void main(String[] args) {
        int spaces =5;
        int passenger =6;
        System.out.println(spaces>=passenger? spaces-passenger : "they cannot");
        int booksAtHome = 10;
        int booksAtTheStore = 14;
        System.out.println(booksAtTheStore>booksAtHome ? "true": "false");
        // If you are using different data type for statement, you can not assign them to any data type.

        //======================Java doesnt know until runtime which one will be executed ,
        // that is why if you are assinging, both sata type must be same
        int numberOfBooks = booksAtHome==booksAtTheStore ? 25 : 14 ;
        System.out.println("sdjsvsvdb "+ (booksAtHome>booksAtTheStore ? 10: 14));
        System.out.println(booksAtHome<booksAtTheStore ? booksAtHome+10: booksAtHome+14);

        //String str = 6>4 ? "Hello" : 11; --> it will be compile error.
        String value = "ariet";
        String value2 = "sandu";
        System.out.println();
int x=11;
        while (x > 10) {
            x--;
        }

        System.out.println(x);
        if (x > 10) {
            do{
                x--;
            }while(x>10);
        }
        System.out.println(x);
        }

    }


