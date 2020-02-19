package Mentoring;


public class Student {
    public static void printSumOfNumbers(String str) {
         str = "d3n4b21j4ll3j1";
        int sum = 0;
        for (int i =0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                String nullSpace = ""+str.charAt(i);
                int num = Integer.parseInt(nullSpace);
                sum+=num;
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
Student.printSumOfNumbers("d3n4b21j4ll3j1");




    }
}


