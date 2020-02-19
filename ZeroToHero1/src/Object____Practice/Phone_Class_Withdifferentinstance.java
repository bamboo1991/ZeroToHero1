package Object____Practice;

public class Phone_Class_Withdifferentinstance {
    int price;
    int screenSize;
    String model;
    String brand;
    int whenItWasMade;
    String madeCountry;


    public void voiceCall(){
    }
    public int  videoCall(){
        int priceForVideoCall = 1;
        System.out.println("Price for video calls per minute is $"+priceForVideoCall);
        return priceForVideoCall;
    }
    public String playMusic(){
        String nameOfTheMusic = "Blue moon is Shining";
        System.out.println("current music is: "+nameOfTheMusic);
        return nameOfTheMusic;
    }
    public void videoRecording(){
        System.out.println("recording is started");
    }










}

