package JAV2_1;

public class JAV2_1_13_BaiToanKiemTraTinhChatMang {
    public static void main(String[] args) {
        int a[] = {1, 7, 2, 6, 3, 9};
        int kqTang = 0;
        int kqGiam = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                kqGiam++;
            } else if (a[i] < a[i + 1]) {
                kqTang++;
            }
        }
        if (kqTang == a.length - 1) {
            System.out.println("Bien tang");
        } else if (kqGiam == a.length - 1) {
            System.out.println("Bien giam");
        } else {
            System.out.println("Bien hon don");
        }
    }
}
