package JA1_3;

import java.util.Scanner;

public class Bai223_2_XepLoaijHocLuc {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap Toan: ");
        int a = sc.nextInt();
        System.out.println("Nhap Van: ");
        int b = sc.nextInt();
        System.out.println("Nhap Anh: ");
        int c = sc.nextInt();
        float dtb = (a + b +c) / 3;
        System.out.println("Diem Trung Binh : " + dtb + " => ");
        if (dtb <= 4) {
            System.out.println("Hoc luc YEU");
        } else if (dtb <= 6.5) {
            System.out.println("Hoc luc Trung bình");
        } else if (dtb <= 8) {
            System.out.println("Hoc luc Khá");
        } else if (dtb <= 9) {
            System.out.println("Hoc luc Giỏi");
        }else {
            System.out.println("Hoc luc Xuất sắc");
        }
    }
}
