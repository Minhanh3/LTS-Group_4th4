package JA1_1va2;

public class Bai192_3_Out_Result_9ketQua {
    public static void main(String[] args) {
        int a, b, c;
        a = 54;
        b = 65;
        c = 76;
        double ketQua = Math.sin(a);
        double ketQua1 = Math.pow(a, 2);
        double ketQua2 = Math.sqrt(a);
        double ketQua3 = Math.abs(a);

        double ketQuab = Math.sin(b);
        double ketQuab1 = Math.pow(b, 2);
        double ketQuab2 = Math.sqrt(b);
        double ketQuab3 = Math.abs(b);

        double ketQuac = Math.sin(c);
        double ketQuac1 = Math.pow(c, 2);
        double ketQuac2 = Math.sqrt(c);
        double ketQuac3 = Math.abs(c);

        // sin tính sin | cos tang, pow tính mũ , sqst tính căn bặc 2  , abs tính giá trị tuyệt đối
        System.out.println("a sin: " + ketQua + " a pow: " + ketQua1 + " a sqrt: " + ketQua2 + " a abs: " + ketQua3);
        System.out.println("b sin: " + ketQuab + " b pow: " + ketQuab1 + " b sqrt: " + ketQuab2 + " b abs: " + ketQuab3);
        System.out.println("c sin: " + ketQuac + " c pow: " + ketQuac1 + " c sqrt: " + ketQuac2 + " c abs: " + ketQuac3);

    }
}
