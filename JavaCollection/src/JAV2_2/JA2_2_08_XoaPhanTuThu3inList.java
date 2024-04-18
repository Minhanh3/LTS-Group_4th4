package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_08_XoaPhanTuThu3inList {
    public static void main(String[] args) {
        List<Integer> listC = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        System.out.println("List T sau khi chưa phần tử thứ 3 " + listC);
        listC.remove(3);
        System.out.println("List T sau khi xóa phần tử thứ 3 " + listC);
    }
}
