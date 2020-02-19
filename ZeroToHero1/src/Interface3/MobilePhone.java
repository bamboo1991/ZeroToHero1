package Interface3;

public class MobilePhone extends Phone {


    @Override
    public Object storeFiles() {
        return "storing files from phone to memory card";
    }
    public void playMusic(){
        System.out.println("playing music from mobilePhone");
    }


}
