package JAV1_5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAV1_5_14_Display_date_time_now_inCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyy - HH:mm:ss");
        String format = DateFormat.format(calendar.getTime());
        System.out.println("Date: " + format);
    }
}
