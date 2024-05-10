package OOP.KiemTra.model;

import OOP.KiemTra.lib.InputHelper;

public class DanhBa {
    private int id;
    private String tenLienHe;
    private int soDT;
    private boolean trangThaiChan;

    public DanhBa() {
        id = InputHelper.inputNumber("Nhap id", "Sai");
        tenLienHe = InputHelper.inputName("Nhap ten Lien He", "Sai", 3, 10);
        soDT = InputHelper.inputNumber("Nhap so dien thoai", "Sai");
        trangThaiChan = false;
    }

    public String inThongtin() {
        return "DanhBa{" +
                "id=" + id +
                ", tenLienHe='" + tenLienHe + '\'' +
                ", soDT=" + soDT +
                ", trangThaiChan=" + trangThaiChan +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLienHe() {
        return tenLienHe;
    }

    public void setTenLienHe(String tenLienHe) {
        this.tenLienHe = tenLienHe;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public boolean isTrangThaiChan() {
        return trangThaiChan;
    }

    public void setTrangThaiChan(boolean trangThaiChan) {
        this.trangThaiChan = trangThaiChan;
    }
}
