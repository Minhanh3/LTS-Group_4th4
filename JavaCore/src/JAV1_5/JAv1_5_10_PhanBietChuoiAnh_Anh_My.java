package JAV1_5;

public class JAv1_5_10_PhanBietChuoiAnh_Anh_My {
    public static void main(String[] args) {
        String str = "School is the bored place. So you should go to the game centre. It is funny and very\n" +
                "good for relaxing.sss";
        char st = 's';
        char ts = 't';
        int st1 = 0;
        int ts1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == st) {
                st1++;
            } else if (str.charAt(i) == ts) {
                ts1++;
            }
        }
        System.out.println(st1);
        System.out.println(ts1);
        if (st1 > ts1) {
            System.out.println("Anh-Anh");
        } else {
            System.out.println("Anh-My");
        }
    }
}
