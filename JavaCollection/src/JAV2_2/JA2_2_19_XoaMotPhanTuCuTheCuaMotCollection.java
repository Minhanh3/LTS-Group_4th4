package JAV2_2;

import java.util.HashSet;

public class JA2_2_19_XoaMotPhanTuCuTheCuaMotCollection {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Toan");set.add("Ly");set.add("Hoa");set.add("Van");set.add("Anh");
        set.add("Toan Cao Cap");set.add("Sinh Hoa");
        System.out.print("Set : " );
        for ( String n: set
        ) {
            System.out.print(n + " , ");
        }
        System.out.println("");
        System.out.print("Set sau khi xoa: " );
        set.remove("Ly");
        for ( String n: set
             ) {
            System.out.print(n + " , ");
        }
    }
}
