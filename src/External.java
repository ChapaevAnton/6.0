import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class External {

    public static void main(String[] args) {


        //TODO Вопрос почему так не работает TimeZone
        TimeZone timeZone_5 = TimeZone.getTimeZone("GMT+5"); //GMT+5 05:00 0500
        TimeZone timeZone_7 = TimeZone.getTimeZone("GMT+7"); //GMT+5 05:00 0500

        TimeZone.setDefault(timeZone_5);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM YYYY  HH:mm:ss");
        dateFormat.setTimeZone(timeZone_7);
        System.out.println(dateFormat.format(calendar.getTime()));


        for (String string : TimeZone.getAvailableIDs(TimeZone.getTimeZone(
                "GMT+05:00").getRawOffset())) {
            System.out.println(string);
        }
    }
}
