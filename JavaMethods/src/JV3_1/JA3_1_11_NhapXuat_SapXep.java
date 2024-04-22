package JV3_1;

import java.util.*;

public class JA3_1_11_NhapXuat_SapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan tu : ");
        int phanTu = sc.nextInt();
        Integer[] arr = new Integer[phanTu];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        sapXep(arr);
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }

    public static void sapXep(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int kq = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = kq;
                }
            }
        }
    }
}
