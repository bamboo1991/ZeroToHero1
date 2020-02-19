package Enum;
enum Sizes {
        TALL, GRANDE, VENTI
    }
    public class CoffeMachine {
    public static void main(String[] args) {
        Sizes sizes = Sizes.GRANDE;

        switch (sizes) {
            case TALL:
                System.out.println("the size is tall");
                break;
            case GRANDE:
                System.out.println("the size is grande");
                break;
            case VENTI:
                System.out.println("ajcalclkacsl");
        }

    }
}


