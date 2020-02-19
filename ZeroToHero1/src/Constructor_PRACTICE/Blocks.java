package Constructor_PRACTICE;

public class Blocks {
    public Blocks() {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    static {
        System.out.println(3);

    }

    static {
        System.out.println(4);
    }

    {
        System.out.println(5);
    }
//////////it sipoosed to be in the new class but object of Blocks class
    public static void main(String[] args) {
        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks();


    }

}
