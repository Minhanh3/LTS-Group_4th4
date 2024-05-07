package OOP.MVC_03_SanPham.model;

import OOP.MVC_03_SanPham.lib.InputHelper;

public class LoaiSanPham {
    private int loaiSP;
    private String tenLoai;


    public LoaiSanPham() {
        loaiSP = InputHelper.inputNumber("Nhap loai sp bằng số", "Sai ");
        tenLoai = InputHelper.inputString("Nhap ten loai bằng chữ", "Sai" , 1 , 30);
    }

    public String InThongTin() {
        return "LoaiSanPham : " +
                "loaiSP : " + loaiSP +
                ", tenLoai : " + tenLoai + '\'';
    }

    public int getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
