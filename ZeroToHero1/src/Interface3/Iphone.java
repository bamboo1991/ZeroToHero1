package Interface3;

public class Iphone extends Phone {

    @Override
    public Object storeFiles() {
        return "Iphone is storing files in Icloud";
    }
    public void faceId(){
        System.out.println("Unlock with face Id");

    }
}
