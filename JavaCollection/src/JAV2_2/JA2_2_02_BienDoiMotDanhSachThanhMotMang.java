package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_02_BienDoiMotDanhSachThanhMotMang {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("Toan","Ly","Hoa","Van","Anh","Toan Cao Cap","Sinh Hoa")
        );
        String[] mang = new String[list.size()];
        list.toArray(mang);
        System.out.print("Array = { ");
        for (String n : list) {
            System.out.print(n + " ,");
        }
        System.out.print(" }");
    }
}
