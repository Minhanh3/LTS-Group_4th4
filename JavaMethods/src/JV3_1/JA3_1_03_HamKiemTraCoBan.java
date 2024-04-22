package JV3_1;

public class JA3_1_03_HamKiemTraCoBan {
    private static boolean laSoChinhPhuong(int n) {
        double kq = Math.sqrt(n);
        return (kq - Math.floor(kq) == 0);
    }

    public static void main(String[] args) {
        if (laSoChinhPhuong(5)) {
            System.out.println("Dung");
        } else {
            System.out.println("Sai");
        }
    }
}
