package lambda;


import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    // Lambda is a function and that does not have a name and does not belong to any class.
      public void perform(Greeter greeter){
          greeter.greeting();
      }
      public String getName(String id) {
          return "techtorial";
      }

    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        GreetingImplementation greetingImplementation = new GreetingImplementation();
        practice1.perform(greetingImplementation);
Greeter ariet =()-> System.out.println("hello world");
Greeter1 ariet1  =  id -> 12;
List<String> list = new ArrayList();
list.add("hello");
list.add("world");
list.add("casc");
list.add("asa");
list.add("a");
list.forEach(element-> System.out.println(element));
      }

    }

