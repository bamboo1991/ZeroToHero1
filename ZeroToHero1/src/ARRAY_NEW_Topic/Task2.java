package ARRAY_NEW_Topic;



public class Task2 {
    public static void main(String[] args) {
        String name = "Techtorial";//pool
        String name1 = "Techtorial";//pool
        String name2=new String("Techtorial");//heap
        // == METHOD IS OBJECT WILL COMPARE THE VALUES TO THE SAME LOCATION.
        // IF THE VALUES STORED SAME LOCATION IT WILL RETURN TRUE.
        // OTHER WISE IT WILL RETURN FALSE
        System.out.println(name==name1);
        System.out.println(name==name2);
        //=================================
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));






    }
}
