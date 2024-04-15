package JAV2_1;

public class JAV2_1_08_TimSoDauTienTrongMangChiaHetCho10 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                System.out.println("So dau tien trong mang la boi cua 10 la: " + a[i] + " vi tri la " + i);
                return;
            }
        }
        System.out.println("Khong co so nao la boi cua 10");
    }
}
