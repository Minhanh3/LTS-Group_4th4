package JV3_1;

import java.util.*;

public class JA3_1_12_NhapMang_SapXep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan tu : ");
        int phanTu = sc.nextInt();
        Integer[] arr = new Integer[phanTu];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        sapXep(list);
        System.out.println(list);
    }

    public static List<Integer> sapXep(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
