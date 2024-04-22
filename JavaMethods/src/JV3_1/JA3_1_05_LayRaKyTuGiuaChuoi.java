package JV3_1;

import java.util.Scanner;

public class JA3_1_05_LayRaKyTuGiuaChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String chuoi = sc.nextLine();
        String output = kTraChuoi(chuoi);
        System.out.println("Ký tự giữa chuỗi là: " + output);
    }

    public static String kTraChuoi(String chuoi) {
        int viTriChuoi = chuoi.length() / 2;
        String kyTuChuoi;
        if (chuoi.length() < 5) {
            System.out.println("Chuoi phai lon hon 5 ky tu");
            return null;
        }
        if (chuoi.length() % 2 == 0) {
            kyTuChuoi = chuoi.substring(viTriChuoi - 1, viTriChuoi + 1);
        } else {
            kyTuChuoi = chuoi.substring(viTriChuoi, viTriChuoi + 1);
        }
        return kyTuChuoi;
    }
}
