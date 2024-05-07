package OOP.MVC_04_DonDatHang.model;

import OOP.MVC_04_DonDatHang.lib.InputHelper;

import java.time.LocalDate;

public class DonDatHang {
    private int maDDH;
    private String soHieuDon;
    private LocalDate ngayTao;

    public DonDatHang() {
        maDDH = InputHelper.inputNumber("Nhap ma don dat hang", "Sai");
        soHieuDon = InputHelper.inputString("Nhap so hieu don", "Sai", 2, 10);
        ngayTao = LocalDate.parse(InputHelper.inputString("Nhap so hieu don", "Sai", 7, 10));
    }

    public String InThongTin() {
        return "DonDatHang{" +
                "maDDH=" + maDDH +
                ", soHieuDon='" + soHieuDon + '\'' +
                ", ngayTao=" + ngayTao +
                '}';
    }

    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public String getSoHieuDon() {
        return soHieuDon;
    }

    public void setSoHieuDon(String soHieuDon) {
        this.soHieuDon = soHieuDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }
}
