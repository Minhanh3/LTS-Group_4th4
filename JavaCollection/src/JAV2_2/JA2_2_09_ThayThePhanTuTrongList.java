package JAV2_2;

public class JA2_2_09_ThayThePhanTuTrongList {
    public static void main(String[] args) {
        String chuoi = "one Two three Four five six one three Four";
        String thaythe = chuoi.replaceAll("one" , "ten");
        System.out.println("Danh sách chuỗi sau khi thay thế: " +thaythe);
        //"ten Two three Four five six ten three Four"
    }
}
