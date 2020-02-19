package StringBuilderPractice;

public class Succes_preporation {
    public static void main(String[] args) {
        StringBuilder succes = new StringBuilder();
        succes.append("preporation");
        succes.insert(0,"$");
        System.out.println(succes);
        System.out.println(succes.length());
        succes.insert(12,"$");
        System.out.println(succes);

        succes.delete(0,3);
        System.out.println(succes);
        succes.deleteCharAt(succes.length()-1);
        System.out.println(succes);
        succes.reverse();
        String value =succes.toString();
        System.out.println(succes);
    }
}
