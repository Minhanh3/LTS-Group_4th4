package OOP.OOP_10_Nguoi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private int maSo;
    private String hoTen;
    private LocalDate ngaySinh;
    private String ho;
    private String dem;
    private String ten;
    Scanner sc = new Scanner(System.in);

    public Nguoi() {
        System.out.println("Nhap ma so :");
        maSo = sc.nextInt();
        System.out.println("Nhap ho ten :");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh");
        ngaySinh = LocalDate.parse(sc.nextLine());
    }

    public void taoDuLieuHoTen(Nguoi a) {
        if (a.getHoTen().isEmpty()) {
            System.out.println("Nhap ho ten :");
            a.setHoTen(sc.nextLine());
        }
    }

    public String inThongTin() {
        return
                "Ma so " + maSo +
                        " co ten la " + hoTen + " sinh ngay " + ngaySinh;
    }

    public Nguoi(int maSo, String hoTen, LocalDate ngaySinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(int maSo, String hoTen, LocalDate ngaySinh, String ho, String dem, String ten) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ho = ho;
        this.dem = dem;
        this.ten = ten;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getDem() {
        return dem;
    }

    public void setDem(String dem) {
        this.dem = dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
