package Date_And_Time_package;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task_task_task {
    public static void main(String[] args) {
        String dateAndTime = "15 05 2018 10:33";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateAndTime,formatter);
        System.out.println(dateTime);
        System.out.println(DateTimeFormatter.ofPattern("M/dd/yyyy-HH:mm a").format(dateTime));
    }
}
