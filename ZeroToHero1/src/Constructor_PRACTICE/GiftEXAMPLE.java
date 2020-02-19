package Constructor_PRACTICE;



public class GiftEXAMPLE {
    String name;
    String giftName;

    public GiftEXAMPLE(){

    }
    public GiftEXAMPLE(String name, String giftName){
        this.giftName=giftName;
        this.name=name;
    }
    public void giftExchange(GiftEXAMPLE person1, GiftEXAMPLE person2){
     boolean giftExchange = person1.giftName!=null&&person2.giftName!=null;
     boolean noExchange = person1.giftName==null||person2.giftName==null;
     if (giftExchange){
         System.out.println("gifts are exchanged");
         String tempGift = person1.giftName;
         person1.giftName=person2.giftName;
         person2.giftName=tempGift;
     }else if (noExchange){
        System.out.println("no exchange of a gift");
     }


    }

public void  updateGift(GiftEXAMPLE newPerson, String newGift){
        newPerson.giftName=newGift;
    }

       public static void main(String[] args) {
        GiftEXAMPLE person1 = new GiftEXAMPLE("John", "MAC");
        GiftEXAMPLE person2 = new GiftEXAMPLE("sandu", "apple");
        GiftEXAMPLE person3 = new GiftEXAMPLE("Baha",null);

        System.out.println(person1.name+" ->" +person1.giftName);
        System.out.println(person2.name+" ->"+ person2.giftName);
        person1.giftExchange(person1,person2);



        person1.updateGift(person1, "apple");
        System.out.println(person1.name + "-> "+person1.giftName);
        person3.giftExchange(person3, person2);
        System.out.println(person2.name+ " ->" + person2.giftName);
        System.out.println(person3.name + " ->"+person3.giftName);
    }
}























