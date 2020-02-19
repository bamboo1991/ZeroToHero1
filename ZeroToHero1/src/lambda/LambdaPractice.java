package lambda;

public class LambdaPractice {
    public static void main(String[] args) {


        XandY ariet = (x, y) -> {
            System.out.println("we are summing up "+ x +" and "+ y);
            System.out.println("the result is:" +(x + y));
        return x+y;
        };

        ariet.Sum(22,33);

    }
}

