package JAV2_1;

public class JAV2_1_11_BaiToanSapXep1 {
    public static void main(String[] args) {
        int a[] = {4, 3, 5, 1, 6, 8, 2};
        int n = a.length;
        // Sử dụng thuật toán nổi bọt để sắp xếp mảng
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Sắp xếp phần tử chẵn tăng dần
                if (a[j] % 2 == 0 && a[j + 1] % 2 == 0 && a[j] > a[j + 1] && a[i] % 2 ==0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                // Sắp xếp phần tử lẻ giảm dần
                else if (a[j] % 2 != 0 && a[j + 1] % 2 != 0 && a[j] < a[j + 1] && a[i] % 2 !=0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
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

    }
}
