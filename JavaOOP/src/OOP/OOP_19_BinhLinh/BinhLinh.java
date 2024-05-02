package OOP.OOP_19_BinhLinh;

import java.util.Scanner;

public class BinhLinh {
    private String ten;
    private int sucManh = 50;
    private boolean trangBi;
    Scanner sc = new Scanner(System.in);

    public BinhLinh() {
        System.out.println("Nhap binh linh");
        ten = sc.nextLine();
        inThongTin();
        System.out.println();
    }

    public BinhLinh(String ten) {
        this.ten = ten;
    }

    public BinhLinh(String ten, int sucManh) {
        this.ten = ten;
        this.sucManh = sucManh;
    }

    public static void chienDau(BinhLinh binhLinh, BinhLinh binhLinh1) {
        System.out.println("Chiến đấu giữa " + binhLinh.getTen() + " và " + binhLinh1.getTen());
        if (binhLinh.getSucManh() > binhLinh1.getSucManh()) {
            System.out.println(binhLinh.getTen() + " Thắng");
        } else {
            System.out.println(binhLinh1.getTen() + " Thắng");
        }
    }

    public String inThongTin() {
        return "Ten " + this.ten + " co suc manh " + Math.floor(tinhSucManh(getTen()));
    }

    private double tinhSucManh(String ten) {
        double smnew = 0;
        if (ten.equals("linh")) {
            smnew = sucManh * 1.1;
        } else if (ten.equals("cung thu")) {
            smnew = sucManh * 1.3;
        } else if (ten.equals("kiem si")) {
            smnew = sucManh * 1.5;
        } else if (ten.equals("dau si")) {
            smnew = sucManh * 1.7;
        }
        return smnew;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public boolean isTrangBi() {

        return trangBi;
    }

    public void setTrangBi(boolean trangBi) {
        this.trangBi = trangBi;
    }
}
