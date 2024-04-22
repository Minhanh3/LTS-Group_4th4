package JV3_1;

import java.util.Scanner;

public class JA3_1_15_Nhap_HienThiChuoi {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Nhap chuoi :");
        System.out.println("Chuoi vua nhap la : " + nhapChuoi(str));
    }

    public static String nhapChuoi(String str) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }
}
