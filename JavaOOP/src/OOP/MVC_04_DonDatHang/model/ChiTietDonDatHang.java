package OOP.MVC_04_DonDatHang.model;

import OOP.MVC_04_DonDatHang.lib.InputHelper;

public class ChiTietDonDatHang {
    private int id;
    private int MaDDH;
    private int MaSP;
    private int SoLuong;

    public ChiTietDonDatHang() {
        id = InputHelper.inputNumber("Nhap id", "Sai");
        MaDDH = InputHelper.inputNumber("Nhap MaDDH", "Sai");
        MaSP = InputHelper.inputNumber("Nhap MaSP", "Sai");
        SoLuong = InputHelper.inputNumber("Nhap SoLuong", "Sai");
    }

    public String InThongTin() {
        return "ChiTietDonDatHang{" +
                "id=" + id +
                ", MaDDH=" + MaDDH +
                ", MaSP=" + MaSP +
                ", SoLuong=" + SoLuong +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaDDH() {
        return MaDDH;
    }

    public void setMaDDH(int maDDH) {
        MaDDH = maDDH;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
}
