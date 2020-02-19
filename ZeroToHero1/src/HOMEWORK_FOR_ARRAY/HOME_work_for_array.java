package HOMEWORK_FOR_ARRAY;

public class HOME_work_for_array {
    public static void main(String[] args) {
        int [] weatherConditions = {77,67,88,74,99,54};
        for (int i=0; i<weatherConditions.length; i++){
            int celsius = (weatherConditions[i]-32)*5/9;
            System.out.println("Fahrenheit to celsius is "+celsius+"C-");



        }
    }
}
