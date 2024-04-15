package JAV2_1;

public class JAV2_1_05_ChiaMangChanLe {
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 3, 2, 5, 6, 8};
        for (int n : a) {
            if (n % 2 == 0) {
                System.out.println("So CHẴN la: " + n + " ");
            } else {
                System.out.print("So LẺ la: " + n + " ");
            }
        }
    }
}
