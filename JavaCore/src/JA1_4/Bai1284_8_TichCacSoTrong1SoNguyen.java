package JA1_4;

import java.util.Scanner;

public class Bai1284_8_TichCacSoTrong1SoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int tich = 1;
        while (n != 0){
            int tong = n%10;
            tich = tich * tong;
            n = n / 10;
        }
        System.out.println(tich);
    }
}
