package Object____Practice;

public class Book_Application {
    int bookPage;
    public void read(){
        int readPages = 50;
        if (bookPage>=50){
            System.out.println("you have read "+readPages+ " pages");
            System.out.println(bookPage+" pages left, keep reading");
            bookPage-=50;
        }else if(bookPage==50){
            System.out.println("you are almost to finish the book");
        }else{
            System.out.println("Book IS finished");
        }
    }
}
