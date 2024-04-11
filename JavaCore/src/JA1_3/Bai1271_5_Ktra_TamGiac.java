package JA1_3;

import java.util.Scanner;

public class Bai1271_5_Ktra_TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        System.out.println("Nhap c");
        int c = sc.nextInt();
        int kq = a + b + c;
        if (kq != 180) {
            System.out.println("khong phai la ba goc tam giac");
        } else {
            if (a == 60 && b == 60 && c == 60) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giac can");
            } else if (a == 90 || b == 90 || c == 90) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac Thuong");
            }
        }
    }
}
