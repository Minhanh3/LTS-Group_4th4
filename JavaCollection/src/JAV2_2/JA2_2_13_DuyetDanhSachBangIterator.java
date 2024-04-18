package JAV2_2;

import java.util.HashSet;
import java.util.Iterator;

public class JA2_2_13_DuyetDanhSachBangIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer value = it.next();
            System.out.print(value + " ");
        }
    }
}
