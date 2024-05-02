package JAV2_1;

public class JAV2_1_19_KiemTraMangDoiXung {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int count = 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mang doi xung");
        } else {
            System.out.println("Khong la mang doi xung");
        }
    }
}
