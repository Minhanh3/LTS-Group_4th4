package OOP.MVC_03_SanPham.model;

import OOP.MVC_03_SanPham.lib.InputHelper;

public class SanPham {
    private int maSP;
    private String tenSP;
    private LoaiSanPham loaiSP;
    private NhaCungCap nhaCC;

    public SanPham() {
        maSP = InputHelper.inputNumber("Nhap ma san pham", "Sai");
        tenSP = InputHelper.inputString("Nhap ten san pham", "Sai", 2, 20);
        loaiSP = new LoaiSanPham();
        nhaCC = new NhaCungCap();
    }

    public String inThongTin() {
        return "SanPham " +
                "maSP :" + maSP +
                ", tenSP :" + tenSP +
                ", loaiSP :" + loaiSP.getLoaiSP() +
                ", nhaCC :" + nhaCC.getNhaCC();
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

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public NhaCungCap getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(NhaCungCap nhaCC) {
        this.nhaCC = nhaCC;
    }
}
