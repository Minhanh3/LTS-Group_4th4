package JAV2_2;

import java.util.HashSet;
import java.util.Set;

public class JA2_2_21_XoaPhanTuTrongSet {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);setA.add(3);setA.add(5);setA.add(7);
        System.out.println("SetA trước khi xóa 1Ptu "+ setA);
        setA.remove(5);
        System.out.println("SetA sau khi xóa 1Ptu "+ setA);
        //
        Set<Integer> setB = new HashSet<>();
        setB.add(2);setB.add(3);setB.add(4);setB.add(7);
        // remove A ở set b
        setA.removeAll(setB);
        System.out.println("Khi xóa setB có ở setA "+ setA);
        setA.clear();
        System.out.println("SetA khi clear: " +setA);
    }
}
