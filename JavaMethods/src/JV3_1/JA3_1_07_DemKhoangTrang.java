package JV3_1;

public class JA3_1_07_DemKhoangTrang {
    public static void main(String[] args) {
        String hoten = " Tran Van A ";
        int count = 0;
        for (int i = 0; i < hoten.length(); i++) {
            if (hoten.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Chuoi co : " + count + " Khoang Trang");
    }
}
