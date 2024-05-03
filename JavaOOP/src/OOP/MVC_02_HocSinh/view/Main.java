package OOP.MVC_02_HocSinh.view;


import OOP.MVC_02_HocSinh.model.HocSinh;
import OOP.MVC_02_HocSinh.model.MonHoc;

public class Main {

    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        MonHoc monHoc = new MonHoc();
        monHoc.inThongTin();
        hocSinh.inThongTin();
    }

}
