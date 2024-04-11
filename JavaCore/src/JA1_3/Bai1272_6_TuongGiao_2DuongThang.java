package JA1_3;

import java.util.Scanner;

public class Bai1272_6_TuongGiao_2DuongThang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a1:");
        int a1 = sc.nextInt();
        System.out.println("Nhap a2:");
        int a2 = sc.nextInt();
        System.out.println("Nhap b1:");
        int b1 = sc.nextInt();
        System.out.println("Nhap b2:");
        int b2 = sc.nextInt();
        if (a1 * a2 == -1) {
            System.out.println("2 duong thang vuong goc");
        } else if (a1 != a2) {
            System.out.println("2 duong thang cat nhau");
        } else if (a1 == a2 && b1 != b2) {
            System.out.println("2 duong thang song song");
        }else {
            System.out.println("2 duong thang trung nhau");
        }
    }
}
