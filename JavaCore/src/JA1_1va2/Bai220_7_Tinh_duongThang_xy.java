package JA1_1va2;

import java.util.Scanner;

public class Bai220_7_Tinh_duongThang_xy {
    public static void main(String[] args) {
//        Khoang cach tu diem A( x, y ) den duong thang [a]x + [b]y + [c] =0 la [khoang cach]
//        VD: A[1,2], a=3,b=2,c=1=>Math.abs(a * 1 + b * 2 + c) / Math.sqrt(a * a + b * b)=2.496
//        Khoảng cách từ điểm A(x,y) đến đường thẳng d: ax+by +c =0 la | ( a*x+b*y+c) | / (a^2+b^2)
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        // x
        System.out.println("Nhap x: ");
        double x = sc.nextDouble();
        // y
        System.out.println("Nhap y: ");
        double y = sc.nextDouble();
        double kq = Math.abs((a * x) + (b * y) + c) / Math.sqrt((a * 2) + (b * 2));
        System.out.println("Ket qua là:" + kq);
    }
}
