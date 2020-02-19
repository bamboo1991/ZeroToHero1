package WrapperClasses;

import java.util.Arrays;

public class Examples_which_i_repeat {
    static String[] roomPrices = {"$112", "$132", "$92", "$102", "$113", "$162", "$332"}; // instance variable
public static int [] Without(String [] costForRooms) {
    int[] remove$ = new int[costForRooms.length];
    for (int i = 0; i < costForRooms.length; i++) {
        costForRooms[i] = costForRooms[i].substring(1);
        remove$[i] = Integer.valueOf(costForRooms[i]);

    }return remove$;

}
    public static void main (String[]args){
        System.out.println("-->"+Arrays.toString(Without(roomPrices)));
    }
}
//    public static int [] Without$sign(String[] roomCost){ // my method
//        int [] no$ = new int[roomCost.length]; // new array
//        for (int i =0; i<roomCost.length; i++){ // for loop
//            roomCost[i]=roomCost[i].substring(1); // reasising
//            no$[i]=Integer.valueOf(roomCost[i]); }  // now i have new value in the new array
//        return no$;                             //return type
//    }
//    public static void main(String[] args) {        // main method
//        System.out.println(Arrays.toString(Without$sign(roomPrices)));
//    }

