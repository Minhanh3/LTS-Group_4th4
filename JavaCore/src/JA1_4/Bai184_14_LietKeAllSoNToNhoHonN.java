package JA1_4;

import java.util.Scanner;

public class Bai184_14_LietKeAllSoNToNhoHonN {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " la:");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
