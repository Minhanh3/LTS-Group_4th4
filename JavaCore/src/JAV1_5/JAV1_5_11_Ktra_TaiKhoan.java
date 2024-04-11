package JAV1_5;

import java.util.Scanner;

public class JAV1_5_11_Ktra_TaiKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Account = "nguyendongkhanh@hvitclan.vn";
        String Password = "123456";
        System.out.println("Nhap Account");
        String Acc = sc.nextLine();//nguyendongkhanh
        System.out.println("Nhap Password");
        String Pass = sc.nextLine();//123
        boolean kq = true;
        // contains: su dung
        // equals: so sanh bang. giong nhau ca chu hoa chu thuong
        if (Account.equals(Acc) && Password.equals(Pass)) {
            System.out.println("Tai khoan & Pass Đúng : " + kq);
        } else {
            kq = false;
            System.out.println("Tai khoan & Pass Sai: " + kq);
        }
    }
}
