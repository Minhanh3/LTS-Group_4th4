package JAV2_2;

import java.util.*;

public class JA2_2_05_XaoTronLai1DanhSach {
    public static void main(String[] args) {
        List<Integer> listT = new ArrayList<>(
                Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5)
        );
        System.out.print("List T : ");
        Collections.shuffle(listT);
        for (int n : listT) {
            System.out.print(n + " , ");
        }
    }
}
