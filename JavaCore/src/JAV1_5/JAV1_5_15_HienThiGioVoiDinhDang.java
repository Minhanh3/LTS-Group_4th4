package JAV1_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class JAV1_5_15_HienThiGioVoiDinhDang {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));

        System.out.println("Thoi gian hien tai: " + format.format(date));
    }
}
