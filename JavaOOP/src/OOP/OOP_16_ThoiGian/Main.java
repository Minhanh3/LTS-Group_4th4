package OOP.OOP_16_ThoiGian;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 4, 15);
        LocalDate endDate = LocalDate.of(2024, 5, 11);

        // tính sự chênh lệch giữa startDate và endDate
        // sử dụng hàm between() của Peridot
        // Để sử dụng Peridot chúng ta sẽ import gói thư viện java.time.Period của Java
        Period different = Period.between(startDate, endDate);
        System.out.println("Sự chênh lệch giữa startDate và endDate là " +
                different.getYears() + " năm " + different.getMonths() + " tháng và " +
                different.getDays() + " ngày.");
    }
}
