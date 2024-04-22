package JA3_2;

import java.util.Scanner;

public class JA3_2_04_TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        int a = sc.nextInt();
        System.out.println("Nhap b : ");
        int b = sc.nextInt();
        System.out.println("Nhap c : ");
        int c = sc.nextInt();
        min(a, b, c);
    }
    public static void min(int a, int b, int c) {
        if (c > a || c > b) {
            System.out.println("Min = " + Math.min(a, b));
        } else {
            System.out.println("Min = " + Math.min(c, b));
        }
    }
}
