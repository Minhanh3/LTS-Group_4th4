package OOP.OOP_15_DongHo;

import java.util.Scanner;

public class DongHo {
    private int gio;
    private int phut;
    private int giay;
    private boolean laBuoiSang;
    Scanner sc = new Scanner(System.in);

    public DongHo() {
        System.out.println("Nhap Gio: ");
        gio = sc.nextInt();
        nhapGio();
        System.out.println("Nhap Phut: ");
        phut = sc.nextInt();
        nhapPhut();
        System.out.println("Nhap Giay: ");
        giay = sc.nextInt();
        nhapGiay();
    }

    public DongHo(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public String layThongTin() {
        return gio + " gio " + phut + " phut " + giay + " giay " + " Bay gio la buoi : " + (isLaBuoiSang() ? "Buoi Sang " : "Buoi chieu , Toi");
    }

    public String layKhoangThoiGian(DongHo dongHo) {
        int gios = Math.abs(this.gio - dongHo.getGio());
        int phuts = Math.abs(this.phut - dongHo.getPhut());
        int giays = Math.abs(this.giay - dongHo.getGiay());
        return gios + " gio: " + phuts + " phut: " + giays + " giay ";
    }

    private void nhapGio() {
        while (true) {
            if (gio <= 24) {
                layThongTin();
                break;
            }
            System.out.println("Sai! nhap lai Gio");
            gio = sc.nextInt();
        }
    }

    private void nhapPhut() {
        while (true) {
            if (phut <= 60) {
                layThongTin();
                break;
            }
            System.out.println("Sai! nhap lai Phut");
            phut = sc.nextInt();
        }
    }

    private void nhapGiay() {
        while (true) {
            if (giay <= 60) {
                layThongTin();
                break;
            }
            System.out.println("Sai! nhap lai Giay");
            giay = sc.nextInt();
        }
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    public boolean isLaBuoiSang() {
        if (gio <= 13) {
            laBuoiSang = true;
        } else {
            laBuoiSang = false;
        }
        return laBuoiSang;
    }

    public void setLaBuoiSang(boolean laBuoiSang) {
        this.laBuoiSang = laBuoiSang;
    }
}
