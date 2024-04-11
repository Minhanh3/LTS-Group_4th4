package JA1_4;

import java.util.Scanner;

public class Bai185_1_TongChuSo_SoNguyen_NOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int tong = 0;
        while (n != 0) {
            int kq = n % 10;
            tong += kq;
            n = n / 10;
        }
        System.out.println(tong);
    }
}
