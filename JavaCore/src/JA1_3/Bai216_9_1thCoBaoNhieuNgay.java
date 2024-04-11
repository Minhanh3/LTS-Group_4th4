package JA1_3;

import java.util.Scanner;

public class Bai216_9_1thCoBaoNhieuNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int a = sc.nextInt();
        System.out.println("Nhap nam: ");
        int b = sc.nextInt();
        switch (a) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang " + a + " Nam " + b + " Co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + a + " Nam " + b + " Co 30 ngay");
                break;
            case 2:
                if (b % 4 == 0 && b % 100 != 0 || b % 400 == 0) {
                    System.out.println("Thang " + a + " Nam " + b + " La nam nhuan co 29 ngay" );
                } else {
                    System.out.println("Thang " + a + " Nam " + b + " La nam khong nhuan co 28 ngay");
                }
                break;
            default:
                System.out.println("Khong hop le");
        }
    }
}
