package arithmeticOperators;

import Constructor_PRACTICE.Static_BLOCK_EXAMPLE;

import java.util.Scanner;

public class Table {



    private String brand;
    private String color;
    private String materials;
    private String types;
    private double price;
    private String location;
    private  int years;
    private boolean isAvailable;
    private String storeName;
     public Table(String brand, String color, String materials, String types, String storeName){
         this.brand=brand;
         this.color=color;
         this.materials=materials;
         this.types=types;
         this.storeName=storeName;
     }
     public Table(){

     }
     public String getBrand(){
         return brand;
     }
     public String getColor(){
         return color;
     }
     public String getMaterials(){
         return materials;
     }
     public String getTypes(){
         return types;
     }
     public String getLocation(){
         return location;
     }
     public String getStoreName(){
         return storeName;
     }
     public void setBrand(String brand){
        this.brand=brand;
     }
     public void setColor(String color){
         this.color=color;
     }
     public void setMaterials(String materials){
         this.materials=materials;
     }
     public void setTypes(String types){
         this.types=types;
     }
     public void setPrice(int price){
         if (price<=101){
             System.err.println("this is over Priced item please lower your price");
         }else {
             System.out.println("Perfect price fot this item");
             this.price=price;
         }
     }
     public void setLocation(String location){
         if (location.equalsIgnoreCase("Chicago")){
             System.out.println("we can deliver this item to your house");
                 this.location=location;
             }else {
                 System.out.println("We are sorry, but this location is out of our delivery zone");
             }
         }

     public void setYears(int years){
         this.years=years;
     }
     public void setAvailable(boolean available){
         this.isAvailable=isAvailable;
     }
     public void setStoreName(String storeName){
         this.storeName=storeName;
     }










//    private String brand;
//    private String color ;
//    private String material ;
//    private String kind ;
//    private double price;
//private boolean isAvailable;
//
//    public Table(String brand, String color, String material){
//        this.brand=brand;
//        this.color=color;
//        this.material=material;
//    }public String getBrand(){
//        return brand;
//    }
//    public String getColor(){
//        return color;
//    }
//    public String getMaterial(){
//        return material;
//    }
//    public String getKind(){
//        return kind;
//    }
//    public double getPrice(){
//        return price;
//    }
//    public boolean getIsAvailable(){
//        return isAvailable;
//    }
//    public void setBrand(String brand){
////        this.brand=brand;
//     }

//    public void setColor(String color){
//        this.color=color;
//    }
//    public void setMaterial(String material){
//        this.material=material;
//    }
//    public void setKind(String kind){
//        this.kind=kind;
//    }
//    public void setPrice(double price){
//        if (price<=100){
//                System.out.println("do not set the price");
//            }else {
//                System.out.println("set the price");
//                this.price=price;
//        }
//
//
//    }
//    public void setAvailable(boolean isAvailable){
//        this.isAvailable=isAvailable;
//    }
//


//
}
