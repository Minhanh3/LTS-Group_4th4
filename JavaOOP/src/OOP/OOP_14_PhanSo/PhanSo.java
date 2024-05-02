package OOP.OOP_14_PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    Scanner sc = new Scanner(System.in);

    public PhanSo() {
        System.out.println("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.println("Nhap mau so: ");
        mauSo = sc.nextInt();
    }

    public String inThongTin() {
        toiGian();
        return "Phan So la : " + tuSo + "/" + mauSo;
    }

    int ucln(int a, int b) {
        int kq = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                kq = i;
            }
        }
        return kq;
    }

    private void toiGian() {
        int a = this.tuSo;
        int b = this.mauSo;
        this.tuSo = this.tuSo / ucln(a, b);
        this.mauSo = this.mauSo / ucln(a, b);
    }

    public static PhanSo congPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        /*
            4*4 + 4*4
            40
            25
         */
        PhanSo res = new PhanSo(1, 1);
        res.tuSo = phanSo1.getTuSo() * phanSo2.getMauSo() + phanSo2.getTuSo() * phanSo1.getMauSo();
        res.mauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
        res.toiGian();
        return res;
    }

    public static PhanSo truPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        PhanSo res = new PhanSo(1, 1);
        res.tuSo = phanSo1.getTuSo() * phanSo2.getMauSo() - phanSo2.getTuSo() * phanSo1.getMauSo();
        res.mauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
        res.toiGian();
        return res;
    }


    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
