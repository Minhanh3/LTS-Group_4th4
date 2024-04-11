package JA1_1va2;

import java.util.Scanner;

public class Bai219_4_NhapSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập só nguyên: ");
        int x = sc.nextInt();
        double y = Math.pow(x , 2) + (3 * x) + 2;
        System.out.println("Gia tri Ham so voi x = " + x + " Là : " + y);
    }
}
