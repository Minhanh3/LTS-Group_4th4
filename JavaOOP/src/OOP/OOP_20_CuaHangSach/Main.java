package OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        Sach sach = new Sach();
//        System.out.println(sach.inThongTinSach());
        System.out.println();
        System.out.println("Sách đã tìm kiếm");
        Sach sach1 = new Sach(1, "nxb", 32, "conan", "tg", 30);
        Sach sach2 = new Sach(2, "nxb2", 322, "conan2", "tg2", 310);
        Sach sach3 = new Sach(3, "nxb3", 22, "doraemon", "tg5", 90);
        List<Sach> lst = new ArrayList<>(Arrays.asList(sach1, sach2, sach3));
        List<Sach> timkiem = Sach.timKiemSach("conan", lst);
        for (Sach sachn : timkiem) {
            System.out.println(sachn.inThongTinSach());
        }
        System.out.println();
//        TapChi tapChi = new TapChi();
//        System.out.println(tapChi.inThongTinTapChi());
        System.out.println("Tạp Chí đã tìm kiếm");
        TapChi tapChi1 = new TapChi(4, "nxb4", 43, "buoisang", 21, 4);
        TapChi tapChi2 = new TapChi(5, "nxb5", 44, "buoichieu", 55, 2);
        TapChi tapChi3 = new TapChi(6, "nxb6", 47, "buoisang1", 66, 8);
        List<TapChi> tapChis = new ArrayList<>(Arrays.asList(tapChi1, tapChi2, tapChi3));
        for (TapChi tapChi : TapChi.timKiemTapChi("buoichieu", tapChis)) {
            System.out.println(tapChi.inThongTinTapChi());
        }
//        TruyenTranh truyenTranh = new TruyenTranh();
//        System.out.println(truyenTranh.inThongTinTruyenTranh());
        System.out.println();
        System.out.println("Truyện đã tìm kiếm");
        TruyenTranh truyenTranh1 = new TruyenTranh(7 ,"nxb7" , 77 ,"sieu nhan",30);
        TruyenTranh truyenTranh2 = new TruyenTranh(8 ,"nxb8" , 78 ,"sieu nhan gao",20);
        TruyenTranh truyenTranh3 = new TruyenTranh(9 ,"nxb9" , 79 ,"trinh tham",10);
        List<TruyenTranh> truyenTranhs = new ArrayList<>(Arrays.asList(truyenTranh1 ,truyenTranh2 , truyenTranh3));
        for (TruyenTranh truyenTranhn: TruyenTranh.timKiemTruyenTranh("sieu nhan" , truyenTranhs)
             ) {
            System.out.println(truyenTranhn.inThongTinTruyenTranh());
        }
    }
}
