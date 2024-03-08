package d24datetime_stringbuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTimePractice {
    public static void main(String[] args) {

Date thisDate = new Date();

        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/Y  HH:mm w a");
        String myString = dateForm.format(thisDate);
        System.out.println(dateForm.format(thisDate));


    }
}
