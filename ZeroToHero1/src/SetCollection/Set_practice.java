package SetCollection;

import java.util.*;

public class Set_practice {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////
        Set<Integer> list = new HashSet<>(); // HashSet<String> list = new HashSet<>();
        Set<Integer> list2 = new HashSet();
        list2.add(10);
        list2.add(20);
        System.err.println(list2);
        //if you try to add existing it will compile but it will not add.
        List aarList = new ArrayList();
        aarList.add(20);
        aarList.add(30);
        //addAll method
        list2.addAll(aarList);
        System.out.println(list2);
       //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        Iterator<Integer> i = list2.iterator();
        while (i.hasNext()) {
            if (i.next() ==10) {
                System.out.println(i.next());
            }}
        for (Integer lis:list2){
            if (lis==10){
                System.out.println(lis);
            }
        }
        System.out.println(list2.contains(20));
        System.out.println(list2.contains(40));
        System.out.println(list2.remove(30));
        System.out.println(list2);
        System.err.println("size is: "+list2.size());
        list2.clear();

        System.out.println(list2);
        System.out.println(list2.isEmpty());

    }
}