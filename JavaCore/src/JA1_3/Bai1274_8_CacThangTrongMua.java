package JA1_3;

import java.util.Scanner;

public class Bai1274_8_CacThangTrongMua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang:");
        int a = sc.nextInt();
        switch (a){
            case 1 , 2 , 3:
                System.out.println("Mua Xuan");
                break;
            case 4 , 5 , 6:
                System.out.println("Mua Ha");
                break;
            case 7 , 8 , 9:
                System.out.println("Mua Thu");
                break;
            case 10 , 11 , 12:
                System.out.println("Mua Dong");
                break;
            default:
                System.out.println("Nhap sai");
        }
    }
}
