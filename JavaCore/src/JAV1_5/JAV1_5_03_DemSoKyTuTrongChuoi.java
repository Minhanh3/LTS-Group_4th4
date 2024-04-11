package JAV1_5;

public class JAV1_5_03_DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "abracadabra";
        char r = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // lấy ký tự thứ nhất so sánh với r
            if (str.charAt(i) == r) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("y tu tren khong ton tai trong chuoi");
        }else {
            System.out.println("a co " + count + " ky tu");
        }
    }
}
