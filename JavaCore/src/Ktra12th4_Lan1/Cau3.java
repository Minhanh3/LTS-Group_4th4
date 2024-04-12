package Ktra12th4_Lan1;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
//        System.out.println("Nhap b: ");
//        int b = sc.nextInt();
        int m , dao , dx , d;
        // a = 20
        for (int i = 0; i < a; i++) {
            m = i; // gán m = 0
            dao = 0 ;
            while ( m > 0){
                d = m % 10 ;
                dao = 10 * dao + d ;
                m /= 10;
            }
            // dx = dao(0) == 1 thì la 1 : 0
            dx = (dao == i ? 1 : 0);
            if (dx == 1){
                System.out.println(i);
            }
        }
    }
}
