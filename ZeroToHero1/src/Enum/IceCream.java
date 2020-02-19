package Enum;
public class IceCream {
    enum Sizes{
        LARGE, MEDIUM, SMALL;
    }

    public static void main(String [] args) {
        int [] num = {1,2,3,4,5};
        for (int i =0; i<num.length; i+=2){
            System.out.println(num[i]);
        }

        Sizes sizes = Sizes.LARGE;
switch (sizes){
    case LARGE:
        System.out.println("you ordered large size");
        break;
    case MEDIUM:
        System.out.println("you ordered medium size");
        break;
    case SMALL:
        System.out.println("you ordered small sizes");

}




    }}