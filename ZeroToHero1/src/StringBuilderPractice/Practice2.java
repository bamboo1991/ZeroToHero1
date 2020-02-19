package StringBuilderPractice;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
public static void updateList(ArrayList<StringBuilder> list){
    for (int i=0; i<list.size(); i++){
        list.get(i).deleteCharAt(list.get(i).length()-1);
        list.get(i).insert(list.get(i).length(),"m");
    }
}

    public static void main(String[] args) {
        ArrayList<StringBuilder> value = new ArrayList();
        value.add(new StringBuilder("table"));
        value.add(new StringBuilder("cup"));
        value.add(new StringBuilder("boxes"));
        value.add(new StringBuilder("apple"));
     updateList(value);
        System.out.println(value);

        List list1=new ArrayList();
        list1.add("hi");
        List list2=new ArrayList();
        list2.add("hi");
        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));


        }
    }


