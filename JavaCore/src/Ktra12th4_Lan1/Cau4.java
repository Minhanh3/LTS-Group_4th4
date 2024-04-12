package Ktra12th4_Lan1;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tk = "admin";
        String mk = "admin";
        System.out.println("Nhap tai khoan:");
        String a = sc.nextLine();
        System.out.println("Nhap mat khau:");
        String b = sc.nextLine();
        if (a.equals(tk) && b.equals(mk) ){
            System.out.println("Login success");
        }else if (a.isEmpty() || b.isEmpty()){
            System.out.println("Tai khoan or Mat Khau trong");
        }else {
            System.out.println("Login false");
        }
    }
}
