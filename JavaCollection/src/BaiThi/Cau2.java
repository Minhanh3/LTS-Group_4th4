package BaiThi;

import java.util.*;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        char a[] = str.toCharArray();
        Set<Character> lst = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            lst.add(a[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : lst) {
            sb.append(ch);
        }
        String str2 = sb.toString();
        System.out.println(str2);
    }
}
