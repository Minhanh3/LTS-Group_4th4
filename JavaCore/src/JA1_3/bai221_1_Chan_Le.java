package JA1_3;

import java.util.Scanner;

public class bai221_1_Chan_Le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println( a + " La So Chan");
        }else {
            System.out.println(a + " la So Le");
        }
    }
}
