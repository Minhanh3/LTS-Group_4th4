package JA1_1va2;

import java.util.Scanner;

public class Bai191_6_NhapvaOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a b c :");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        boolean t = sc.nextBoolean();// true || false
        String d = String.valueOf(a);
        String q = String.valueOf(b);
        String y = String.valueOf(c);
        String e = String.valueOf(t);
        System.out.println(d + q + y + e);

    }
}
