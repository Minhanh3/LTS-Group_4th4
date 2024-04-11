package JA1_4;

import java.util.Scanner;

public class Bai214_15_TichCacUocCua1SoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        int kq = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
                kq *= i;
            }

        }
        System.out.println(kq);
    }
}
