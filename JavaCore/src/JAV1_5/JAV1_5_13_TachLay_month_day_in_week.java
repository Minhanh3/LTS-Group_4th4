package JAV1_5;

import java.time.LocalDate;
import java.util.Scanner;

public class JAV1_5_13_TachLay_month_day_in_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thoi gian");
        String str = sc.nextLine();
//        LocalDate date = LocalDate.of(2000 , 01, 30);
        LocalDate date1 = LocalDate.parse(str);
        System.out.println("Year " + date1.getYear() + " Month " + date1.getMonthValue() + " Day " + date1.getDayOfMonth());
    }
}
