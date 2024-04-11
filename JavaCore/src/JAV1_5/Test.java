package JAV1_5;

public class Test {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "0987";
        String regex = "^[0-9]+$";
        if (str1.matches(regex)){
            System.out.println("Đúng");
        }else {
            System.out.println("Sai");
        }
    }
}
