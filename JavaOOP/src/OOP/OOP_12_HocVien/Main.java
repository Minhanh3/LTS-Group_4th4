package OOP.OOP_12_HocVien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static OOP.OOP_12_HocVien.HocVien.timKiemHocVien;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien1 = new HocVien(01, "Manh", 400, "manhdz");
        HocVien hocVien2 = new HocVien(02, "Manhdz", 300, "manhdz");
        HocVien hocVien3 = new HocVien(03, "Manhdz", 500, "manhdz");

        HocVien hocVien = new HocVien();
        System.out.println(hocVien.inThongTin());

        List<HocVien> lst = new ArrayList<>(Arrays.asList(hocVien1, hocVien2, hocVien3));
        for (HocVien hocVien4 : timKiemHocVien("Manh", lst)) {
            System.out.println(hocVien4.inThongTin());
        }
    }
}
