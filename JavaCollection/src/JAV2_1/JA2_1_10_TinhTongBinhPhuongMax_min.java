package JAV2_1;

public class JA2_1_10_TinhTongBinhPhuongMax_min {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int min = a[0];
        int max = a[0];
        for (int n : a) {
            if (n < min) {
                min = n;
            } else if ( n > max) {
                max = n;
            }
        }
        int tong = (min*min) + (max*max);
        System.out.println("So Nho nhat la:" + min);
        System.out.println("So Lon nhat la:" + max);
        System.out.println("Tong binh phuong 2 so la :" + tong);
    }
}
