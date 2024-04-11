package JA1_4;

import java.util.Scanner;

public class Bai1285_9_KtraSoGiamDan_NOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();// 876
        int soOld = n % 10;// % 10 = 6
        n = n / 10; // gán n = 876 / 10  = 87
        boolean kq = true;
        while (n > 0) {
            int anew = n % 10; // anew 87 % 10 = 7
//            anew = 7 <= 6 old
            if (anew <= soOld) { // So sánh với chữ số trước đó
                kq = false; // Nếu không giảm dần, gán kq = false
                break; // Thoát khỏi vòng lặp if
            }
            soOld = anew; // gán soOld = 7 ; anew = 7 ;
            n = n / 10; // Loại bỏ chữ số cuối cùng
        }

        System.out.println(kq); // In ra kết quả kiểm tra
    }
}
