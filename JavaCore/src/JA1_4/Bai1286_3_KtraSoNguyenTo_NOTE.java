package JA1_4;

import java.util.Scanner;

public class Bai1286_3_KtraSoNguyenTo_NOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        boolean kt = true;
        if (n < 2 ) {
            kt = false;
            System.out.println(kt);
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                kt = false;
                System.out.println(kt);
                return;
            }
        }
        System.out.println(kt);
    }
}
