package JA1_4;

import java.util.Scanner;

public class Bai1279_14_KtraSole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a;
        a = sc.nextInt();
//        boolean check = true;
        while (a > 0) {
            int sonew = a % 10;
            if (sonew % 2 == 0) {
                System.out.println("So kp toan le");
//                check = false;
                break;
            }
            a = a / 10;
        }
//        if (check == false)
//        else
            System.out.println("Số toàn lẻ");
    }
}
