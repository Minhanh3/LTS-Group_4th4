package OOP.OOP_15_DongHo;

public class Main {
    public static void main(String[] args) {
        DongHo dongHo1 = new DongHo();
        DongHo dongHo2 = new DongHo();

        System.out.println("Thời gian của đồng hồ 1: " + dongHo1.layThongTin());
        System.out.println("Thời gian của đồng hồ 2: " + dongHo2.layThongTin());

        String khoangThoiGian = dongHo1.layKhoangThoiGian(dongHo2);
        System.out.println("Khoảng thời gian giữa hai đồng hồ: " + khoangThoiGian);
    }
}
