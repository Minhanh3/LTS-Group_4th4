package JA1_4;

import java.util.Scanner;

public class Bai1280_12_TichSoChinhPhuong_NOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        int largestOddDivisor = -1;
        // Kiểm tra a là số chẵn
        if (a % 2 == 0) {
            int b = a - 1; // b = 49 a = 50
            // Tìm ước số lẻ lớn nhất của a
            for (int i = b; i >= 1; i -= 2) { // gán i = 49
                if (a % i == 0 && i % 2 != 0) { //
                    largestOddDivisor = i; // Lưu giá trị ước số lẻ lớn nhất của a
                    break; // Thoát khỏi vòng lặp vì đã tìm được ước số lẻ lớn nhất
                }
            }
        } else {
            System.out.println("Lỗi Nhập " + a); // Hiển thị thông báo lỗi nếu a không phải số chẵn
            return; // Kết thúc chương trình
        }
        // Hiển thị kết quả
        if (largestOddDivisor != -1) {
            System.out.println("Ước số lẻ lớn nhất của a là: " + largestOddDivisor);
        } else {
            System.out.println("Không tồn tại ước số lẻ của a.");
        }
    }
}
