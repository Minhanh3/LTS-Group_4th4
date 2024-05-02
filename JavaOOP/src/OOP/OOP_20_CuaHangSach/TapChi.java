package OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu {
    //    Tạp chí có thêm các thông tin: Tên tạp chí, số phát hành, tháng phát hành
    private String tenTapChi;
    private int soPhatHanh;
    private int thangPhatHanh;

    Scanner sc = new Scanner(System.in);

    public TapChi() {
        System.out.println("Nhap ten Tap Chi");
        tenTapChi = sc.nextLine();
        System.out.println("Nhap so Phat Hanh");
        soPhatHanh = sc.nextInt();
        System.out.println("Nhap thang Phat Hanh");
        thangPhatHanh = sc.nextInt();
    }
    public static List<TapChi> timKiemTapChi(String ten , List<TapChi> lst){
        List<TapChi> dstk = new ArrayList<>();
        for ( TapChi tapChi: lst) {
            if (tapChi.getTenTapChi().contains(ten)) {
                dstk.add(tapChi);
            }
        }
        return dstk;
    }

    public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTapChi, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTapChi = tenTapChi;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String inThongTinTapChi() {
        System.out.println(super.inThongTinTaiLieu());
        return "Ten Tap Chi: " + tenTapChi +
                " So Phat Hanh: " + soPhatHanh +
                " Thang Phat Hanh: " + thangPhatHanh;
    }

    public String getTenTapChi() {
        return tenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
        this.tenTapChi = tenTapChi;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
