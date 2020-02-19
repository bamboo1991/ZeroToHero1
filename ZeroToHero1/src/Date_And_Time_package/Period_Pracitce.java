package Date_And_Time_package;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Period_Pracitce {
    public static void main(String[] args) {
        Period days = Period.ofDays(20);
        System.out.println(days);
        Period weeks = Period.ofWeeks(2);
        System.out.println(weeks);
        Period month = Period.ofYears(6);
        System.out.println(month);
        Period fullYear = Period.of(1,12,1);
        System.out.println(fullYear);
        Period fulldate1 = Period.ofYears(1).ofMonths(6).ofDays(20);
        //as you can see that there is no method chaining in period. it will take last value which is 20 days
        System.out.println(fulldate1);
        DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Basic_Iso_Date "+dateFormatter.format(LocalDateTime.now()));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(dateTimeFormatter.format(LocalTime.now()));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("-------------------> "+dateTimeFormatter1.format(LocalDateTime.now()));

        DateTimeFormatter dateTimeFormatter2 =DateTimeFormatter.ofPattern("MMMM yyyy, dd|hh:mm:* ");
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1);
        System.out.println(dateTimeFormatter2.format(time1)+"pm");

        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy/dd/MMM");
        LocalDate date = LocalDate.now();
        System.out.println(dateFormatter1.format(date));

}}
