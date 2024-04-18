package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_07_TimVitriDauVaCuoiTrongList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Cam", "Quyt", "Mit",
                "Dua", "Dua", "Le", "Tao", "Oi"));
        System.out.println("Vị trí đầu tiên và cuối cùng của phần tử \"Dua\" lần lượt là "+ list.indexOf("Dua") + " và " +list.lastIndexOf("Dua"));
    }
}
