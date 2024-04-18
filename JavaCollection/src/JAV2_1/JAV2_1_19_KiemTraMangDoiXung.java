package JAV2_1;

public class JAV2_1_19_KiemTraMangDoiXung {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int count = 0;
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[n - i - 1]) {
                count++;
            }
        }

    }
}
