package Date_And_Time_package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LOCAL_DATE {
    public static void main(String[] args) {



     LocalDate date1 = LocalDate.of(2020,Month.JANUARY,15);
        System.out.println("today is "+date1);
        LocalTime time = LocalTime.of(4,20);
        System.out.println("current time "+time);
LocalTime time1 = LocalTime.of(1,2,22,22222);
        System.out.println("exact time is "+time1);

        //WE CAN NOT DIRECTLY GIVE THE CALUE AS A LOCALdATEtIME.now(); bc in implementation for a mehtod in localdatetime
        // there is not of mentod accept the localDateTime as a parameter.
        System.out.println(time1);

        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JANUARY,15,12,20);
        System.out.println(dateTime);
        LocalDateTime timeAndDate = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(timeAndDate);
        //all time methods plusHour, plusMin, PlusSecond, PlusNanos is available for LocalTime objects.
        // all date mehtods plus Year, PlusMonth, PlusDay
        //
        LocalDate date3 = LocalDate.now();
        date3=date3.plusDays(40);
        System.out.println(date3);
// Date and Time objects are immutable, once you use the method it will not change your original value.
        // you need to reassing them again.
        LocalDate date5=LocalDate.now();

        date5=date5.minusYears(28);
        date5=date5.minusMonths(2);
        date5=date5.plusDays(18);
        System.out.println(date5);


    }
}
