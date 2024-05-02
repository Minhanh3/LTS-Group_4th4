package OOP.OOP_04_SoThuc;

import java.util.Scanner;

public class SoThuc {
    private double giaTri;
    private boolean laSoDuong;
    Scanner sc = new Scanner(System.in);

    public SoThuc() {
        System.out.println("Nhap gia tri:");
        giaTri = sc.nextDouble();
    }

    double canBacN(int n) {
        double kq = Math.pow(this.giaTri, 1.0 / n);
        return kq;
    }

    public static double TimMax(SoThuc a, SoThuc b, SoThuc c) {
        double max = a.getGiaTri();
        if (b.getGiaTri() > max) {
            max = b.getGiaTri();
        }
        if (c.getGiaTri() > max) {
            max = c.getGiaTri();
        }
        return max;
    }

    public SoThuc(double giaTri) {
        this.giaTri = giaTri;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isLaSoDuong() {
        if (giaTri > 0) laSoDuong = true;
        else laSoDuong = false;
        return laSoDuong;
    }

    public void setLaSoDuong() {

    }

    public String inThongTin() {
        return "SoThuc{" +
                "giaTri= " + giaTri +
                ", laSoDuong= " + isLaSoDuong() +
                '}';
    }


}
