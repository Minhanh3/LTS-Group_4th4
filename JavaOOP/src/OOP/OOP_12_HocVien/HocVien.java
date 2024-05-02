package OOP.OOP_12_HocVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
    private int maHocVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private String ho;
    private double hocPhi;
    private String email;
    Scanner sc = new Scanner(System.in);

    public HocVien() {
        System.out.println("Nhap ma hoc vien :");
        maHocVien = sc.nextInt();
        System.out.println("Nhap ho ten : ");
        sc.nextLine();
        hoTen = sc.nextLine();
    }

    public static List<HocVien> timKiemHocVien(String name, List<HocVien> lst) {
        List<HocVien> result = new ArrayList<>();
        for (HocVien hocVien : lst) {
            if (hocVien.getHoTen().equalsIgnoreCase(name)) {
                result.add(hocVien);
            }
        }
        return result;
    }

    public String inThongTin() {
        return
                "maHocVien= " + maHocVien +
                        ", hoTen='" + hoTen + '\'' +
                        ", email='" + getEmail() + '\'';
    }

    public HocVien(int maHocVien, String hoTen, double hocPhi, String email) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.hocPhi = hocPhi;
        this.email = email;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
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

    public double getHocPhi() {
        return hocPhi > 300 ? hocPhi / 0.05 : hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getEmail() {
        return hoTen.trim().toLowerCase().replace(" ", "") + "@edusolution.com";
    }

    public void setEmail() {
        this.email = hoTen.trim() + "@edusolution.com";
    }
}
