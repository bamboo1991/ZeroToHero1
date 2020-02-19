package StringBuilderPractice;

public class Equlaity_String_Builder {
    public static void main(String[] args) {
      StringBuilder value1 = new StringBuilder();
        StringBuilder value2 = new StringBuilder();
        StringBuilder value3 = new StringBuilder();
        StringBuilder value4 = new StringBuilder();
        StringBuilder value5 = new StringBuilder();
        String value6 ="apple";
        String value7="apple";
        value3.append("apple");
        value4.append("apple");
        System.out.println(value3==value4);
      System.out.println("--> "+value3.equals(value4));
        System.out.println(value6.equals(value7));
        System.out.println(value6==value7);
        //car car=new car("Toyota);
//car car1=new Car("Toyota")
// == where they are pointing same object
//car.equals(car1); --> where they are pointing same object
// .equals() method int String is coming from String Class

    }
}
