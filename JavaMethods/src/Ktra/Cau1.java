package Ktra;

import java.util.*;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan Tu : ");
        String[] lst = {"manhsd", "manh", "ducmanh", "nguyenmanh"};
        int phanTu = sc.nextInt();
        sc.nextLine();
        sapXepDanhSach(lst);
//        vietHoaDenN(phanTu);
//        inDanhSach(lst);
    }

    public static void vietHoaDenN(int phanTu) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[phanTu];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap chuoi thu " + i);
            arr[i] = sc.nextLine();
            if (arr[i].length() < phanTu) {
                String anew = arr[i].toUpperCase();
                System.out.println("Danh sach duoc viet hoa : " + anew);
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Danh sach moi do la :" + list);
    }

    public static void sapXepDanhSach(String[] lst) {
        System.out.print("Danh sach lst : ");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i < lst.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        Arrays.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println("Danh sach da sap xep : " + Arrays.toString(lst));
    }

    public static void inDanhSach(String[] lst) {
        System.out.print("Danh sach lst : ");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i < lst.length - 1) {
                System.out.print(" , ");
            }
        }
    }
}
