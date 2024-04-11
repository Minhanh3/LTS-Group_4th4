package JA1_4;

import java.util.Scanner;

public class Bai186_6_UocSoChungLNBoiSoNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        int ucln = 0;
        int bcnn ;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i ==0){
                ucln = i;
            }
        }
        System.out.println("UCLN của " + a +" va " + b + " La " + ucln);
        bcnn = ( a*b) / ucln ;
        System.out.println("BCNN của " + a +" va " + b + " La " + bcnn);
    }
}
