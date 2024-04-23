package JV3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA3_1_17_XoaPhanTuLe {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        lst(arr);
    }

    public static void lst(Integer[] arr) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Mang khi chua xoa phan tu lẻ : " + lst);
        lst.removeIf(e -> (e % 2) != 0);
        System.out.println("Mang sau khi chua xoa phan tu lẻ : " + lst);
    }
}
