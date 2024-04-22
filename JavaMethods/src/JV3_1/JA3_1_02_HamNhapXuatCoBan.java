package JV3_1;

import java.util.Scanner;

public class JA3_1_02_HamNhapXuatCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan tu");
        int a = sc.nextInt();
        nhapXuatMang(a);
    }

    private static void nhapXuatMang(int a) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[a];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap mang thu : " + i);
            mang[i] = sc.nextInt();
        }
        System.out.print("Ta có mảng a : { ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print((mang[i]));
            if (i < mang.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" }");
    }
}
