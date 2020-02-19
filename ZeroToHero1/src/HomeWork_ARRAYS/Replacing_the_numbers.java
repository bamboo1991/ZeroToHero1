package HomeWork_ARRAYS;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

public class Replacing_the_numbers {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 5, 11, 9, 7};
        int[] newNumbers = new int[7];
for (int i=0; i<newNumbers.length; i++){
    newNumbers[i]=nums[i];
    newNumbers[i]+=3;
    newNumbers[0]=3;
}
        System.out.println(Arrays.toString(newNumbers));

        LocalDate now = LocalDate.now();
        LocalDateTime time = LocalDateTime.now();



        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter formatter2=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter3=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println(formatter.format(now));
        System.out.println(formatter1.format(now));
        System.out.println(formatter2.format(now));
        System.out.println(formatter3.format(now));

        //time
        System.out.println("--> "+formatter.format(time));
        System.out.println(time);

        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(formatter4.format(time));

        //all localized date and time
        DateTimeFormatter formatter5=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(formatter5.format(time));
    }


    }

