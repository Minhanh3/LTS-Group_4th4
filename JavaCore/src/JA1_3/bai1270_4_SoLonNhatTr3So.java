package JA1_3;

import java.util.Scanner;

public class bai1270_4_SoLonNhatTr3So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        System.out.println("Nhap c:");
        int c = sc.nextInt();

        int kq = a;

        if (b > kq) {
            kq = b;
        } else if (c > kq) {
            kq = c;
        }
            System.out.println("So lon Nhat la: " + kq);
    }
}
