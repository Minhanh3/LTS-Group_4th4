package JAV2_2;

import java.util.*;

public class JA2_2_24_TimTapHopGiaoCua2tapHop {
    public static void main(String[] args) {
//        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 5, 0, 6, 7));
//        List<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 9, 7, 5, 3, 8));
        int[] arr1 = {1, 2, 5, 0, 6, 7};
        int[] arr2 = {0, 9, 7, 5, 3, 8};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for ( int n: arr1) {
            set1.add(n);
        }for ( int n: arr2) {
            set2.add(n);
        }
        System.out.println("Set 1 : " +set1);
        System.out.println("Set 2 : " +set2);
        set1.retainAll(set2);
        System.out.println("Tập hợp giao của hai tập hợp: " + set1);
    }
}
