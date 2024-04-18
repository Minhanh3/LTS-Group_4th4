package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_SapXepDanhSachChuoi {
    public static void main(String[] args) {
        List<String> listc= new ArrayList<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi"));
        System.out.println("Collection trước khi sắp xếp :" + listc);
        Collections.sort(listc);
        System.out.println("Collection Sau khi sắp xếp :" + listc);
    }
}
