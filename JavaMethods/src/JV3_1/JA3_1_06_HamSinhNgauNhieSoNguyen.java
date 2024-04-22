package JV3_1;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class JA3_1_06_HamSinhNgauNhieSoNguyen {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Gia Tri Ngau Nhien : " + ramdom(a));
    }
    private static int ramdom(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }
}
