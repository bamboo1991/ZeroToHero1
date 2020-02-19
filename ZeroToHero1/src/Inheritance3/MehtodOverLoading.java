package Inheritance3;

public class MehtodOverLoading {
    public Number getNumber(Number num){
        System.out.println("i am returning number ");
        return 10;

    }
    protected Integer getNumber(Integer num){
        System.out.println("i am returning Integer ");
        return 10;
    }



    Double getNumber(Double number){
        System.out.println("i am returning Double");
        return 10.0;
    }
    private String getNumber(int Number, String name){
        System.out.println("i am returning String");
        return "10";
    }

    public static void main(String[] args) {
        MehtodOverLoading mehtod = new MehtodOverLoading();
        mehtod.getNumber(22);
        mehtod.getNumber(22.1);
        mehtod.getNumber(22.1F);
        mehtod.getNumber(22,"Ariet");

    }

}
