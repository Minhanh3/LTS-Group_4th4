package JAV2_1;

public class JAV2_1_01_TinhSumCacPhantuCuaMang {
    public static void main(String[] args) {
        int a[] = {1,3,4,5,2,7} ;
        int kq = 0;
        for (int i = 0; i < a.length; i++) {
            kq += a[i];
        }
        System.out.println("Tong cua mang la: " + kq);
    }
}
