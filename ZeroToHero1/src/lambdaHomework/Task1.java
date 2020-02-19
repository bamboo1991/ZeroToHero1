package lambdaHomework;
public class Task1 {
    public static void main(String[] args) {
//TASK1============================================================================
        printBye task1 = () -> System.out.println("bye");
        task1.bye();
//TASK2=============================================================================
    str_length task2 =  (String name) ->  System.out.println(name.length());
       task2.length("Ariet");

//TASK3============================================================================

School task3 = s -> System.out.println("Lets go to "+s);
task3.school("Techtorial");
//TASK4=============================================================================
        FIO task4 = (String lastName, int age) -> {
            System.out.println("Last name "+ lastName+ " and age is: "+age);
        };
        task4.names("Stamov",27);
//TASK5==============================================================================
customInterface task5 = (String product)-> {
    int productPrice = 12;
    System.out.println("Product name is: "+product+ " and price is: "+productPrice);
    return productPrice;
};
task5.getPrice("apple");
//TASK6=============================================================================
Key task6 = (key, value)-> System.out.println("Key: "+key+ " value "+value);
task6.getValue("Key", "Car");






    }


}






