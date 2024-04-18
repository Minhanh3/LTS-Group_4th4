package JAV2_2;

import java.util.HashSet;

public class JA2_2_25_ThemToanBoPhanTuMapThuNhatSangMapThuHai {
    public static void main(String[] args) {
        HashSet<String> map1 = new HashSet<>();
        map1.add("K, V:");
        map1.add("1 - Red, 2 - Green, 3 - Blue");
        HashSet<String> map2 = new HashSet<>();
        map2.add("K, V:");
        map2.add("4 - White, 5 - Black, 6 - Orange");
        map2.addAll(map1);
        System.out.print("Map 2 : ");
        for (String n : map2) {
            System.out.print(n + " ");
        }
    }
}
