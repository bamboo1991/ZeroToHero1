package Object____Practice;

public class BOOK_APPLICATION_TEST {
    public static void main(String[] args) {
        Book_Application firstBook = new Book_Application();
        firstBook.bookPage=350;
        //////////////////////////// method called
        firstBook.read();
        firstBook.read();
        firstBook.read();
        firstBook.read();
        firstBook.read();
        firstBook.read();
        firstBook.read();
        firstBook.read();
        System.out.println(firstBook.bookPage+ " left after reading");
        }
    }

