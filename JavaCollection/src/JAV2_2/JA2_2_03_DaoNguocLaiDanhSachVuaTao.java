package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_2_03_DaoNguocLaiDanhSachVuaTao {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        Collections.reverse(list);
        System.out.println("List T đảo ngược : " +list);
        }
}
