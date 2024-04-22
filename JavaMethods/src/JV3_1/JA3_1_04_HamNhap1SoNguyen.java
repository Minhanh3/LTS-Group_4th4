package JV3_1;

import java.util.Scanner;

public class JA3_1_04_HamNhap1SoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("Nhap so nguyen :");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (check(a)) {
                    System.out.println("Nhap sai ! Nhap lai");
                }
            }else {
                System.out.println("Nhap sai ! Nhap lai");
                scanner.next();
            }
        }
    }
    public static boolean check(int n) {
        return n < 0 ;
    }
}
