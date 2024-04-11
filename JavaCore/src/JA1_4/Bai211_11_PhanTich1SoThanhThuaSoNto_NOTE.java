package JA1_4;

import java.util.Scanner;

public class Bai211_11_PhanTich1SoThanhThuaSoNto_NOTE {
    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean laSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();//60
        System.out.print("Tất cả các thừa số nguyên tố của " + n + " là: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && laSoNguyenTo(i)) {
                System.out.print(i + " ");// 2 2 3 5
                n /= i;
            }
        }
        sc.close();
    }
}
