package JAV1_5;

public class JAV1_5_09_DemSoChuCai_So_KyTu {
    public static void main(String[] args) {
        String str = "Baby, I don't feel so good. 6 words you never understood";
        int chuSo=0 , chuCai =0, kyTu = 0 ;
        for (Character c: str.toCharArray()) {
            if(Character.isDigit(c)){
                chuSo++;
            } else if (Character.isLetter(c)) {
                chuCai++;
            }else {
                kyTu++;
            }
        }
        System.out.println("Chuoi co " + chuSo + " chu so và " + chuCai + " chu cai và " + kyTu + " Ky tu");
    }
}
