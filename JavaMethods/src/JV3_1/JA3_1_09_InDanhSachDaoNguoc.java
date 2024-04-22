package JV3_1;

import java.util.*;

public class JA3_1_09_InDanhSachDaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Phan Tu");
        int phanTu = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[phanTu];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Chuoi thu " + i);
            arr[i] = sc.nextLine();
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        System.out.println("Sau khi sap xep : " + daoNguoc(list));
    }
    public static List<String> daoNguoc(List<String> list){
        Collections.reverse(list);
        return list;
    }
}
