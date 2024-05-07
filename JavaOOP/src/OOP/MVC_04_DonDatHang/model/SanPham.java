package OOP.MVC_04_DonDatHang.model;

import OOP.MVC_04_DonDatHang.lib.InputHelper;

public class SanPham {
    private int maSP;
    private String tenSP;
    private float giaBan;
    private String ghiChu;

    public SanPham() {
        maSP = InputHelper.inputNumber("Nhap ma san pham", "Sai");
        tenSP = InputHelper.inputString("Nhap ten san pham", "Sai", 2, 20);
        giaBan = InputHelper.inputNumberFloat("Nhap giaBan", "Sai");
        ghiChu = InputHelper.inputString("Nhap ghiChu", "Sai", 2, 50);
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
