package JAV2_2;

import java.util.HashMap;
import java.util.Map;

public class JA2_2_27_KiemTra1KeyIsEmptyInMap {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1 , "Red");map.put(2 , "Green");map.put(3 , "Blue");
        if (!map.containsKey(4)) {
            System.out.println("Khong co key 4");
        }else {
            System.out.println("Co key 4");
        }
    }
}
