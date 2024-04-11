package JA1_4;

import java.util.Scanner;

public class Bai1277_4_TongCacuocSoChan_BUG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        int kq = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && i % 2 == 0) {
                kq += i;
            }
        }
        System.out.println("Tong uoc cua " + a + " la " + kq);
    }
}
