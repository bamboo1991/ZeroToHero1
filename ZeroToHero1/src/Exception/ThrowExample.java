package Exception;

public class ThrowExample {
    public static void main(String[] args) {

try {
    System.out.println("about to throw an exception");
    throw new RuntimeException();
}catch (Exception e){
    System.err.println("in catch block "+e.getMessage());
}finally{
    System.out.println("We are done with Exception");
}
    }
}