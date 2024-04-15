package JAV2_1;

public class JA2_1_09_ThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        int a[] = {6, 2, 5, 1, 4, 3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán đổi hai phần tử
                    int kq = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = kq;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
