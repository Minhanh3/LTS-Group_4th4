package JAV2_1;

import java.util.Scanner;

public class JAV2_1_15_ChuanHoaChuoiTheoMau_NOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten");
        String hoTen = sc.nextLine().trim().toLowerCase();
        String[] tach = hoTen.split("\\s+");
        String name = tach[tach.length - 1];
        String init = "";
        for (int i = 0; i < tach.length; i++) {
            init += tach[i].charAt(0);
        }
        init = init.toUpperCase();
        String email = name + (init.substring(0, 2)) + "@hvitclan.vn";
        System.out.println("Email la :" + email);
    }
}
