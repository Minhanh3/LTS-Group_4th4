package OOP.OOP_10_Nguoi;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi(123, "Manh", LocalDate.of(2022, 12, 03));
        System.out.println(nguoi1.inThongTin());
        Nguoi nguoi = new Nguoi();
        nguoi.taoDuLieuHoTen(nguoi);
        System.out.println(nguoi.inThongTin());
    }
}
