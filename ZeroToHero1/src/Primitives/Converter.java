package Primitives;

public class Converter {
    public static void main(String [] args){
        byte Fahrenheit = 30;
        byte SubtractNumber = 32;
        byte multiplyNumber = 5;
        byte dividNumber = 9;

        int Celcius = ( Fahrenheit - SubtractNumber ) * multiplyNumber / dividNumber;
        System.out.println(Celcius);
    }
}
