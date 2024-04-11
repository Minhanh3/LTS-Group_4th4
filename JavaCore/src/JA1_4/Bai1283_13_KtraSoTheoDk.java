package JA1_4;

import java.util.Scanner;

public class Bai1283_13_KtraSoTheoDk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0){
            sum += a % 10 ;
            a /= 10;
        }
        if (sum % 3 == 0) {
            System.out.println("Chia het cho 3");
        } else {
            System.out.println("Không Chia het cho 3");
        }
    }
}
