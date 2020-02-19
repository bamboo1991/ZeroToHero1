package Date_And_Time_package;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_LocalDATE {
    public static void main(String[] args) {
        String date = "4/22/2020";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        System.out.println(formatter.format(localDate));



//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" M/dd/yyyy");
//        LocalDate localDate = LocalDate.parse(date, formatter);
//        System.out.println(localDate);
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
//        System.out.println(dateTimeFormatter.format(localDate));

    }
}
