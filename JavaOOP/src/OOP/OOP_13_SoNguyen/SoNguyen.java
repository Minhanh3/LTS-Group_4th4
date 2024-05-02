package OOP.OOP_13_SoNguyen;

import java.util.Scanner;

public class SoNguyen {
    private int giaTri;
    private boolean laSoChan;
    private boolean laNguyenTo;
    private boolean laSoDoiXung;
    Scanner sc = new Scanner(System.in);

    public SoNguyen() {
        System.out.println("Nhap gia tri :");
        giaTri = sc.nextInt();
        nhapSo(giaTri);
        kiemTraDoiXung(giaTri);
    }

    private void nhapSo(int a) {
        while (true) {
            if (a >= 100) {
                inThongTin();
                break;
            }
            System.out.println("Nhap sai! Nhap lai");
            System.out.println("Nhap gia tri :");
            giaTri = sc.nextInt();
        }
    }

    public static int cong(int a, int b) {
        return a + b;
    }

    private void kiemTraChan(int a) {
        if (a % 2 == 0) {
            laSoChan = true;
        } else {
            laSoChan = false;
        }
    }

    private boolean kiemTraNguyenTo(int a) {
        laNguyenTo = true;
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                laNguyenTo = false;
                break;
            }
        }
        return laNguyenTo;
    }

    private void kiemTraDoiXung(int a) {
        int n = a;
        int reverse = 0;

        while (a != 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }
        if (n == reverse) {
            laSoDoiXung = true;
            System.out.println("La so doi xung");
        } else {
            System.out.println("Khong La so doi xung");
            laSoDoiXung = false;
        }
    }

    public SoNguyen(int giaTri) {
        this.giaTri = giaTri;
    }

    public String inThongTin() {
        return "So Nguyen " + giaTri + (isLaSoChan() ? " CO" : " KHONG") +
                " la so chan Va " + (isLaNguyenTo() ? "CO" : "KHONG") + " la so nguyen to";
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isLaSoChan() {
        kiemTraChan(giaTri);
        return laSoChan;
    }

    public void setLaSoChan(boolean laSoChan) {
        this.laSoChan = laSoChan;
    }

    public boolean isLaNguyenTo() {
        kiemTraNguyenTo(giaTri);
        return laNguyenTo;
    }

    public void setLaNguyenTo(boolean laNguyenTo) {
        this.laNguyenTo = laNguyenTo;
    }

    public boolean isLaSoDoiXung() {
        return laSoDoiXung;
    }

    public void setLaSoDoiXung(boolean laSoDoiXung) {
        this.laSoDoiXung = laSoDoiXung;
    }
}
