package OOP.MVC_02_HocSinh.model;

import OOP.MVC_02_HocSinh.lib.InputHelper;

import java.time.LocalDate;

public class HocSinh {
    private int maHS;
    private String tenHs;
    private LocalDate ngaySinh;

    public HocSinh() {
        maHS = InputHelper.inputNumber("Nhap ma hoc sinh" , "sai nhap lai");
        tenHs = InputHelper.StringName("Nhap ten hoc sinh" , "sai nhap lai" , 3 , 50);
        ngaySinh = LocalDate.parse(InputHelper.StringName("Nhap ngay sinh hoc sinh" , "sai nhap lai" , 7 , 9));
    }

    public void inThongTin() {
        System.out.println("Ma hoc sinh: " + maHS);
        System.out.println("Ten hoc sinh: " + tenHs);
        System.out.println("Ngay sinh: " + ngaySinh);
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTenHs() {
        return tenHs;
    }

    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
