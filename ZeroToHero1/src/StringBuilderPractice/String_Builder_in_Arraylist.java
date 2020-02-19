package StringBuilderPractice;

import java.util.ArrayList;
public class String_Builder_in_Arraylist {
    public static void main(String[] args) {
        ArrayList<StringBuilder> value = new ArrayList();
        value.add(0, new StringBuilder("Table"));
        value.add(1, new StringBuilder("cup") );
        value.add(2, new StringBuilder("Phone"));
        value.add(3, new StringBuilder("map"));
        for (int i=0; i<value.size(); i++){
            value.get(i).insert(value.get(i).length(),"m");

        } System.out.println(value);


    }
}
