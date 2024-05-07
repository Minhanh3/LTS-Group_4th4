package OOP.MVC_01_SoHoc.model;

import OOP.MVC_01_SoHoc.lib.InputHelper;

public class SoHoc {
    private int giaTri;
    private boolean laSoChan;
    private boolean laSoNT;
    private boolean laSoDoiXung;

    public SoHoc() {
        giaTri = InputHelper.inputNumber("Nhap gia tri ", "Sai");
    }

    public SoHoc(int giaTri) {
        this.giaTri = giaTri;
    }

    public String inThongTin() {
        return "GiaTri: " + giaTri;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isLaSoChan() {
        return laSoChan;
    }

    public void setLaSoChan(boolean laSoChan) {
        this.laSoChan = laSoChan;
    }

    public boolean isLaSoNT() {
        return laSoNT;
    }

    public void setLaSoNT(boolean laSoNT) {
        this.laSoNT = laSoNT;
    }

    public boolean isLaSoDoiXung() {
        return laSoDoiXung;
    }

    public void setLaSoDoiXung(boolean laSoDoiXung) {
        this.laSoDoiXung = laSoDoiXung;
    }
}
