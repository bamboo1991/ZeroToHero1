package Inheritance2;

public class Vehicle {
   String vehicleName;
   int year;
public String name;


    public Vehicle(String vehicleName) {

this.vehicleName=vehicleName;
        System.out.println("this is one argument constructor");
        }
        public Vehicle(String vehicleName, int year){
        this(vehicleName);
        this.year=year;
            System.out.println("this constructor has two arguments");
        }

    public static void main(String[] args) {
        String cat = "animal", dog = "animal";


}
        Vehicle vehicle = new Vehicle("Toyota", 2005);



    }
