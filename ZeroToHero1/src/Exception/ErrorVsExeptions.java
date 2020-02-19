package Exception;

public class ErrorVsExeptions {
    public static void run() {
        run();
    }

    public static void main(String[] args) {
      try {
          run();
      }catch (StackOverflowError e){
          System.out.println("Stack over Flow");
      }
    }
}
