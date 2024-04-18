package JAV2_1;

import java.util.Scanner;

public class JAV2_1_20_BaiTapTongHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int soPhantu = sc.nextInt();
        int a[] = new int[soPhantu];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Phan tu so :" + i);
            a[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Cac phan tu le la: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i]);
            }
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Cac phan tu le la so nguyen to la: ");
        for (int i = 2; i < a.length; i++) {
            if (a[i] % 2 != 0 && isEmpty(a[i])) {
                System.out.print(a[i]);
            }
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Tich cac so nguyen to o vi tri chan la :");
        int sum = 1;
        for (int i = 1; i < a.length; i += 2) {
            if (isEmpty(a[i])) {
                System.out.print(a[i]);
                sum *= a[i];
            }
            if (i < a.length - 1) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + sum);
    }

    public static boolean isEmpty(int num) {
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
}
