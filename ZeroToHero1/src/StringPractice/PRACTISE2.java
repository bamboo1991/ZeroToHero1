package StringPractice;

public class PRACTISE2 {
    public static void main(String[] args) {
        String sentence ="this is jfalksjfksh v lhsdlvhslkvlksnvlks";
        int result = sentence.length();
        System.out.println(result);
        System.out.println(sentence.charAt(result-1));
        System.out.println(sentence.charAt((result-1)/2));// middle char from String
        String bookName = "potential";
        bookName=bookName.concat("of the Class");
        System.out.println(bookName);
String soccerPlayer ="Cristiano ";
soccerPlayer=soccerPlayer+(" Ronaldo "); // THERE IS NO REASSIGMENT FOR LAST NAME. SoccerPlayer will be Still Christiono
        System.out.println(soccerPlayer);
        String computer = "Macbook Computer";
        System.out.println(computer.indexOf("b"));
        System.out.println(computer.indexOf("book"));
        //System.out.println(coputer.indexOf("t"));// if there is no matching in String value it will return -1;
        System.out.println(computer.indexOf("o"));// if there are more than one matching value,
        System.out.println(soccerPlayer.charAt(1));
        // it will return index number for first matching.
        System.out.println(computer.indexOf("o",7));/*if you use the index number in indexOF() method, it will
        start searching from giving index number. indexOf() method will return the int value.*/

        System.out.println("print only from second char and do not print last char " + computer.substring(1, computer.length()-1));
        System.out.println("print "+ computer.substring(1, computer.length()-1));
        System.out.println("print "+ computer.substring(1,computer.length()-3));
        System.out.println("print "+ computer.substring(1,computer.length()-4));
        System.out.println("print "+computer.substring(1,computer.length()-5));
        System.out.println("print "+computer.substring(1,computer.length()-2));
    }
}
