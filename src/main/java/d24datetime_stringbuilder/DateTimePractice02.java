package d24datetime_stringbuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimePractice02 {
    public static void main(String[] args) {


    Date curentDate  = new Date();
        System.out.println(curentDate);


        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(curentDate));

        SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(curentDate));

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(curentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(curentDate));


    }
}
