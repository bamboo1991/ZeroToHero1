package StringPractice;

public class SubStringPractice {
    public static void main(String[] args) {
        String comComponent = "keyboard";
        System.out.println(comComponent.substring(3));
        System.out.println(comComponent.substring(3,6));
        System.out.println(comComponent.substring(6,7));
        System.out.println(comComponent.substring(0,8));


        System.out.println(comComponent.substring(3));
        System.out.println(comComponent.substring(3,5)); //will print "bo" from board ...3,4
        System.out.println(comComponent.substring(1,2));// will print "e" from board...1
        System.out.println(comComponent.substring(2,2)); //it will print empty String
       // System.out.println(comComponent.substring(4,2));// it will throw the exception
        //System.out.println(comComponent.substring(4,20));//

        System.out.println(comComponent.substring(4,8));//-----> oard

    }
}
