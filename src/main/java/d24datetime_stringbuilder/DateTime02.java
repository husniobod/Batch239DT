package d24datetime_stringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {


        //What is the time in Amsterdam => use "Europe/Amsterdam
        LocalTime timeInAmsterdam= LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam); //18:47:00.475714

        LocalTime timeInNY= LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(timeInNY); //12:48:41.397408

        //Lets use date and time together
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2024-03-06T20:53:43.749832
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy - HH:mm");
        String formattedLdt=dtf2.format(ldt);
        System.out.println("formattedLdt = " + formattedLdt);//formattedLdt = 06-Mar-2024 - 20:55

    }
}
