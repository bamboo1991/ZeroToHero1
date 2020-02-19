package StringBuilderPractice;

public class REverse_using_REVERSE_METHOD {
    public static StringBuilder abc(String str){
        StringBuilder  value= new StringBuilder(str);
        value.reverse();
        System.out.println(value);
    return value;
    }

    public static void main(String[] args) {
        abc("Ariet ");

    }
}
