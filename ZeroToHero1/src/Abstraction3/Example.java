package Abstraction3;

public class Example {
    public static final String SchoolName;
    // fINAL VAAIBLES CANNOT BE REASIGNED.
    //STATIC BLOCK, INSTANCE BLOCK AND CONSTRUCTOR
    static {
        SchoolName="Techtorial";
    }
    public Example(){
  //      SchoolName="Techtorial";
    }

    public static void main(String[] args) {
       String NAME = SchoolName+2;
        System.out.println(NAME);
    }
}
