package JV3_1;

import java.util.Locale;
import java.util.Scanner;

public class JA3_1_08_ChuanHoaChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String chuoi = sc.nextLine();
        String ch =  chuoiChuanHoa(chuoi);
        System.out.println(ch);
    }
    private static String chuoiChuanHoa(String str){
        StringBuilder result = new StringBuilder();
        String chuoi = str.trim().replaceAll("\\s+" , " ");
        String cCaiDau = chuoi.substring(0 , 1).toUpperCase();
        String hChinh = chuoi.substring(1).toLowerCase();
        result.append(cCaiDau).append(hChinh).append(" ");
        return result.toString();
    }
}
