package JA1_4;

import java.util.Scanner;

public class Bai1278_5_TimUocLeLNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        int kq = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && i % 2 == 1) {
                if (i > 0) {
                    kq = i;
                }
//                System.out.println(kq);
            }
        }
        System.out.println(kq);
    }
}