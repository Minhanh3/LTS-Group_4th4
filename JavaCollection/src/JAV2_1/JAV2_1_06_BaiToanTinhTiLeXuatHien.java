package JAV2_1;

public class JAV2_1_06_BaiToanTinhTiLeXuatHien {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int count = 0;
        System.out.println(a.length);
        for (int n : a) {
            if (n % 2 != 0) {
                count++;
                System.out.print(n);
                if (n < a.length - 1) {
                    System.out.print(" ,");
                }
            }
        }
        // 3 / 6 * 100
        double phanTram = count / (double) a.length * 100 ;
        System.out.println(" Ti le phan tu le la: " + phanTram + " %");
    }
}
