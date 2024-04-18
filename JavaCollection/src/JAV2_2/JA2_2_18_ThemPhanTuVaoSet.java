package JAV2_2;

import java.util.HashSet;

public class JA2_2_18_ThemPhanTuVaoSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        int[] n =
        set.add(4);set.add(2);set.add(3);set.add(4);
        set.add(7);set.add(6);set.add(5);set.add(5);
        System.out.print("Set A: [ " );
        for ( int n: set) {
            System.out.print(n + " , ");
        }
        System.out.print(" ] " );
    }
}
