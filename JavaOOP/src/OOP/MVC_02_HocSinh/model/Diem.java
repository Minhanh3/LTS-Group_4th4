package OOP.MVC_02_HocSinh.model;

import OOP.MVC_02_HocSinh.lib.InputHelper;

public class Diem
{
    private int maHS;
    private int maMh;
    private double diem;

    public Diem(int MaHS, int MaMH) {
        maHS = MaHS;
        maMh = MaMH;
        diem = InputHelper.inputDiem("Nhap diem", "Sai");
    }

    public void inThongTin() {
//        System.out.println("Ma hs: " + maHS);
//        System.out.println("Ma mon hoc: " + maMh);
        System.out.println("Diem: " + diem);
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public int getMaMh() {
        return maMh;
    }

    public void setMaMh(int maMh) {
        this.maMh = maMh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
