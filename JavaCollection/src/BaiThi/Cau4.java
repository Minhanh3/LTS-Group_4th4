package BaiThi;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Nhap phan tu so");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu so : " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int kq = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = kq;
                }
            }
        }
        System.out.print("result = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
