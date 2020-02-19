package Constructor_PRACTICE;

public class Static_BLOCK_EXAMPLE {
    //static block
    static {
        System.out.println("i am static block");
    }
    //instance Block
    {
        System.out.println("i am instance block");
    }
    public Static_BLOCK_EXAMPLE( ){
        System.out.println("i am not default constructor");
    }

    public static void main(String[] args) {
        Static_BLOCK_EXAMPLE st1 = new Static_BLOCK_EXAMPLE();
        Static_BLOCK_EXAMPLE st2 = new Static_BLOCK_EXAMPLE();
        Static_BLOCK_EXAMPLE st3 = new Static_BLOCK_EXAMPLE();
    }
}
