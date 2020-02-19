package Exception;

public class ExcdptionExample {

        public static int convertToInt(String number){
            int result;
            try {
                result = Integer.parseInt(number); // Number format exception.
                return result;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.exit(0);
            }finally {
                System.out.println("finally block of conerted method");
            }return -1;
    }

    public static void main(String[] args) {
            String [] numbers = {"2A2","3","21A"};
            int [] intNumber = new int [numbers.length];
            for (int i = 0; i<=numbers.length; i++){
                try {
                    intNumber[i] = convertToInt(numbers[i]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.err.println(e.getMessage());
                   // System.exit(0);
                }finally {
                    System.out.println("finally block");
                }

            }


    }
}
