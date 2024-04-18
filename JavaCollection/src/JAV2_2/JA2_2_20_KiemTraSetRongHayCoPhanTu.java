package JAV2_2;

import java.util.HashSet;

public class JA2_2_20_KiemTraSetRongHayCoPhanTu {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Cam");set.add("Quyt");
        if (set.isEmpty()) {
            System.out.println("Set rong");
        }else {
            System.out.println("Set co phan tu");
        }
    }
}
