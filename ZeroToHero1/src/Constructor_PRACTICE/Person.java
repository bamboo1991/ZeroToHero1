package Constructor_PRACTICE;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name: " + name+ ", age: "+ age;
    }
    public  void detailsChanged(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
Person person1 = new Person("Merry", 21);
Person person2;
person2=person1;
        System.out.println(person2);
        System.out.println(person1);
person2.detailsChanged("Baha",32);
        System.out.println(person1==person2);
System.out.println(person1.equals(person2));

    }



}
