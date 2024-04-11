package JA1_3;

import java.util.Scanner;

public class Bai1273_7_KtraChieuCao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        int a = sc.nextInt();
        if (a < 145) {
            System.out.println(a + " Chieu cao RAT LUN");
        } else if (a < 150) {
            System.out.println(a + " Chieu cao LUN");
        } else if (a < 170) {
            System.out.println(a + " Chieu cao BINH THUONG");
        } else if (a < 180) {
            System.out.println(a + " Chieu cao CAO");
        } else {
            System.out.println(a + " Chieu cao RAT CAO");
        }
    }
}
