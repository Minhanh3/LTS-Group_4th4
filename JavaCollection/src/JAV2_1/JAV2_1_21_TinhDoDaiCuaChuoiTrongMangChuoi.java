package JAV2_1;

public class JAV2_1_21_TinhDoDaiCuaChuoiTrongMangChuoi {
    public static void main(String[] args) {
        String arr[] = {"abc", "abcd", "abcde", "abcdef"};
        int tong[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tong[i] = arr[i].length();
        }
        System.out.print("{ ");
        for (int i = 0; i < tong.length; i++) {
            System.out.print(tong[i]);
            if (i < tong.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
}
