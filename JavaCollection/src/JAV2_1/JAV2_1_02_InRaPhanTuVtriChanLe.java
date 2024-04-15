package JAV2_1;

public class JAV2_1_02_InRaPhanTuVtriChanLe {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int n : a) {
            if (n % 2 == 0) {
                System.out.println("Cac phan tu o vi tri chan la:" + n);
            } else {
                System.out.println("Cac phan tu o vi tri le la:" + n);
            }
        }
    }
}
