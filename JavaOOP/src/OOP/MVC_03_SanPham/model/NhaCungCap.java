package OOP.MVC_03_SanPham.model;

import OOP.MVC_03_SanPham.lib.InputHelper;

public class NhaCungCap {
    private int nhaCC;
    private String tenNCC;
    private int soDT;

    public NhaCungCap() {
        nhaCC = InputHelper.inputNumber("Nhap nha cung cap bằng số", "sai");
        tenNCC = InputHelper.inputString("Nhap ten nha cung cấp", "Sai", 1, 30);
        soDT = InputHelper.inputNumber("Nhap so dien thoai", "Sai");
    }

    public String inThongTin() {
        return "NhaCungCap :" +
                " nhaCC :" + nhaCC +
                ", tenNCC :" + tenNCC + '\'' +
                ", soDT :" + soDT ;
    }

    public int getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(int nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }
}
