package WrapperClasses;
import java.util.Arrays;
public class String_CONVERTER {
static String [] itemCost = {"$12.3","$21.55","$21.55","$9.19","$54.6"};
public static double [] myMethod(String [] baseCost){
    double[] remove$ = new double[itemCost.length];
    for (int i=0; i<itemCost.length; i++){
        itemCost[i]=itemCost[i].substring(1);
        remove$[i]=Double.valueOf(baseCost[i]);
    }return remove$;
}public static void main(String[] args) {
        System.out.println(Arrays.toString(myMethod(itemCost)));
    }
}

////    public static int[] priceConveter(String[] prices) {
////        int[] newPrices = new int[prices.length];
////        for (int i = 0; i < prices.length; i++) {
////            prices[i] = prices[i].substring(1);
////            newPrices[i] = Integer.valueOf(prices[i]); //Integer ->int->Unboxing
//             }
//        return newPrices;
//    }
//    static String[] roomNumbers = {"#102", "#103", "#101", "#200", "#455", "#212", "#777", "#106"};
//    public static int[] roomNumber(String[] rooms) { // this is method which will accept object of roomNumbers arrayList.
//        int[] newRooomNumbers = new int[roomNumbers.length]; // we will store roomNumbers into this ArrayList
//        for (int i = 0; i < roomNumbers.length; i++) {
//            roomNumbers[i] = roomNumbers[i].substring(1);// this will start from index of 1
//            newRooomNumbers[i] = Integer.valueOf(rooms[i]); // this will unBox and store TO "newRoomNumbers[i]"
//            // since we have created string method it should have return value.
//        }return newRooomNumbers;
//    }
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(priceConveter(prices)));
//        System.out.println(Arrays.toString(roomNumber(roomNumbers)));
//    }
//}





