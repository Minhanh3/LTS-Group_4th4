package Ktra12th4_Lan1;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap goc 1:");
        double a = sc.nextDouble();
        System.out.println("Nhap goc 2:");
        double b = sc.nextDouble();
        System.out.println("Nhap goc 3:");
        double c = sc.nextDouble();
        if (a + b > c && c + a > b && b + c > a) {
            System.out.println("3 goc la canh cua tam giac");
        }else {
            System.out.println("3 goc khong phai la canh cua tam giac");
        }
    }
}
