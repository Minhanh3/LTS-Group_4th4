package JA1_4;

import java.util.Scanner;

public class Bai213_7_TinhTongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        int n = 0;
        while (!ok) {
            System.out.println("Nhap n");
            n = sc.nextInt();
            if (n > 0) {
                ok = true;
            } else {
                System.out.println("Nhap n phai lon hon 0");
            }
        }
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / (i * (i + 1));
        }
        System.out.println("Tong S(n) = " + s);

    }
}
