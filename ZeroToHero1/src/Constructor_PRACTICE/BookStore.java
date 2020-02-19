package Constructor_PRACTICE;



public class BookStore {
    // Instance Variables
   public String title;
    String author;
  public  int priceOfTheBook;
   static int count;

    public BookStore(String title, int priceOfTheBook){
        this.title=title;
        this.priceOfTheBook=priceOfTheBook;
         count++;
    }
    public BookStore(String title, String author,int priceOfTheBook){
        this.title=title;
        this.author=author;
        this.priceOfTheBook=priceOfTheBook;
        count++;
    }
    //War and Peace, Leo Tolstoy, $20
    public void getDetails(){
        System.out.println(title+", "+author+", $"+priceOfTheBook);
    }

}
