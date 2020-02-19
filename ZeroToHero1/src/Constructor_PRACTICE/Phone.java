package Constructor_PRACTICE;



import java.util.Arrays;

public class Phone {
    //variables
    String phoneBrand;
    int cost;
    boolean camera;
    String carrier;
    //constructors

    public Phone(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public Phone(String phoneBrand, int cost) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
    }

    public Phone(String phoneBrand, int cost, String carrier) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
        this.carrier = carrier;
    }

    public Phone(String phoneBrand, int cost, boolean camera, String carrier) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
        this.carrier = carrier;
        this.camera = camera;

    }

    // methods
    public String findCheaperPhone(Phone phone1, Phone phone2) {
        if (phone1.cost > phone2.cost) {
            return phone2.phoneBrand;
        } else if (phone2.cost > phone1.cost) {
            return phone1.phoneBrand ;
        } else
            {
                return "";
            }}
public String[] getPhoneDetails(Phone phone) {

    String[] details= new String[4];
    details[0] = phone.phoneBrand;
    details[1] = phone.cost+"";
    details[2] = phone.camera+"";
    details[3] = phone.carrier;
    return details;
}

    public static void main(String[] args) {

            Phone phone1= new Phone("Iphone", 1000,true," Verizon");
            Phone phone2 = new Phone("Samsung", 950, false, " AT&T" );
            Phone phone3 = new Phone("Motorolla", 455,true,"T-mobile");

            phone2.findCheaperPhone(phone1,phone2);

            phone1.getPhoneDetails(phone1);
            phone2.getPhoneDetails(phone2);
            phone3.getPhoneDetails(phone3);
        phone2.findCheaperPhone(phone1,phone2);

        System.out.println(Arrays.toString(phone1.getPhoneDetails(phone1)));
        System.out.println(Arrays.toString(phone2.getPhoneDetails(phone2)));
        System.out.println(Arrays.toString(phone3.getPhoneDetails(phone3)));

    }



    }
