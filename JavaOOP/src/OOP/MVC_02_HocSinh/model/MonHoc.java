package OOP.MVC_02_HocSinh.model;

import OOP.MVC_02_HocSinh.lib.InputHelper;

public class MonHoc {
    private int maMh;
    private String tenMh;
    private int soTiet;

    public MonHoc() {
        maMh = InputHelper.inputNumber("Nhap ma mon hoc", " sai");
        tenMh = InputHelper.StringName("Nhap ten mon hoc", "SAI", 2, 20);
        soTiet = InputHelper.inputNumber("Nhap so tiet mon hoc", " sai");
    }

    public void inThongTin() {
        System.out.println("Ma mon hoc: " + maMh);
        System.out.println("Ten mon hoc: " + tenMh);
        System.out.println("So Tiet mon hoc: " + soTiet);
    }

    public int getMaMh() {
        return maMh;
    }

    public void setMaMh(int maMh) {
        this.maMh = maMh;
    }

    public String getTenMh() {
        return tenMh;
    }

    public void setTenMh(String tenMh) {
        this.tenMh = tenMh;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
}
