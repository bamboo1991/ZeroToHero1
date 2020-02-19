package Object____Practice;

public class Math_method {
    // i wan to create one method it should take one parameter as a int.
    // once i call this method it will return square of the parameter.
    public int square(int number){
        return number*number;
    }
public void multiplicationTable(int number){
        for (int i = 1; i<=10; i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }}
    public int sum (int num1,int num2){
        return num1+num2;
    }
    public int remainder(int number1, int number2){
        return number1%number2;
    }
    public int sumArray(int [] numbers){
        int sum = 0;

        for (int i=0; i<numbers.length; i++){

            sum+=numbers[i];
        }
        System.out.println("the sum of the array " + sum);
        return sum;
    }
    public void vLAUE(String valueName){
        for (int i =0; i<valueName.length(); i++){
            System.out.println(valueName.charAt(i));}

    }
    public static void main(String[] args) {
        Math_method test = new Math_method();
        int result = test.square(23);
        System.out.println(result);
        test.multiplicationTable(44);
        System.out.println("========================");
        test.multiplicationTable(2);
        System.out.println("========================");
        test.multiplicationTable(4);
        System.out.println("========================");
        test.multiplicationTable(5);
        int result1 =test.sum(4,4);
        System.out.println(result1);
        int remanainder = test.remainder(55,3);
        System.out.println(remanainder);
        int [] nums={10,5,20,40,30};
       test.sumArray(nums);
       int [] values = {22,44,55,777,88,99,34};
        test.sumArray(values);
        test.vLAUE("airplane");

//// task: write the method that will take ine parameter as a string value. it will print all the char for the String


    }
}

