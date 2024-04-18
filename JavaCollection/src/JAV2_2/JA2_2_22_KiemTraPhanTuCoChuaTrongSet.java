package JAV2_2;

import java.util.HashSet;

public class JA2_2_22_KiemTraPhanTuCoChuaTrongSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Cam");
        set.add("Quyt");
        set.add("Mit");
        set.add("Dua");
//        set.add("Hvit");
        if (set.contains("Hvit")) {
            System.out.println("Co trong Set");
        } else {
            System.out.println("Khong Co trong Set");
        }
    }
}
