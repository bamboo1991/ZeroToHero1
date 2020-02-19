package Primitives;

public class PreAndPost {
    public static void main(String[] args) {
        int carNumber = 10;
        int totalInventory = ++carNumber*3/carNumber-- +--carNumber;
        System.out.println(totalInventory);
        int n= 4;
        int result=++n + n++ - 5;
        System.out.println(result);
        int sNumber=13;
        int totalSTUDENTnUMBER = sNumber++ %5*++ sNumber -sNumber--/2;
        System.out.println(totalSTUDENTnUMBER);
        System.out.println(sNumber);



        int k=7;
        int X=3;
        int resultS=k++ * ++X / ++X % k + X - k++;
        System.out.println("test "+result);
        //7 * 4 = 28
        // 28 / 4= 7
        //7 % 8=0
        //0+3=3
        //3 - 7= (-4)
        int x= 7;
        int N=3;
        int $result = x + x++ * x - N++ % N + ++N;
        //int $result = (x + (x++ * x)) - (N++ % N) + ++N);
        // 7 * 8 = 57;
        // 3 % 4 = 0;
        // 7 + 57 = 64;
        // 0 + 4 = 4;
        // 64 - 4 = 60;

        System.out.println("asa "+$result);
    }
}
