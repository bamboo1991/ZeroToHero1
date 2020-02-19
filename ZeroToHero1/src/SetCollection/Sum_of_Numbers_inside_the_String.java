package SetCollection;

public class Sum_of_Numbers_inside_the_String {
  public static int method(String str) {
      String str1 = "sassafras3242jkh23v4v24112";
      int sum = 0;
      for (int i = 0; i < str.length(); i++) {
          if (Character.isDigit(str.charAt(i))) {
              String nm = "" + str.charAt(i);
              int num = Integer.parseInt(nm);
              sum += num;}}
      return sum;
  }
  public static String rerunString(String str){
      String fullString = "sassafras3242jkh23v4v24112";
      String str1="";
      for (int i=0; i<fullString.length(); i++){
          if (Character.isAlphabetic(fullString.charAt(i))){
              String justLetter =""+fullString.charAt(i);
              String letters = String.valueOf(justLetter);
              str1+=letters;

          }
      }return str1;
  }
  public static void main(String[] args) {
      int result =Sum_of_Numbers_inside_the_String.method("saasascass3242jkh23v4v24112");
        System.out.println(result);
        String result1 = Sum_of_Numbers_inside_the_String.rerunString("saasascass3242jkh23v4v24112");
      System.out.println(result1);
    }}
