package JV3_1;


public class JA3_1_16_TongPhanTuInMang {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        tongMang(a);
    }

    private static void tongMang(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println("Tong cua mang la : " + sum);
    }
}
