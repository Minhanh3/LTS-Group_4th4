package JA1_4;

import java.util.Scanner;

public class Bai1288_10_NhapSoNguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        while (true){
            System.out.println("Nhap a: ");
            a = sc.nextInt();
            if (a <= 0 || a > 100){
                System.out.println("Nhap sai Moi Nhap Lai");
            }else {
                break;
            }
        }
        System.out.println("a la: " + a);
    }
}
