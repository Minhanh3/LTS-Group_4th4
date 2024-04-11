package JAV1_5;

import java.util.Scanner;

public class JAV1_5_07_UseString_BuilderOrString_Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        //khởi tao StringBui
        StringBuilder chuoi = new StringBuilder(str);
        // đảo ngược chuõi
        chuoi.reverse();
        // cọngo chuôi đã nhập
        chuoi.compareTo(new StringBuilder(str));
        System.out.println(chuoi.append(str));
    }
}
