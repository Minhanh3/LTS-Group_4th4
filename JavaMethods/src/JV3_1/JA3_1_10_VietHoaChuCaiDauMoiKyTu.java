package JV3_1;

import java.util.Scanner;

public class JA3_1_10_VietHoaChuCaiDauMoiKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        String name = sc.nextLine();
        System.out.println("Name chưa chuẩn hóa : " + name);
        String doneChuanHoa = chuanHoa(name);
        System.out.println("Name sau chuẩn hóa : " + doneChuanHoa);
    }

    public static String chuanHoa(String names) {
        String ch = names.trim().replaceAll("\\s+", " ");
        StringBuilder builder = new StringBuilder();
        String[] chuoi = ch.split(" ");
        for (String c : chuoi) {
            String hChuDau = c.substring(0, 1).toUpperCase();
            String cSau = c.substring(1).toLowerCase();
            builder.append(hChuDau).append(cSau).append(" ");
            System.out.println(hChuDau + cSau);
        }
        return builder.toString();
    }
}
