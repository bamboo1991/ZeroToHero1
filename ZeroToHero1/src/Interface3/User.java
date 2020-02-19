package Interface3;

public class User extends Iphone{
    public void playMusic(){
    System.out.println("playing music from Iphone ---> ");

}
    @Override
    public Object storeFiles() {
        return "Iphone is storing files in Icloud ---->";
    }
    public static void main(String ...rgs) {
        //        MobilePhone mobilePhone = new MobilePhone();
//        // mobilePhone will have varaibkels and method of MemoryCard, HeadPhones.
//        HeadPhones headPhones = new User();
//
//        headPhones.playMusic();
//        System.out.println(((MobilePhone)headPhones).storeFiles());
    Phone phone = new Iphone();
    phone.regularMethod();
        ((Iphone)phone).faceId();
        System.out.println(phone.storeFiles());
        Phone phone1 = new User();
        System.out.println(phone1.storeFiles());



            }
        }
