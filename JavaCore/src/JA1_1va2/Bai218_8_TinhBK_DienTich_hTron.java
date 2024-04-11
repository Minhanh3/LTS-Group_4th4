package JA1_1va2;

import java.util.Scanner;

public class Bai218_8_TinhBK_DienTich_hTron {
    public static void main(String[] args) {
//        VD: Nhập bán kính: 3.0 => S =  28.26, C = 18.84
//        Diện tích hình tròn: S = Pi * R * R
//        Bán kính hình tròn: C = 2* PI *R
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ban Kinh :");
        double r = sc.nextDouble();
        double Pi = 3.14;
        // lam sao lay 2 so sau dau phay ah
        double s = Pi * r * r;
        double c = 2 * Pi * r;
        System.out.println("Dien tich: " + s + " Ban kinh: " + c);
    }
}
