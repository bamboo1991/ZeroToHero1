package WrapperClasses;

public class STRING_TO_INT {
    public static void main(String[] args) {

        String value1 = "1Ariet###";
        String value2 = "2Ariet####";
        String value3 = "3Ariet#####";
        String value4 = "4Ariet######";
        String value5 = "5Ariet#######";
        String value6 = "6Ariet########";
        String value7 = "7Ariet#########";
        String value8 = "8Ariet##########";
        String value9 = "9Ariet###########";
        String value10 = "10Ariet###########";
        String value11= "11Ariet###3#########";
        String one = value1.substring(0,1);
        String two = value2.substring(0,1);
        String three =value3.substring(0,1);
        String four = value4.substring(0,1);
        String five = value5.substring(0,1);
        String six = value6.substring(0,1);
        String seven = value7.substring(0,1);
        String eight = value8.substring(0,1);
        String nine = value9.substring(0,1);
        String ten = value10.substring(0,1);
        String eleven =value11.substring(0,1);

        String totalpounds = one+two+three+four+five+six+seven+eight+nine+ten+eleven;
        Long newValue =Long.valueOf(totalpounds);
        System.out.println(totalpounds);



//              String num1 ="11$";
//              String num2 = "12$";
//              String num3 = "$13";
//              String num4 = "$14";
//              String num$1 = num1.substring(0,2);
//              String num$2 = num2.substring(0,2);
//              String num$3 = num3.substring(1,3);
//              String num$4 = num4.substring(1,3);
//String combineStrValues = num$1+num$2+num$3+num$4;
//Integer newValues = Integer.valueOf(combineStrValues);
//
//
//
//    System.err.println(newValues);

              // we need to combine all String values by concating each other.


      // Integer newValue = Integer.valueOf(combined);


    }
}