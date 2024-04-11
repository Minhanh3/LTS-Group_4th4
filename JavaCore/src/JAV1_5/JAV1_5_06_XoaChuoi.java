package JAV1_5;

public class JAV1_5_06_XoaChuoi {
    public static void main(String[] args) {
        String str = "Hello Java ,Hello HvitClan" ;
        StringBuilder str1 = new StringBuilder(str);

        System.out.println(str1.delete(0 , 12));
        System.out.println();
//        System.out.println(str.substring(12 , 26));
    }
}
