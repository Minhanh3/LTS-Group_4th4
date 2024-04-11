package JAV1_5;

import java.util.Scanner;

public class JAV1_5_08_ChuanHoaChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho&Ten :");
        String n = sc.nextLine();
        String kq = n.trim().toLowerCase().replace(" ","").concat("@hvitclan.vn");
        System.out.println(kq);
    }
}
