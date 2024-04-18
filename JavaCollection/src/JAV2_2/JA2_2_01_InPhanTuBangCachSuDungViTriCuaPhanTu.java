package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_01_InPhanTuBangCachSuDungViTriCuaPhanTu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5)
        );
//        int[] newList = {1, 4, 7, 8, 9, 6, 3, 2, 5};
//        for (int element : newList) {
//            list.add(element);
//        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + "-" +list.get(i) + " , ");
        }
    }
}
