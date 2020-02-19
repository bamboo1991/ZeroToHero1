package ARRAY_NEW_Topic;

public class threeDimensionArray {
    public static void main(String[] args) {
        String[][][] roomNumber = new String[1][2][3];
          roomNumber[0][0][0]="room1";
          roomNumber[0][0][1]="room2";
          roomNumber[0][0][2]="room3";
//======================================================================================================================
          roomNumber[0][1][0]="room12";
          roomNumber[0][1][1]="room21";
          roomNumber[0][1][2]="room32";
               for (int i =0; i<roomNumber.length;i++){
                   for (int k=0; k<roomNumber[i].length;k++){
                        for (int j=0; j<roomNumber[i][k].length;j++){
                             System.out.println(roomNumber[i][k][j]);
                   }
               }
        }
    }
}