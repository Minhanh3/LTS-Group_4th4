package JAV2_1;

import java.util.Scanner;

public class JAV2_1_14_KiemTrasoCoPhaiToanChuSoChanKhong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int soPhanTu = sc.nextInt();
        int a[] = new int[soPhanTu];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Phan tu so:" + i);
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Nhung so co toan chu so chan la: " + a[i]);
            }
        }
    }
}
