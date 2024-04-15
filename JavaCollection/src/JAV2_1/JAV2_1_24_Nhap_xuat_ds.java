package JAV2_1;

import java.util.Scanner;

public class JAV2_1_24_Nhap_xuat_ds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int soPhanTu = sc.nextInt();
        int a[] = new int[soPhanTu];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap phan tu thu:" + i);
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
