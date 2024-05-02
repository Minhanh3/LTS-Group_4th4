package OOP.OOP_08_HocSinh;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private String lop;
    private LocalDate ngaySinh;
    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private double diemTrungBinh;
    Scanner sc = new Scanner(System.in);

    public HocSinh() {
        System.out.println("Nhap ho ten :");
        hoTen = sc.nextLine();
        System.out.println("Nhap lop : ");
        lop = sc.nextLine();
        System.out.println("Nhap diem toan :");
        diemToan = sc.nextDouble();
        System.out.println("Nhap diem van :");
        diemVan = sc.nextDouble();
        System.out.println("Nhap diem anh :");
        diemAnh = sc.nextDouble();
    }

    public HocSinh(String hoTen, String lop, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String layThongTin() {
        return hoTen + " hoc lop " + lop + " , co diem trung binh la " +
               getDiemTrungBinh();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemTrungBinh() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

}
