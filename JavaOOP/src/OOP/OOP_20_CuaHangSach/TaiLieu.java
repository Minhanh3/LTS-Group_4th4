package OOP.OOP_20_CuaHangSach;

import java.util.Scanner;

public class TaiLieu {
    private int maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    Scanner sc = new Scanner(System.in);

    public TaiLieu() {
        System.out.println("Nhap ma tai lieu");
        maTaiLieu = sc.nextInt();
        System.out.println("Nhap ten nha xuat ban");
        sc.nextLine();
        tenNhaXuatBan = sc.nextLine();
        System.out.println("Nhap so ban phat hanh");
        soBanPhatHanh = sc.nextInt();
    }

    public String inThongTinTaiLieu() {
        return "Ma tai kieu: " + maTaiLieu + " Ten nha xuat ban: " +
                tenNhaXuatBan + " So ban phat hanh: " + soBanPhatHanh;
    }

    public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
