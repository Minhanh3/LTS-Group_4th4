package JAV2_1;

import java.util.Arrays;

public class JAV2_1_07_Tim_vitri_DauTien {
    public static void main(String[] args) {
        int a[] = {4,2,1,6,5,7,3} ;
        int b = 7;
        Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("Vị trí đầu tien của b la: " + Arrays.binarySearch(a , b));
    }
}
