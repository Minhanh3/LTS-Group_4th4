package Ktra;

import java.util.*;

public class Cau2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        List<Integer>[] arr = new List[n];
        NhapMang(arr, n);
        SapXepMang(arr, n);
        System.out.println("Mang ban dau:");
        for (List<Integer> lst : arr) {
            System.out.print(lst);
        }
        System.out.println();
        System.out.println("Mang sau khi sxep:");
        for (List<Integer> lst : arr) {
            System.out.print(lst);
        }
    }

    static List<Integer> NhapDanhSach() {
        List<Integer> lst = new ArrayList<>();
        System.out.println("Nhap so luong phan tu cua danh sach:");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua danh sach:");
            lst.add(sc.nextInt());
        }
        return lst;
    }

    static void NhapMang(List<Integer>[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua mang:");
            a[i] = NhapDanhSach();
        }
    }
    //Tinh TBC cua Danh Sach

    static double TinhTBCDanhSach(List<Integer> lst) {
        int Tong = 0;
        for (Integer i : lst) {
            Tong += i;
        }
        return Tong * 1.0 / lst.size();
    }

    //Mang:
    // [1,2,3] tbc = 2
    //[1 , 2] tbc = 1.5
    // [1,3,6] tbc = 3.33
    static void SapXepMang(List<Integer>[] a, int n) {
        List<Integer> temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (TinhTBCDanhSach(a[i]) < TinhTBCDanhSach(a[j])) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
