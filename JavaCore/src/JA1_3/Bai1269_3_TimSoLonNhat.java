package JA1_3;

import java.util.Scanner;

public class Bai1269_3_TimSoLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        System.out.println("Nhap b:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a lon hon b");
        }else {
            System.out.println("b lon hon a");
        }
    }
}
