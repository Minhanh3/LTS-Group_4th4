package BaiThi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int phanTu = sc.nextInt();
        String[] lst = new String[phanTu];
        sc.nextLine();
        for (int i = 0; i < lst.length; i++) {
            System.out.println("Phan tu thu : " + i);
            lst[i] = sc.nextLine();
        }
        List<String> lstnew = new ArrayList<>();
        for (int i = 0; i < lst.length ; i++) {
            if (lst.length < phanTu){
                lstnew.add(lst[i].toUpperCase());
            }else {
                lstnew.add(lst[i]);
            }
        }
        System.out.println(lstnew);
    }
}
