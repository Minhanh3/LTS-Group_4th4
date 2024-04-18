package JAV2_1;

import java.util.ArrayList;
import java.util.List;

public class JAV2_1_11_BaiToanSapXep1 {
    public static void main(String[] args) {
        int a[] = {4, 3, 5, 1, 6, 8, 2};
        int n = a.length;
        // Sử dụng thuật toán nổi bọt để sắp xếp mảng
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Sắp xếp phần tử chẵn tăng dần
                if (a[i] % 2 == 0 && a[j] % 2 == 0 &&
                    a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                // Sắp xếp phần tử lẻ giảm dần
                if (a[i] % 2 != 0 && a[j] % 2 != 0 &&
                    a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // Hiển thị mảng đã sắp xếp ra màn hình
        System.out.print("a[] = {");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("}");
        List<Integer> lst = new ArrayList<>();
        for (int num : a) {
            if (num % 2 == 0) {
                lst.add(num);
            }
        }
        for (int num : a) {
            if (num % 2 != 0) {
                lst.add(num);
            }
        }
        System.out.println(lst);
    }
}
