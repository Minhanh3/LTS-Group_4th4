package JA1_4;

import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int tong = 0;
//        while lặp liên tục
        //        while(n!=0){
//            int kq = n % 10;
//            tong=tong+kq;
//            n=n/10;
//        }
        // dùng for khi biết trước bao nhieu số
        for (int i = n; i != 0; i = i / 10) {
            int kq = i % 10;
            tong = tong + kq;
        }
    }
}
