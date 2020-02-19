package HOMEWORK_FOR_ARRAY;

public class Finding_square_of_array_elements {
    public static void main(String[] args) {
        int[] arrayNumbers = {6,4,12,88,13,9};
        for (int i=0; i<arrayNumbers.length;i++){
            int squareOfArrayIs = arrayNumbers[i]*arrayNumbers[i];
            System.out.println(squareOfArrayIs);
        }

    }
}
