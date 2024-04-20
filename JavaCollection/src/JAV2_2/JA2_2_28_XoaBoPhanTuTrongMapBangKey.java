package JAV2_2;

import java.util.HashMap;
import java.util.Map;

public class JA2_2_28_XoaBoPhanTuTrongMapBangKey {
    public static void main(String[] args) {
        Map<Integer, String> Hm = new HashMap<>();
        Hm.put(1, "Red");
        Hm.put(2, "Green");
        Hm.put(3, "Blue");
        System.out.println("Hm : " + Hm);
        Hm.remove(1);
        System.out.println("HM sau khi xóa phần tử có key = 1: " + Hm);
    }
}
