package JAV2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JA2_2_10_TimMin_MaxinList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 1111, 9, 6, 3, 2, 5));
        System.out.println("Min = "+ Collections.min(list));
        System.out.println("Max = "+ Collections.max(list));
    }
}
