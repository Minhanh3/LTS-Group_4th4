package JA3_2;

import java.util.Scanner;

public class JA3_2_02_GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        int a = sc.nextInt();
        System.out.println("Nhap b : ");
        int b = sc.nextInt();
        System.out.println("Nhap c : ");
        int c = sc.nextInt();
        tinhDelta(a, b, c);
    }
    public static void tinhDelta(int a, int b, int c) {
        int delta = ((b * b) - 4 * (a * c));
        if (delta > 0) {
            double x = (-b + Math.sqrt(delta)) / 2 * a;
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Phuong trinh co 2 No " + "\n x1 la " + x
                    + "\n x2 la " + x1);
        } else if (delta < 0) {
            System.out.println("Phuong trinh vo No");
        }
    }
}
