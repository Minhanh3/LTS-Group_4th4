package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_2_11_SapXepChuoiInDanhSach {
    public static void main(String[] args) {
        List<String> C = new ArrayList<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi"));
        System.out.println("C trước khi sắp xếp : " +C);
        Collections.sort(C);
        System.out.println("C sau khi sắp xếp : " +C);
    }
}
