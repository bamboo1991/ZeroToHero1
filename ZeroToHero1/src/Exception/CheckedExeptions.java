package Exception;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExeptions {
    public static void main(String[] args)  {
        try {
            URL url= new URL("//www.google.com");
        }catch (MalformedURLException e){
            System.out.println(e.getMessage()+" <---->");
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
