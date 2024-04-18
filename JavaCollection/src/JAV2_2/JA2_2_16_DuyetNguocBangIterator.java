package JAV2_2;

import java.util.*;

public class JA2_2_16_DuyetNguocBangIterator {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
            Integer value = it.next();
            System.out.print(value+ " ");
        }
        System.out.println();
        ListIterator<Integer> litr = c.listIterator(c.size());
        while (litr.hasPrevious()){
            Object value2 = litr.previous();
            System.out.print(value2 + " ");
        }
    }
}
