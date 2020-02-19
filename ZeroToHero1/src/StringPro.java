import java.util.regex.Pattern;

public class StringPro {
    public static void main(String[] args) {
       // Provide the string values, This String values needs to end with k

String[] arr="ma.we".split("\\.");
        System.out.println(Pattern.matches("..k ","akka"));
        System.out.println(Pattern.matches("[a-z]+","adfaswesd"));
        System.out.println(Pattern.matches("[0-9]+","123456"));
        System.out.println(Pattern.matches("[abcpt]+","abcabcaaccbmaw"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]+","asvssgjhejo*"));
    }
}
