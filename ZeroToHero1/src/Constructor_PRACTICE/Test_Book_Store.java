package Constructor_PRACTICE;

public class Test_Book_Store {
    public static void main(String[] args) {
        BookStore book1 = new BookStore("War and Peace","Leo Tolstoy",15 );
        book1.getDetails();
        BookStore book2 =new BookStore("java OCA book", 50);
        book2.getDetails();
        System.out.println(book1.count);
    }
}
