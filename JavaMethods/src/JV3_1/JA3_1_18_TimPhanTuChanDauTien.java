package JV3_1;

public class JA3_1_18_TimPhanTuChanDauTien {
    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 8, 9, 6, 3, 2, 5 };
        timPhanTuChan(a);
    }
    private static void timPhanTuChan(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Phần tử chẵn đầu tiên = " + a[i]);
                break;
            }
        }
    }
}
