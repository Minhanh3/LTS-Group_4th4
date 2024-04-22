package JA3_2;

public class JA3_2_03_KhaiBaoDanhSach {
    public static void main(String[] args) {
        String[] lst = {"123", "345", "qwe"};
        result(lst);
    }

    public static void result(String[] lst) {
        System.out.print("result = {");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i < lst.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" }");
    }
}
