package Abstraction;

public class OnCampusStudent extends Student {


    @Override
    public void attendClass(){
       System.out.println("Campus students are attending in the class");
   }
   @Override
    public Boolean isActive(){
       return true;
   }
   @Override
    public void study(){
       System.out.println("campus Student is studying");
   }
   
}
