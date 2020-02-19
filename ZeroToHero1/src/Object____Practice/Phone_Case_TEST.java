package Object____Practice;

public class Phone_Case_TEST {
    public static void main(String[] args) {
        Phone_Class_Withdifferentinstance Apple = new Phone_Class_Withdifferentinstance();
        Apple.brand="Apple.inc";
        Apple.model="Iphone 11";
        Apple.price=750;
        Apple.screenSize=7;
        Apple.madeCountry="Kyrgyzstan";
        //print them all:
        System.out.println("brand is: "+Apple.brand);
        System.out.println("phone model is: "+Apple.model);
        System.out.println("phone price is: "+Apple.price);
        System.out.println("Screen size is: "+Apple.screenSize);
        System.out.println("it was made in "+Apple.madeCountry);
        Apple.playMusic();
        Apple.videoCall();
        Apple.videoRecording();
        Apple.voiceCall();
        Phone_Class_Withdifferentinstance Samsung = new Phone_Class_Withdifferentinstance();
        Samsung.brand="Samsung.inc";
        Samsung.model=" Galaxy X";
        Samsung.price=750;
        Samsung.screenSize=7;
        Samsung.madeCountry="Makaleke";
        System.out.println("brand is: "+Samsung.brand);
        System.out.println("phone model is: "+Samsung.model);
        System.out.println("phone price is: "+Samsung.price);
        System.out.println("Screen size is: "+Samsung.screenSize);
        System.out.println("it was made in "+Samsung.madeCountry);
        Samsung.playMusic();
        Samsung.videoCall();
        Samsung.videoRecording();
        Samsung.voiceCall();
        Phone_Class_Withdifferentinstance Motorola = new Phone_Class_Withdifferentinstance();
        Motorola.brand="Motorola.inc";
        Motorola.model=" MX4";
        Motorola.price=600;
        Motorola.screenSize=5;
        Motorola.madeCountry="Makaleke";
        System.out.println("brand is: "+Motorola.brand);
        System.out.println("phone model is: "+Motorola.model);
        System.out.println("phone price is: "+Motorola.price);
        System.out.println("Screen size is: "+Motorola.screenSize);
        System.out.println("it was made in "+Motorola.madeCountry);
        Motorola.playMusic();
        Motorola.videoCall();
        Motorola.videoRecording();
        Motorola.voiceCall();




    }
}
