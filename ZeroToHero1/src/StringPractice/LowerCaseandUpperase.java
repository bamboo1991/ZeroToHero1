package StringPractice;



public class LowerCaseandUpperase {
    public static void main(String[] args) {

        String cityOfChicago = "I am leaving in Chicago";
        System.out.println(cityOfChicago.startsWith("I am")); //-- return true
        System.out.println(cityOfChicago.endsWith("o")); //-- return true bc it ends with "o".
        System.out.println(cityOfChicago.contains("leaving"));
        System.out.println(cityOfChicago.equals("I am Leaving in Chicago"));
        System.out.println(cityOfChicago.equalsIgnoreCase("I am leaving IN ChicagO"));
        System.out.println(cityOfChicago.substring(4,12)); // leaving

String repeat = "Should i repeat what ever we learned";
        System.out.println(repeat.equalsIgnoreCase("Should I Repeat what ever we learned"));
        System.out.println(repeat.substring(4,15));




    }
}
