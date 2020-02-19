package Abstraction3;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
public final List<String>  list;
    {
        list = new ArrayList<>();
        list.add("java");
    }
    public Example2(){
        list.add("selenium");

    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.list.add("Cucumber testing tools");
        System.out.println(example2.list);
Example2 example21 = new Example2();
        System.out.println(example21.list);
    }
    public final void myMethod(){
        System.out.println("I am inside my final mehtod");

    }
    public final void Mythods(String name){
        System.out.println("i am inside the seconds mehtod with Strinf paramente");
    }
}
