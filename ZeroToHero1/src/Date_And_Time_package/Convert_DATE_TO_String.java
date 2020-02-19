package Date_And_Time_package;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Convert_DATE_TO_String {
    public static void main(String[] args) {
// String date = "24 April 2020";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String date = "24 April 2020";
        LocalDate date1 = LocalDate.parse(date,dateTimeFormatter);
        System.out.println(date1);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(dateTimeFormatter1.format(date1));



}}
