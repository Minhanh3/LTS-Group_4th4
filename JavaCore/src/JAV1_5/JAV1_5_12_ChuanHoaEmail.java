package JAV1_5;

import java.util.Scanner;

public class JAV1_5_12_ChuanHoaEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho&ten: ");
        String n = sc.nextLine();
        String a = n.trim().toLowerCase().replace(" " ,"").concat("@hvitclan.vn");
        System.out.println(a);
    }
}
