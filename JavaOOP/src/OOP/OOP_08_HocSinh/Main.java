package OOP.OOP_08_HocSinh;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        System.out.println(hocSinh.layThongTin());

        HocSinh hocSinh1 = new HocSinh("Manh", "javaoop", 9, 7, 8);
        System.out.println(hocSinh1.layThongTin());
    }
}
